package ods.db;

import java.sql.*;

public class dbtools {
	Connection conn = null;
	Statement st = null;
	ResultSet rs = null;

	/**
	 * 设定链接数据库的信息
	 * 
	 * @param server
	 * @param dbname
	 * @param username
	 * @param pwd
	 * @throws ClassNotFoundException
	 * @throws SQLException
	 */
	public void setConnection(String server, String dbname, String username, String pwd)
			throws ClassNotFoundException, SQLException {
		String driver = "";
		String dburl = "";
		pwd="root";
		driver = "com.mysql.jdbc.Driver";
		dburl = "jdbc:mysql://" + server + ":3306/" + dbname + "?user=" + username + "&password="
				+ pwd;
		Class.forName(driver);
		conn = DriverManager.getConnection(dburl);
	}

	/**
	 * 关闭链接资源
	 */
	public void closeAll() {
		if (rs != null) {
			try {
				rs.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		if (st != null) {
			try {
				st.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		if (conn != null) {
			try {
				conn.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

	/**
	 * 执行查询，返回结果
	 * 
	 * @param sql
	 *            执行的查询语句
	 * @return 结果集(ResultSet)
	 */
	public ResultSet executeQuery(String sql) {
		try {

			st = conn.createStatement();
			rs = st.executeQuery(sql);
		} catch (Exception e) {

			e.printStackTrace();
		}
		return rs;
	}

	/**
	 * 执行一个语句，不需要返回结果 返回一个整数类型，（受影响的行数）
	 * 
	 * @param sql
	 * @return
	 */
	public int executeUpdate(String sql) {
		int num = 0;
		try {
			st = conn.createStatement();
			num = st.executeUpdate(sql);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return num;
	}
}
