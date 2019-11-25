package com.bank.service;

import java.sql.SQLException;

import com.bank.domain.UserInfo;


public interface UserFacade {
	/**
	 * ��¼ҵ��
	 * 
	 * @param user
	 *            ��¼��Ϣ����
	 * @return ��¼�ɹ���־
	 */
	int login(UserInfo user) throws SQLException;

	/**
	 * ע��ҵ��
	 * 
	 * @param user
	 *            ע����Ϣ����
	 */
	void registService(UserInfo user) throws SQLException;

	/**
	 * ��ѯ�����ʻ���Ϣ
	 * 
	 * @param userNO
	 *            ��ǰ��¼�û��ʺ�
	 * @return
	 */
	UserInfo selectUser(String userNO) throws SQLException;

	/**
	 * �޸ĸ����ʻ���Ϣ
	 * 
	 * @param user
	 * @param userNO
	 */
	void updateUserInfo(UserInfo user, String userNO) throws SQLException;

	/**
	 * ע�������ʻ�
	 * 
	 * @param userNO
	 */
	void deleteUserInfo(String userNO) throws SQLException;

	void withdrawUser(String userNO);
}

