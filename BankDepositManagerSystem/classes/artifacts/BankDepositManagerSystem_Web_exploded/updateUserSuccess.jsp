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
		</style>
	</head>
	<body>
		<br>
		<br>
		<br>
		<br>
		<br>
		<br>
		<div align="center">
			<p>�޸���Ϣ�ɹ���������Ϣ���£�</p>
			<table border="1">
				<tr>
					<td>
						���룺
					</td>
					<td>
						<s:property value="userInfo.password" />
					</td>
				</tr>
				<tr>
					<td>
						��ϵ�绰��
					</td>
					<td>
						<s:property value="userInfo.tel" />
					</td>
				</tr>
				<tr>
					<td>
						��ס���У�
					</td>
					<td>
						<s:property value="userInfo.city" />
					</td>
				</tr>
				<tr>
					<td>
						��ϸ��ַ��
					</td>
					<td>
						<s:property value="userInfo.address" />
					</td>
				</tr>
			</table>
		</div>
	</body>
</html>
