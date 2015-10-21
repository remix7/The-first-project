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

		// 1.��ȡҳ�����Ա�������Ϣ

		String adminusername_input = request.getParameter("adminusername");
		String password1 = request.getParameter("password1");

		// 2.�����ݿ��в��ң���Ϣ�Ƿ���ȷ��
		// 2.1 ��ȷ����¼�û��Ѿ���¼����¼��session����ת����ҳ
		// 2.2 ����ȷ�����µ�¼����תlogin.jsp��

		dbtools dt = new dbtools();// ʵ�������ݿ����ӹ���
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
				// ��Ϣ��ȷ
				HttpSession session=request.getSession();//��ʼ��session����
				
				session.removeAttribute("adminusername");
				session.setAttribute("adminusername", adminusername_input);
				response.sendRedirect("admindress");//Ӧ��ת������ҳ��
				
			} else {
				// ��Ϣ����
				System.out.println("adminlogin.doGet(),��¼����");
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
