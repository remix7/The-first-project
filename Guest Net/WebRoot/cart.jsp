<%@page import="ods.entity.goods"%>
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

		<title>购物车</title>

		<meta http-equiv="pragma" content="no-cache">
		<meta http-equiv="cache-control" content="no-cache">
		<meta http-equiv="expires" content="0">
		<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
		<meta http-equiv="description" content="This is my page">
		<link rel="stylesheet" type="text/css" href="css/style.css" />
		<link rel="stylesheet" type="text/css" href="css/cart.css" />

	</head>

	<body>
		<%Float total=0f;
			List<goods> gdlist = (List<goods>) session.getAttribute("gdlist");
		%>
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
					<li id="current">
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
				<div id="cart">
					购物车中的商品：
					<table style="width: 700px; border-collapse: collapse;" border="1">
						<tr>
							<th>
								名称
							</th>
							<th>
								数量
							</th>
							<th>
								市场价
							</th>
							<th>
								会员价
							</th>
							<th>
								删除
							</th>
						</tr>
						<%     
							for (int i = 0; i < gdlist.size(); i++) {
							goods gd=gdlist.get(i);
							total+=gd.getCount()*gd.getPrice2();
							
						%>
						<tr>
							<td>
								<%=gd.getDressname() %>
							</td>
							<td>
								&nbsp; <%=gd.getCount() %>
							</td>
							<td>
								<%=gd.getPrice2() %>
							</td>
							<td>
								&nbsp; <%=gd.getPrice1() %>
							</td>
							
							<td class='btn_delete'>
								<a href="deletecart?remove=<%=i %>&count=<%=gd.getCount() %>"></a>
							</td>
						</tr>

						<%
							}
							 out.println("总价："+total);
						%>
						
					</table>
					<div id="btns">
						<div id="goonbuy">
							<a href="index"></a>
						</div>
						<div id="gotopay">
							<a href="#"></a>
						</div>
						<div class="clear"></div>
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
