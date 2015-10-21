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

import ods.db.dbtools;

public class register extends HttpServlet {

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

		// 1.��ȡҳ���û��������Ϣ

		String username_input = request.getParameter("username");
		String password1 = request.getParameter("password1");
		String password2 = request.getParameter("password2");

		// 2.�����ݿ��в��ң��û����Ƿ��Ѿ�ע�᣿

		dbtools dt = new dbtools();// ʵ�������ݿ����ӹ���
		String server = "localhost";
		String dbname = "stu2012110516";
		String username = "root";
		String pwd = "root";
		try {

			dt.setConnection(server, dbname, username, pwd);

			String sql = "SELECT * FROM stu2012110516.userdetail where username='"
					+ username_input + "'";

			ResultSet rs = dt.executeQuery(sql);

			if (rs.next()) {
				// �Ѿ�ע��
				 System.out.println("register.doGet()�Ѿ�ע��");
				String tips = "�Ѿ�ע�ᣬ������û��������ԣ�";
				request.setAttribute("tips", tips);
				request.getRequestDispatcher("jump.jsp").forward(request, response);

			} else {
				// û��ע��
				// System.out.println("register.doGet()û��ע��");

				SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");// �������ڸ�ʽ
				Date now = new Date();
				String nowstring = df.format(now);

				String insertsql = "INSERT INTO `stu2012110516`.`userdetail` ( `username`, `userpassword`, `regtime`) VALUES ( '"
						+ username_input + "','" + password1 + "','" + nowstring + "' )";
				
				System.out.println("register.doGet(),insertsql="+insertsql);
				dt.executeUpdate(insertsql);
				
				response.sendRedirect("login.jsp");

			}

			// 2.1����Ѿ�ע�ᣬ��ʾ�������û�������ת����ҳ
			// 2.2���û��ע�ᣬ����Ϣ���뵽���ݿ⣬��ת����¼ҳ��
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
