package ods;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import ods.entity.goods;

public class deletecart extends HttpServlet {

	/**
	 * The doGet method of the servlet. <br>
	 *
	 * This method is called when a form has its tag value method equals to get.
	 * 
	 * @param request the request send by the client to the server
	 * @param response the response send by the server to the client
	 * @throws ServletException if an error occurred
	 * @throws IOException if an error occurred
	 */
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
//���ﳵҳ��cart.jsp��ͼƬ'ɾ��'�ĳ����Ӵ�һ������������λ�ú����������deletecart
//		<td class='btn_delete'>
//		<a href="deletecart?remove=<%=i %>&count=<%=gd.getCount() %>"></a>
//		</td>


		int remove = Integer.valueOf(request.getParameter("remove"));//��������gdlist�е�λ�� 
		//int bookid = Integer.valueOf(request.getParameter("bookid"));//Ҳ�����Ǵ��鱾��id����

		int count = Integer.valueOf(request.getParameter("count"));//�����������

		HttpSession session = request.getSession();
		List<goods> gdlist = (List<goods>) session.getAttribute("gdlist");
		
		for (int i = 0; i < gdlist.size(); i++) {
		if (i == remove) {//������鱾��id������������bookid==gdlist.get(i).getCount().getBookid()
			if(gdlist.get(i).getCount()>1)gdlist.get(i).setCount(gdlist.get(i).getCount() - 1);
			else if(gdlist.get(i).getCount()==1) gdlist.remove(i);
		}
			}
		session.setAttribute("gdlist", gdlist);
		response.sendRedirect("cart.jsp");
		}
	/**
	 * The doPost method of the servlet. <br>
	 *
	 * This method is called when a form has its tag value method equals to post.
	 * 
	 * @param request the request send by the client to the server
	 * @param response the response send by the server to the client
	 * @throws ServletException if an error occurred
	 * @throws IOException if an error occurred
	 */
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		doGet(request,response);
	}

}
