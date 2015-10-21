package ods.db;

import java.sql.*;

public class dbtools {
	Connection conn = null;
	Statement st = null;
	ResultSet rs = null;

	/**
	 * �趨�������ݿ����Ϣ
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
	 * �ر�������Դ
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
	 * ִ�в�ѯ�����ؽ��
	 * 
	 * @param sql
	 *            ִ�еĲ�ѯ���
	 * @return �����(ResultSet)
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
	 * ִ��һ����䣬����Ҫ���ؽ�� ����һ���������ͣ�����Ӱ���������
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
