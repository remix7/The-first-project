<%@page import="ods.entity.dress"%>
<%@ page language="java" import="java.util.*" pageEncoding="GB18030"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
	<head>


		<title>管理员管理商品信息的页面</title>
		<link rel="stylesheet" type="text/css" href="css/style.css" />


	</head>

	<body>
		<table align=center border="1" style="border-collapse: collapse;">
			<tr>
				<td>
					婚纱id
				</td>
				<td>
					婚纱名称
				</td>
				<td>
					婚纱材质
				</td>
				<td>
					编辑婚纱信息
				</td>
				<td>
					删除婚纱信息
				</td>

			</tr>
			<%
				List<dress> dressList = (List<dress>) request.getAttribute("dressList");
				for (int i = 0; i < dressList.size(); i++) {
					dress bk = dressList.get(i);
			%>
			<tr>
				<td>
					<%=bk.getId()%>
				</td>
				<td>
					<%=bk.getDressName()%>
				</td>
				<td>
					<%=bk.getDressMaterial()%>
				</td>
				<td>
					<a href="editdress?dressid=<%=bk.getId()%>">编辑</a>
				</td>
				<td>
					<a href="deletedress?dressid=<%=bk.getId()%>">删除</a>
				</td>

			</tr>



			<%
				}
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
			
			

		</table>
		<%
							int totalpagenumber = Integer.parseInt(request.getAttribute("totalpagenumber")
									.toString());
							int currentpagenumber = Integer.parseInt(request.getAttribute("currentpagenumber")
									.toString());
							int nextpagenumber = currentpagenumber + 1;
							int prepagenumber = currentpagenumber - 1;

							if (nextpagenumber > totalpagenumber) {
								nextpagenumber = totalpagenumber;
							}

							if (prepagenumber < 1) {
								prepagenumber = 1;
							}
						%>
						<div id="yema" align=center>
							<a href="admindress?pn=<%=prepagenumber%>">前一页</a><span><%=currentpagenumber%>/<%=totalpagenumber%></span><a
								href="admindress?pn=<%=nextpagenumber%>">后一页</a>
							<div class="clear"></div>
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
		
		
		
		
	</body>
</html>
