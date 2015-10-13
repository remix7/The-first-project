package ods;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Iterator;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import ods.db.dbtools;
import ods.entity.dress;

import org.apache.commons.fileupload.FileUploadException;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;

public class fileuploadservlet extends HttpServlet {

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

		response.setContentType("text/html");
		response.setCharacterEncoding("gbk");
		PrintWriter out = response.getWriter();
		// 保持空，保存在根目录
		//String uploadfile = "";
		 String uploadfile = "/image/weddingdress";

		try {
			boolean isMultipart = ServletFileUpload.isMultipartContent(request);

			if (isMultipart) {
				// Create a factory for disk-based file items
				org.apache.commons.fileupload.FileItemFactory factory = new DiskFileItemFactory();

				// Create a new file upload handler
				ServletFileUpload upload = new ServletFileUpload(factory);
				upload.setHeaderEncoding("gbk");
				// Parse the request
				List items;

				items = upload.parseRequest(request);

				// Process the uploaded items
				Iterator iter = items.iterator();
				while (iter.hasNext()) {
					org.apache.commons.fileupload.FileItem item = (org.apache.commons.fileupload.FileItem) iter
							.next();

					if (item.isFormField()) {
						String name = item.getFieldName();
						String value = item.getString("gbk");
						out.println(name + "=" + value);
						// 记录
						request.setAttribute(name, value);

					} else {
						String fieldName = item.getFieldName();// file
						String fileName = item.getName();
						String contentType = item.getContentType();
						boolean isInMemory = item.isInMemory();
						long sizeInBytes = item.getSize();
						// 记录
						request.setAttribute(fieldName, fileName);

						out.println("上传的文件名是:" + fileName);

						if (fileName == null || fileName.length() == 0) {
							out.println("请选择一个文件来上传");
						} else {
							
							if (fileName.contains("\\")) {								
								
								fileName= fileName.substring(fileName.lastIndexOf("\\")+1,fileName.length());
							}
							
							String savefilepat = uploadfile + "/" + fileName;
							
							
							
							System.out.println("fileuploadservlet.doGet()fileName=" + fileName);

							java.io.FileOutputStream fout = new java.io.FileOutputStream(
									getServletContext().getRealPath(savefilepat));
							fout.write(item.get());
							fout.close();
						}
					}
				}
			} else {
				out.println("请用文件上传表单来访问这个页面");
			}
			// 跳转
			//request.getRequestDispatcher("result.jsp").forward(request,response);
			//直接保存到数据库
			dbtools dt = new dbtools();// 实例化数据库连接工具
			String server = "localhost";
			String dbname = "stu2012110516";
			String username = "root";
			String pwd = "root";
			try {
				dt.setConnection(server, dbname, username, pwd);
				String dressid=request.getAttribute("dressid").toString();
				String dressname=request.getAttribute("dressname").toString();
				float  dressprice=Float.parseFloat(request.getAttribute("dressprice").toString());
				String uploadfilename=request.getAttribute("uploadfile").toString();
				
				uploadfilename=uploadfilename.substring(0,uploadfilename.indexOf("."));
				
				
				
				String sql = "UPDATE dressdetail SET dressName = '"+dressname+"', dressPrice= "+dressprice+", dressImage1 = '"+uploadfilename+"'  WHERE id="+dressid;
				//System.out.println("fileuploadservlet.doGet(),sql="+sql);
				dt.executeUpdate(sql);
				
				response.sendRedirect("admindress");

				
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} finally {
				dt.closeAll();
			}
			
			
		} catch (FileUploadException e) {

			e.printStackTrace();
		} catch (Exception e) {

			e.printStackTrace();
		}
	}
/*
	private String getfilename(String filename) {
		// 判断filename中是否有'\'
		// 如果有，取最后一个'\'后面的内容
		// 如果没有，直接返回

		if (filename.contains("\\")) {
			//System.out.println("fileuploadservlet.getfilename(),yes");
			
			return filename.substring(filename.lastIndexOf("\\")+1,filename.length());
		} else {
			//System.out.println("fileuploadservlet.getfilename(),no");
			return filename;
		}

	}
	*/

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
