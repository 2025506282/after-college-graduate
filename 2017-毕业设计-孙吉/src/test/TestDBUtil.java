package test;

import java.sql.Connection;
import java.sql.DriverManager;

public class TestDBUtil {

	// 数据库配置
	private static final String driver = "com.mysql.jdbc.Driver";
	private static final String url = "jdbc:mysql://localhost:3306/sunji";
	private static final String username = "root";
	private static final String password = "123456789";

	// 定义一个数据库连接
	private static Connection conn = null;

	// 获取连接
	public static Connection getConnection() {
		try {
			Class.forName(driver);
			conn = DriverManager.getConnection(url, username, password);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return conn;
	}

	// 关闭连接
	public static void closeConnection() {
		try {
			if (conn != null) {
				conn.close();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
