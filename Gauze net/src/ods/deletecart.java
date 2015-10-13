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
//购物车页面cart.jsp中图片'删除'的超链接传一个书的在数组的位置和书的数量到deletecart
//		<td class='btn_delete'>
//		<a href="deletecart?remove=<%=i %>&count=<%=gd.getCount() %>"></a>
//		</td>


		int remove = Integer.valueOf(request.getParameter("remove"));//接受书在gdlist中的位置 
		//int bookid = Integer.valueOf(request.getParameter("bookid"));//也可以是传书本的id过来

		int count = Integer.valueOf(request.getParameter("count"));//接受书的数量

		HttpSession session = request.getSession();
		List<goods> gdlist = (List<goods>) session.getAttribute("gdlist");
		
		for (int i = 0; i < gdlist.size(); i++) {
		if (i == remove) {//如果传书本的id过来条件则是bookid==gdlist.get(i).getCount().getBookid()
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
