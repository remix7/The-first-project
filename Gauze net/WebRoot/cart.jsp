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

		<title>���ﳵ</title>

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
						<a href="index">��ҳ</a>
					</li>
					<li>
						<a href="login.jsp">��¼</a>
					</li>
					<li>
						<a href="register.jsp">ע��</a>
					</li>
					<li id="current">
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
				<div id="cart">
					���ﳵ�е���Ʒ��
					<table style="width: 700px; border-collapse: collapse;" border="1">
						<tr>
							<th>
								����
							</th>
							<th>
								����
							</th>
							<th>
								�г���
							</th>
							<th>
								��Ա��
							</th>
							<th>
								ɾ��
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
							 out.println("�ܼۣ�"+total);
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
