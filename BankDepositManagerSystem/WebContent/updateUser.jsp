<%@ page contentType="text/html; charset=GBK"%>
<%@ taglib prefix="s" uri="/struts-tags"%>

<html>
	<head>
		<style type="text/css">
			body{
	    		margin:0;
	    		padding:0;
	    		background:url(image/background.jpg);
	    	}
	    	tr{
			    display:block; /*��tr����Ϊ����Ԫ��*/
			    margin:10px 0;  /*����tr���Ϊ10px*/
			}
			#top{
				margin-left:107px;
				margin-right:15px;
			}
			#bottom{
				margin-left:15px;
			}
		</style>
	</head>
	<%@include file="check.jsp"%>
	<body>
		<br>
		<br>
		<br>
		<br>
		<br>
		<div align="center">
		 	<form action="updateUser" method="post">
		 		<table>
		 			<tr>
		 				<td>�û��ʺţ�<s:property value="#session.user.userNO" /></td>
		 			</tr>
		 			<tr>
		 				<td>�û����룺<input type="password" name="userInfo.password"></td>
		 			</tr>
		 			<tr>
		 				<td>��ϵ�绰��<input type="text" name="userInfo.tel"></td>
		 			</tr>
		 			<tr>
		 				<td>��ס���У�<input type="text" name="userInfo.city"></td>
		 			</tr>
		 			<tr>
		 				<td>��ϸ��ַ��<input type="text" name="userInfo.address"></td>
		 			</tr>
		 			<tr>
		 				<td><input type="submit" value="�ύ" id="top"></td>
		 				<td><input type="reset" value="����" id="bottom"></td>
		 			</tr>
		 		</table>
		 	</form>
		</div>
	</body>
</html>
