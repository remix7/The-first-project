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

		<title>登录页面</title>

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
						<a href="index">首页</a>
					</li>
					<li id="current">
						<a href="login.jsp">登录</a>
					</li>
					<li>
						<a href="register.jsp">注册</a>
					</li>
					<li>
						<a href="cart.jsp">购物车</a>
					</li>
					<li>
						<a href="adminlogin.jsp">管理员登录</a>
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
						登录页面
					</legend>
					<div id="inputform">
						<form action="login" method="get" name="form1">
							用户名：
							<br />
							<input type="text" name="username" />
							<span id="chkUnInfo"></span>
							<br />
							密码：
							<br />
							<input type="password" name="password1" />
							<span id="chkPwd1Info"></span>
							<br />

							<span id="chkPwd2Info"></span>
							<br />
							<span id="chkPwd1Pwd2"></span>
							<br />
							<input type="submit" value="提交" />
							<input type="reset" value="重置" />
						</form>
					</div>
				</fieldset>
			</div>
			<div id="footer">
				<hr />
				四川师范大学 计算机科学学院
				<br />
				学号：2012110516
				<br />
				制作：梁爽
				<br />
				更新：2013.12.18
			</div>
		</div>
	</body>
</html>
