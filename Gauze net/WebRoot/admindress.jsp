<%@page import="ods.entity.dress"%>
<%@ page language="java" import="java.util.*" pageEncoding="GB18030"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
	<head>


		<title>����Ա������Ʒ��Ϣ��ҳ��</title>
		<link rel="stylesheet" type="text/css" href="css/style.css" />


	</head>

	<body>
		<table align=center border="1" style="border-collapse: collapse;">
			<tr>
				<td>
					��ɴid
				</td>
				<td>
					��ɴ����
				</td>
				<td>
					��ɴ����
				</td>
				<td>
					�༭��ɴ��Ϣ
				</td>
				<td>
					ɾ����ɴ��Ϣ
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
					<a href="editdress?dressid=<%=bk.getId()%>">�༭</a>
				</td>
				<td>
					<a href="deletedress?dressid=<%=bk.getId()%>">ɾ��</a>
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
							<a href="admindress?pn=<%=prepagenumber%>">ǰһҳ</a><span><%=currentpagenumber%>/<%=totalpagenumber%></span><a
								href="admindress?pn=<%=nextpagenumber%>">��һҳ</a>
							<div class="clear"></div>
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
		
		
		
		
	</body>
</html>
