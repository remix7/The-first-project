<%@ page language="java" import="java.util.*" pageEncoding="GB18030"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":"
			+ request.getServerPort() + path + "/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
	<head>
		<base href="<%=basePath%>">

		<title>��¼ҳ��</title>

		<meta http-equiv="pragma" content="no-cache">
		<meta http-equiv="cache-control" content="no-cache">
		<meta http-equiv="expires" content="0">
		<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
		<meta http-equiv="description" content="This is my page">
		<link rel="stylesheet" type="text/css" href="css/style.css" />

	</head>

	<body>
		<div id="main">
			<div id="header">
				<div id="logo">
				</div>
			</div>
			<div id="menu">
				<div id="width170">
					&nbsp;
				</div>
				<ul>
					<li>
						<a href="index">��ҳ</a>
					</li>
					<li id="current">
						<a href="login.jsp">��¼</a>
					</li>
					<li>
						<a href="register.jsp">ע��</a>
					</li>
					<li>
						<a href="cart.jsp">���ﳵ</a>
					</li>
					<li>
						<a href="adminlogin.jsp">����Ա��¼</a>
					</li>
				</ul>
				<div id="login_info">
				</div>
				<div class="clear">
				</div>
			</div>
			<div id="content">
				<fieldset>
					<legend>
						��¼ҳ��
					</legend>
					<div id="inputform">
						<form action="login" method="get" name="form1">
							�û�����
							<br />
							<input type="text" name="username" />
							<span id="chkUnInfo"></span>
							<br />
							���룺
							<br />
							<input type="password" name="password1" />
							<span id="chkPwd1Info"></span>
							<br />

							<span id="chkPwd2Info"></span>
							<br />
							<span id="chkPwd1Pwd2"></span>
							<br />
							<input type="submit" value="�ύ" />
							<input type="reset" value="����" />
						</form>
					</div>
				</fieldset>
			</div>
			<div id="footer">
				<hr />
				�Ĵ�ʦ����ѧ �������ѧѧԺ
				<br />
				ѧ�ţ�2012110516
				<br />
				��������ˬ
				<br />
				���£�2013.12.18
			</div>
		</div>
	</body>
</html>
