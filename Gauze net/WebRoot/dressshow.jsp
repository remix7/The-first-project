<%@page import="ods.entity.dress"%>
<%@ page language="java" import="java.util.*" pageEncoding="GB18030"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":"
			+ request.getServerPort() + path + "/";
%>
<%
	dress bk = (dress) request.getAttribute("bk");
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
	<head>
		<base href="<%=basePath%>">

		<title>婚纱详情页面——<%=bk.getDressName() %></title>

		<meta http-equiv="pragma" content="no-cache">
		<meta http-equiv="cache-control" content="no-cache">
		<meta http-equiv="expires" content="0">
		<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
		<meta http-equiv="description" content="This is my page">
		<link rel="stylesheet" type="text/css" href="css/style.css" />
		<link rel="stylesheet" type="text/css" href="css/cart.css" />
		<link rel="stylesheet" type="text/css" href="css/dress.css" />

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
					<li>
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
				<div class="dress">
					<div class="dress_img">
						<a href="#"> <img
								src="image/weddingdress/<%=bk.getDressImage1()%>.jpg" width="350"
								height="350" /> </a>
					</div>
					<div class="dress_intro">
						<div class="dress_title" title="<%=bk.getDressName()%>">
							<a href="#"><%=bk.getDressName()%></a>
						</div>
						材料：<%=bk.getDressMaterial()%>
						<br />
						婚纱风格：<%=bk.getDressStyle()%>
						<br />
						
						<div class="dress_price">
							<div class="dressPrice">
								心动价：￥<%=bk.getDressPrice()%>
							</div>
							<div class="dressListPrice">
								原价：￥<%=bk.getDressListPrice()%>
							</div>
							<div class="btns">
								<a class="buy" href="cart.jsp"></a><a class="collect" href="#"></a>
							</div>
						</div>

					</div>
					<div class="clear">
					</div>
					<div>
						<%=bk.getDressBrief()%>
					</div>
					<div class="clear">
					</div>
				</div>
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
