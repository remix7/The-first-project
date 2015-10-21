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

import ods.db.dbtools;
import ods.entity.dress;

public class admindress extends HttpServlet {

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

		dbtools dt = new dbtools();// ʵ�������ݿ����ӹ���
		String server = "localhost";
		String dbname = "stu2012110516";
		String username = "root";
		String pwd = "root";
		try {
			dt.setConnection(server, dbname, username, pwd);
			int ������ = 0;
			{
				// ��ȡ��ǰ��ʾ���ݵ�������
				String sql = "SELECT count(*) as total FROM stu2012110516.view_dress ";
				ResultSet rs = dt.executeQuery(sql);
				rs.next();
				������ = rs.getInt("total");

			}
			int ÿҳ��ʾ���� = 10;
			// �����Դ���

			int ��ǰҳ�� = 1;
			if (request.getParameter("pn") != null) {

				��ǰҳ��=Integer.parseInt(request.getParameter("pn"));
			}
			int ��Ҫ���������� = (��ǰҳ�� - 1) * ÿҳ��ʾ����;
			int ��ҳ�� = ������ / ÿҳ��ʾ����;
			if (��ҳ�� * ÿҳ��ʾ���� == ������) {
				// ��ͬ��û������
			} else {
				// ����һҳ
				��ҳ��++;
			}

			// ��ʼ��ȡ�鼮����Ϣ
			List<dress> dressList = new ArrayList<dress>();
			{
				// ��ȡ����
				String sql = "SELECT  id, dressName, dressMaterial,dressMaterialId, dressStyle,dressCategory,dressCategoryId, dressPrice,dressListPrice, dressImage1, dressImage2, dressBrief,tprice  " 
						+ "  FROM stu2012110516.view_dress limit "+ ��Ҫ���������� + "," + ÿҳ��ʾ����;


				ResultSet rs = dt.executeQuery(sql);
				// �ӽ������ȡ�����浽�б�

				while (rs.next()) {
					dress bk = new dress();
					bk.setId(rs.getInt("id"));
					// System.out.println("id="+rs.getInt("id"));
					bk.setDressName(rs.getString("dressName"));	
					bk.setDressMaterial(rs.getString("dressMaterial"));
					bk.setDressStyle(rs.getString("dressStyle"));				
					bk.setDressCategory(rs.getString("dressCategory"));//���ࡢ���
					bk.setDressCategoryId(rs.getInt("dressCategoryId"));			
					bk.setDressImage1(rs.getString("dressImage1"));
					bk.setDressImage2(rs.getString("dressImage2"));	
					bk.setDressPrice(rs.getFloat("dressPrice"));
					bk.setDressListPrice(rs.getFloat("dressListPrice"));
					bk.setDressBrief(rs.getString("dressBrief"));

					dressList.add(bk);

				}
			}
			request.setAttribute("dressList", dressList);
			request.setAttribute("totalpagenumber", ��ҳ��);
			request.setAttribute("currentpagenumber", ��ǰҳ��);


			// Я�����ԣ���ת��jspҳ��
			request.getRequestDispatcher("admindress.jsp").forward(request, response);
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

	//��ҳ
	
	//��ҳ
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