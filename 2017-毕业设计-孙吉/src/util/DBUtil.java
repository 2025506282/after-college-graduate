package util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import constant.CommmonConstant;

public class DBUtil {
	private static ThreadLocal<Connection> connectionManager = new ThreadLocal<Connection>();
	// 获取连接
	public static Connection getConnection() {
		Connection connection = connectionManager.get();
		try {
			if (connection == null || connection.isClosed()) {
				Class.forName(PropertyUtil.getValue(CommmonConstant.JDBC_PROPERTIES_PATH, CommmonConstant.DB_NAME_KEY));
				String url = PropertyUtil.getValue(CommmonConstant.JDBC_PROPERTIES_PATH, CommmonConstant.DB_URL_KEY);
				String user = PropertyUtil.getValue(CommmonConstant.JDBC_PROPERTIES_PATH, CommmonConstant.DB_USER_KEY);
				String password = PropertyUtil.getValue(CommmonConstant.JDBC_PROPERTIES_PATH,
						CommmonConstant.DB_PASSWORD_KEY);
				connection = DriverManager.getConnection(url, user, password);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (Exception e) {
		} finally {
			connectionManager.set(connection);
		}
		return connection;
	}
	// 关闭连接
	public static void closeConnection() {
		Connection connection = connectionManager.get();
		try {
			if (connection != null && !connection.isClosed()) {
				connection.close();
				connectionManager.remove();
				connection = null;
			}
		} catch (SQLException e) {
		}
	}

}
