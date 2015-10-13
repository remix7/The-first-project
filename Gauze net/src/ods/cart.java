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

			// 1 ��ȡ����ߵ�������Ǳ���Ĺ���
			int dressid = Integer.parseInt(request.getParameter("dressid"));
			System.out.println("��ȡ����dressid=" + dressid);

			// 2 ���鼮����Ϣ��װ�ɹ��ﳵ��Ҫ����Ϣ��ʽ�����뵽Session
			// ��װ�ɹ��ﳵ��Ҫ����Ϣ��ʽʹ���Զ�����ࣺgoods
			dbtools dt = new dbtools();// ʵ�������ݿ����ӹ���
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
					gd.setCount(1);// Ĭ��
				}
				// ���ܸ���ԭ�е�session������
				// ȥ�жϣ�session������û������Ϊ��gdlist����attribute
				HttpSession session = request.getSession();// ��servlet�У����붨��
				List<goods> gdlist = null;
				if (session.getAttribute("gdlist") != null) {
					// ԭ��������
					gdlist = (List<goods>) session.getAttribute("gdlist");
				} else {
					// ԭ��û��
					gdlist = new ArrayList<goods>();
				}

				// ��ӵ����ﳵ֮ǰ���ȼ���Ƿ�����ͬ��bookid
				boolean flag = false;// false��ʾû����ͬ
				for (int i = 0; i < gdlist.size(); i++) {
					if (gdlist.get(i).getDressid() == dressid) {
						gdlist.get(i).setCount(gdlist.get(i).getCount() + 1);
						flag = true;
					}
				}

				// �ж�flag�Ƿ��޸���
				if (!flag) {
					gdlist.add(gd);
				}

				session.setAttribute("gdlist", gdlist);

				// 3 ��ת��jsp����ʾ��ǰsession�����������Ʒ
				// ���ﳵ��Ϣ������session����requestû�й�ϵ
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
