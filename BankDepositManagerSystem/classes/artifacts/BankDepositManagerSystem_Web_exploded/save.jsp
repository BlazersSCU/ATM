<%@ page contentType="text/html; charset=GBK"%>
<%@ taglib prefix="s" uri="/struts-tags"%>

<html>
	<head>
		<title>���д������ϵͳ</title>
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
				margin-left:170px;
				margin-right:15px;
			}
			#bottom{
				margin-left:15px;
			}
		</style>
	</head>
<%@include file="check.jsp"%>
	<body>
		<div align="center">
			<br><br><br>
			 <form action="saveMoney" method="post">
			 	<table>
			 		<tr>
				 		<td><strong><font size="4">���������</font></strong><input type="text" name="money"></td>
				 	</tr>
				 	<tr>
				 		<td><input type="submit" value="ȷ��" id="top"></td>
				 		<td><input type="reset" value="����" id="bottom"></td>
				 	</tr>
			 	</table>
			 </form>
		</div>
	</body>
</html>