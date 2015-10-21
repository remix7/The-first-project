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
import ods.entity.dresscategory;
import ods.entity.dressmaterial;

public class index extends HttpServlet {

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

		// 1.��ȡ���ݿ��������
		// 1.1 ����
		// 1.2������
		// 1.3�鼮����Ϣ

		// 2.����Ϣ����request attribute

		// 3.��request��Ϣ��ת��jspҳ��

		dbtools dt = new dbtools();// ʵ�������ݿ����ӹ���
		String server = "localhost";
		String dbname = "stu2012110516";
		String username = "root";
		String pwd = "root";
		try {
			dt.setConnection(server, dbname, username, pwd);

			// ��ȡ�û�ѡ��Ļ�ɴ���
			String cid = request.getParameter("cid");
			System.out.println("index.doGet()cid=" + cid);

			// ��ȡ�û�ѡ��Ļ�ɴ����
			String mid = request.getParameter("mid");

			// �ӽ������ȡ�����浽�б�
			List<dresscategory> bcList = new ArrayList<dresscategory>();

			{
				// ��ȡ����
				String sql = "SELECT id,dresscategory FROM stu2012110516.dresscategory";

				ResultSet rs = dt.executeQuery(sql);

				while (rs.next()) {

					dresscategory bc = new dresscategory();

					bc.setId(rs.getInt("id"));
					bc.setDresscategory(rs.getString("dresscategory"));

					bcList.add(bc);

				}
			}

			// ��ʼ��ȡ������
			List<dressmaterial> bpList = new ArrayList<dressmaterial>();
			{
				// ��ȡ����
				String sql = "SELECT id,dressmaterial FROM stu2012110516.dressmaterial  order by id desc";

				ResultSet rs = dt.executeQuery(sql);
				// �ӽ������ȡ�����浽�б�

				while (rs.next()) {

					dressmaterial bp = new dressmaterial();
					bp.setId(rs.getInt("id"));
					bp.setDressmaterial(rs.getString("dressmaterial"));

					bpList.add(bp);
				}
			}
			int ������ = 0;
			{
				// ��ȡ��ǰ��ʾ���ݵ�������
				String sql = "SELECT count(*) as total FROM stu2012110516.view_dress ";
				
				if (cid != null) {
					sql += "where dresscategoryid=" + cid;
				}
				if (mid != null) {
					sql += "where dressMaterialId=" + mid;
				}
				
				ResultSet rs = dt.executeQuery(sql);
				rs.next();
				������ = rs.getInt("total");

			}

			int ÿҳ��ʾ���� = 3;
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
				String sql = "SELECT  id, dressName,dressMaterialId, dressMaterial, dressStyle,dressCategoryId, dressPrice,dressListPrice, dressImage1, dressImage2, dressBrief,tprice,dressCategory  " + "  FROM stu2012110516.view_dress ";

				if (cid != null) {
					sql += "where dresscategoryid=" + cid;
				}
				if (mid != null) {
					sql += "where dressMaterialId=" + mid;
				}

				sql += " limit " + ��Ҫ���������� + "," + ÿҳ��ʾ����;

				ResultSet rs = dt.executeQuery(sql);
				// �ӽ������ȡ�����浽�б�

				while (rs.next()) {
					dress bk = new dress();
					bk.setId(rs.getInt("id"));	
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

			// ���б���Ϊһ�����ԣ����ӵ�request.     ////�����Ƿ������⣿
			request.setAttribute("bcList", bcList);
			request.setAttribute("bpList", bpList);
			request.setAttribute("dressList", dressList);
			request.setAttribute("totalpagenumber", ��ҳ��);
			request.setAttribute("currentpagenumber", ��ǰҳ��);

			// Я�����ԣ���ת��jspҳ��
			request.getRequestDispatcher("index.jsp").forward(request, response);

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
