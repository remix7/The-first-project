package ods;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import ods.db.dbtools;
import ods.entity.goods;

public class cart extends HttpServlet {

	/**
	 * The doGet method of the servlet. <br>
	 * 
	 * This method is called when a form has its tag value method equals to get.
	 * 
	 * @param request
	 *            the request send by the client to the server
	 * @param response
	 *            the response send by the server to the client
	 * @throws ServletException
	 *             if an error occurred
	 * @throws IOException
	 *             if an error occurred
	 */
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		
		if (request.getParameter("dressid") == null) {
			response.sendRedirect("index");
		} else {

			// 1 读取浏览者点击的是那本书的购买
			int dressid = Integer.parseInt(request.getParameter("dressid"));
			System.out.println("读取到的dressid=" + dressid);

			// 2 把书籍的信息包装成购物车需要的信息格式，加入到Session
			// 包装成购物车需要的信息格式使用自定义的类：goods
			dbtools dt = new dbtools();// 实例化数据库连接工具
			String server = "localhost";
			String dbname = "stu2012110516";
			String username = "root";
			String pwd = "root";
			try {

				dt.setConnection(server, dbname, username, pwd);

				String sql = "SELECT id,dressname,dressprice, dresslistprice FROM stu2012110516.view_dress where id="
						+ dressid;

				ResultSet rs = dt.executeQuery(sql);

				goods gd = new goods();
				while (rs.next()) {
					gd.setDressid(rs.getInt("id"));
					gd.setDressname(rs.getString("dressname"));
					gd.setPrice1(rs.getFloat("dressprice"));
					gd.setPrice2(rs.getFloat("dresslistprice"));
					gd.setCount(1);// 默认
				}
				// 不能覆盖原有的session的内容
				// 去判断，session里面有没有名称为“gdlist”的attribute
				HttpSession session = request.getSession();// 在servlet中，必须定义
				List<goods> gdlist = null;
				if (session.getAttribute("gdlist") != null) {
					// 原来有内容
					gdlist = (List<goods>) session.getAttribute("gdlist");
				} else {
					// 原来没有
					gdlist = new ArrayList<goods>();
				}

				// 添加到购物车之前，先检测是否有相同的bookid
				boolean flag = false;// false表示没有相同
				for (int i = 0; i < gdlist.size(); i++) {
					if (gdlist.get(i).getDressid() == dressid) {
						gdlist.get(i).setCount(gdlist.get(i).getCount() + 1);
						flag = true;
					}
				}

				// 判断flag是否被修改了
				if (!flag) {
					gdlist.add(gd);
				}

				session.setAttribute("gdlist", gdlist);

				// 3 跳转到jsp，显示当前session里面的所有商品
				// 购物车信息保存在session，与request没有关系
				// response.sendRedirect("cart.jsp");
				request.getRequestDispatcher("cart.jsp").forward(request, response);

			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} finally {
				dt.closeAll();
			}
		}
	}

	/**
	 * The doPost method of the servlet. <br>
	 * 
	 * This method is called when a form has its tag value method equals to
	 * post.
	 * 
	 * @param request
	 *            the request send by the client to the server
	 * @param response
	 *            the response send by the server to the client
	 * @throws ServletException
	 *             if an error occurred
	 * @throws IOException
	 *             if an error occurred
	 */
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		doGet(request, response);
	}

}
