<%@page import="ods.entity.dress"%>
<%@ page language="java" import="java.util.*" pageEncoding="GB18030"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
	<head>
		<title>�༭�鼮��Ϣ</title>
	</head>

	<body>
		<%
			dress bk = (dress) request.getAttribute("bk");
		%>
		<form action="fileuploadservlet" method="post"
			enctype="multipart/form-data">
			<input type="hidden" name="dressid" value="<%=bk.getId()%>"/>
			��ɴ����
			<input name="dressname" type="text" value="<%=bk.getDressName()%>"
				size="50" />
			<br />
			�۸�
			<input name="dressprice" type="text" value="<%=bk.getDressPrice()%>"
				size="50" />
			<br />
			ԭͼƬ��
			<br />
			<img src="image/weddingdress/<%=bk.getDressImage1()%>.jpg" width="200"
				height="200">
			<br />
			<input type="file" name="uploadfile" />
			<br />
			<input type="submit" value="�ϴ�" />


		</form>



	</body>
</html>
