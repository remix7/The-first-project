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

		// 1.读取数据库里的内容
		// 1.1 种类
		// 1.2出版社
		// 1.3书籍的信息

		// 2.把信息加入request attribute

		// 3.带request信息跳转到jsp页面

		dbtools dt = new dbtools();// 实例化数据库连接工具
		String server = "localhost";
		String dbname = "stu2012110516";
		String username = "root";
		String pwd = "root";
		try {
			dt.setConnection(server, dbname, username, pwd);

			// 读取用户选择的婚纱风格
			String cid = request.getParameter("cid");
			System.out.println("index.doGet()cid=" + cid);

			// 读取用户选择的婚纱面料
			String mid = request.getParameter("mid");

			// 从结果集读取，保存到列表
			List<dresscategory> bcList = new ArrayList<dresscategory>();

			{
				// 读取数据
				String sql = "SELECT id,dresscategory FROM stu2012110516.dresscategory";

				ResultSet rs = dt.executeQuery(sql);

				while (rs.next()) {

					dresscategory bc = new dresscategory();

					bc.setId(rs.getInt("id"));
					bc.setDresscategory(rs.getString("dresscategory"));

					bcList.add(bc);

				}
			}

			// 开始读取出面料
			List<dressmaterial> bpList = new ArrayList<dressmaterial>();
			{
				// 读取数据
				String sql = "SELECT id,dressmaterial FROM stu2012110516.dressmaterial  order by id desc";

				ResultSet rs = dt.executeQuery(sql);
				// 从结果集读取，保存到列表

				while (rs.next()) {

					dressmaterial bp = new dressmaterial();
					bp.setId(rs.getInt("id"));
					bp.setDressmaterial(rs.getString("dressmaterial"));

					bpList.add(bp);
				}
			}
			int 总数量 = 0;
			{
				// 读取当前显示内容的总数量
				String sql = "SELECT count(*) as total FROM stu2012110516.view_dress ";
				
				if (cid != null) {
					sql += "where dresscategoryid=" + cid;
				}
				if (mid != null) {
					sql += "where dressMaterialId=" + mid;
				}
				
				ResultSet rs = dt.executeQuery(sql);
				rs.next();
				总数量 = rs.getInt("total");

			}

			int 每页显示数量 = 3;
			// 保护性代码

			int 当前页码 = 1;
			if (request.getParameter("pn") != null) {

				当前页码=Integer.parseInt(request.getParameter("pn"));
			}
			int 需要跳过的数量 = (当前页码 - 1) * 每页显示数量;
			int 总页码 = 总数量 / 每页显示数量;
			if (总页码 * 每页显示数量 == 总数量) {
				// 相同，没有余数
			} else {
				// 还有一页
				总页码++;
			}

			// 开始读取书籍的信息
			List<dress> dressList = new ArrayList<dress>();
			{
				// 读取数据
				String sql = "SELECT  id, dressName,dressMaterialId, dressMaterial, dressStyle,dressCategoryId, dressPrice,dressListPrice, dressImage1, dressImage2, dressBrief,tprice,dressCategory  " + "  FROM stu2012110516.view_dress ";

				if (cid != null) {
					sql += "where dresscategoryid=" + cid;
				}
				if (mid != null) {
					sql += "where dressMaterialId=" + mid;
				}

				sql += " limit " + 需要跳过的数量 + "," + 每页显示数量;

				ResultSet rs = dt.executeQuery(sql);
				// 从结果集读取，保存到列表

				while (rs.next()) {
					dress bk = new dress();
					bk.setId(rs.getInt("id"));	
					bk.setDressName(rs.getString("dressName"));	
					bk.setDressMaterial(rs.getString("dressMaterial"));
					bk.setDressStyle(rs.getString("dressStyle"));				
					bk.setDressCategory(rs.getString("dressCategory"));//种类、类别
					bk.setDressCategoryId(rs.getInt("dressCategoryId"));			
					bk.setDressImage1(rs.getString("dressImage1"));
					bk.setDressImage2(rs.getString("dressImage2"));	
					bk.setDressPrice(rs.getFloat("dressPrice"));
					bk.setDressListPrice(rs.getFloat("dressListPrice"));
					bk.setDressBrief(rs.getString("dressBrief"));
					

					dressList.add(bk);

					
					
				}
			}

			// 把列表作为一个属性，附加到request.     ////这里是否有问题？
			request.setAttribute("bcList", bcList);
			request.setAttribute("bpList", bpList);
			request.setAttribute("dressList", dressList);
			request.setAttribute("totalpagenumber", 总页码);
			request.setAttribute("currentpagenumber", 当前页码);

			// 携带属性，跳转到jsp页面
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
