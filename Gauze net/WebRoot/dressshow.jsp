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

		<title>��ɴ����ҳ�桪��<%=bk.getDressName() %></title>

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
						<a href="index">��ҳ</a>
					</li>
					<li>
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
						���ϣ�<%=bk.getDressMaterial()%>
						<br />
						��ɴ���<%=bk.getDressStyle()%>
						<br />
						
						<div class="dress_price">
							<div class="dressPrice">
								�Ķ��ۣ���<%=bk.getDressPrice()%>
							</div>
							<div class="dressListPrice">
								ԭ�ۣ���<%=bk.getDressListPrice()%>
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
