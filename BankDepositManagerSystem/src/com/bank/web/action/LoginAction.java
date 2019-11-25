package com.bank.web.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;

import com.bank.domain.UserInfo;
import com.bank.service.UserFacade;
import com.bank.service.impl.UserFacadeImpl;


public class LoginAction {

	private String userNO;

	private String password;

	private UserFacade userFacade;

	public LoginAction() {
		userFacade = new UserFacadeImpl();
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getUserNO() {
		return userNO;
	}

	public void setUserNO(String userNO) {
		this.userNO = userNO;
	}

	public String login() {
		int flag;
		UserInfo user = new UserInfo();
		user.setUserNO(getUserNO());
		user.setPassword(getPassword());
		try {
			flag = userFacade.login(user);
			// flag==0˵�������ݿ��в�ѯ������ҳ���õ��ʺ�������ƥ��Ľ��
			if (flag == 0) {
				UserInfo userInfo = userFacade.selectUser(userNO);
				HttpServletRequest request = ServletActionContext.getRequest();
				HttpSession session = request.getSession();
				// ����¼�û���Ϣ����session
				session.setAttribute("user", userInfo);
				return "loginSuccess";
			} else if(flag == 1){
				//flag==0˵��δ��ѯ��ƥ����ʺ�����
				return "loginError";
			}else{
				return "haveWithdraw";
			}
			
		} catch (Exception e) {
			e.printStackTrace();
			return "Error";
		}
	}

	public String logout() {
		HttpServletRequest request = ServletActionContext.getRequest();
		HttpSession session = request.getSession();
		// ����session
		session.invalidate();
		return "logout";
	}
}

