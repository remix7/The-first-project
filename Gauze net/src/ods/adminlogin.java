package ods;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import ods.db.dbtools;

public class adminlogin extends HttpServlet {

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

		// 1.读取页面管理员输入的信息

		String adminusername_input = request.getParameter("adminusername");
		String password1 = request.getParameter("password1");

		// 2.在数据库中查找，信息是否正确？
		// 2.1 正确，记录用户已经登录，记录到session，跳转回首页
		// 2.2 不正确，重新登录（跳转login.jsp）

		dbtools dt = new dbtools();// 实例化数据库连接工具
		String server = "localhost";
		String dbname = "stu2012110516";
		String username = "root";
		String pwd = "root";
		try {

			dt.setConnection(server, dbname, username, pwd);

			String sql = "SELECT * FROM stu2012110516.adminuser where adminusername='"
					+ adminusername_input + "' and adminuserpassword='" + password1 + "'";
			System.out.println("sql="+sql);

			ResultSet rs = dt.executeQuery(sql);

			if (rs.next()) {
				// 信息正确
				HttpSession session=request.getSession();//初始化session对象
				
				session.removeAttribute("adminusername");
				session.setAttribute("adminusername", adminusername_input);
				response.sendRedirect("admindress");//应该转到管理页面
				
			} else {
				// 信息错误
				System.out.println("adminlogin.doGet(),登录错误！");
				response.sendRedirect("adminlogin.jsp");
			}

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
