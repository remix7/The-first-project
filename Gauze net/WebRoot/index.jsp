<%@page import="ods.entity.dressmaterial"%>
<%@page import="ods.entity.dresscategory"%>
<%@page import="ods.entity.dress"%>
<%@ page language="java" import="java.util.*" pageEncoding="GB18030"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":"
			+ request.getServerPort() + path + "/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
	<head>
		<title>��ɴ��-��ҳҳ��</title>
		<link rel="stylesheet" type="text/css" href="css/style.css" />
		<link rel="stylesheet" href="css/indexstyle.css" type="text/css" />
		<link rel="stylesheet" type="text/css" href="css/menu_tree.css" />
		<script type="text/javascript">
	function toggleSub(div_id) {
		var sub1 = document.getElementById(div_id);
		if (sub1.style.display == "none") {
			sub1.style.display = "block";
		} else {
			sub1.style.display = "none";
		}
	}
</script>
	</head>

	<body>

		<div id="main">

			<div id="header">
				<div id="logo"></div>
			</div>
			<div id="menu">
				<div id="width170">
					&nbsp;
				</div>
				<ul>
					<li id="current">
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
					<%
						//System.out.println("session.username="+session.getAttribute("username"));
						if (session.getAttribute("username") != null) {
							out.println("��ǰ��¼�û�Ϊ��" + session.getAttribute("username"));
						}
					%>
				</div>
				<div class="clear"></div>
			</div>
			<div id="content_index">
				<div id="content_left">
					<div class="menutree"
						style="font-size: 20px; font-family: ΢���ź�; padding: 10px 0;">
						��ɴ����
					</div>
					<div class="menutree" onclick="toggleSub('menutree_sub1');">
						���
					</div>
					<div class="menutree_sub" id="menutree_sub1"
						style="display: block;">
						<ul>


							<%
								List<dresscategory> bcList = (List<dresscategory>) request.getAttribute("bcList");

								for (int i = 0; i < bcList.size(); i++) {

									out.println("<li><a href='index?cid=" + bcList.get(i).getId() + "'>"
											+ bcList.get(i).getDresscategory() + "</a></li>");
								}
							%>

						</ul>
					</div>
					<div class="menutree" onclick="toggleSub('menutree_sub2');">
						����
					</div>
					<div class="menutree_sub" id="menutree_sub2" style="display: none;">
						<ul>
							<%
								List<dressmaterial> bpList = (List<dressmaterial>) request.getAttribute("bpList");

								for (int i = 0; i < bpList.size(); i++) {

									out.println("<li><a href='index?mid=" + bpList.get(i).getId() + "'>"
											+ bpList.get(i).getDressmaterial() + "</a></li>");
								}
							%>
						</ul>
					</div>
					<div class="menutree" onclick="toggleSub('menutree_sub3');">
						�۸�
					</div>
					<div class="menutree_sub" id="menutree_sub3" style="display: none;">
						<ul>
							<li>
								<a href="#">1000��1500</a>
							</li>
							<li>
								<a href="#">1500��2000</a>
							</li>
							<li>
								<a href="#">2000��2500</a>
							</li>
							<li>
								<a href="#">2500��3000</a>
							</li>
							<li>
								<a href="#">3000��4000</a>
							</li>
							<li>
								<a href="#">4000��</a>
							</li>
						</ul>
					</div>
				</div>
				<div id="content_right">
					<div id="dresses">
						<%
							List<dress> dressList = (List<dress>) request.getAttribute("dressList");
							for (int i = 0; i < dressList.size(); i++) {

								dress bk = dressList.get(i);
								//System.out.println("jsp:id="+bk.getId());
						%>

						<hr />
						<div class="dress">
							<div class="dress_img">
								<a target="_blank" href="dressshow?dressid=<%=bk.getId()%>"> <img
										src="image/weddingdress/<%=bk.getDressImage2()%>.jpg" width="180"
										height="180" /> </a>
							</div>
							<div class="dress_intro">
								<div class="dress_title" title="<%=bk.getDressName()%>">
									<a href="dress.html"><%=bk.getDressName()%></a>
								</div>
								���ϣ�<%=bk.getDressMaterial()%>
								<br />
								��ɴ���<%=bk.getDressStyle()%>
								<br />
								
							</div>
							<div class="dress_price">
								<div class="dressPrice">
									�Ķ��ۣ���<%=bk.getDressPrice()%>
								</div>
								<div class="dressListPrice">
									ԭ�ۣ���<%=bk.getDressListPrice()%>
								</div>
								<a class="buy" href="cart?dressid=<%=bk.getId()%>"></a>
								<a class="collect" href="#"></a>
							</div>
							<div class="clear"></div>
						</div>


						<%
							}
						%>

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


						<hr />
						<div id="pageselector2">
							<a href="index?pn=<%=nextpagenumber%>">��һҳ</a><span><%=currentpagenumber%>/<%=totalpagenumber%></span><a
								href="index?pn=<%=prepagenumber%>">ǰһҳ</a>
							<div class="clear"></div>
						</div>
					</div>
				</div>
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
		</div>


	</body>
</html>
