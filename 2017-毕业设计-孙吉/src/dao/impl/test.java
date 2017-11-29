package dao.impl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import constant.CommmonConstant;
import util.DBUtil;
import util.PropertyUtil;

public class test {
	public static void main(String[] args) {

		Connection connection = null;
		System.out.println(PropertyUtil.getValue("conf/pagination.properties", "pageSize"));
		System.out.println(PropertyUtil.getValue("conf/jdbc.properties", "url"));
//		try {
//			Class.forName(CommmonConstant.DB_NAME);
//		} catch (ClassNotFoundException e1) {
//			// TODO Auto-generated catch block
//			e1.printStackTrace();
//		}
//		try {
//			connection = DriverManager.getConnection(CommmonConstant.DB_URL, CommmonConstant.DB_USER,
//					CommmonConstant.DB_PASSWORD);
//		} catch (SQLException e1) {
//			// TODO Auto-generated catch block
//			e1.printStackTrace();
//		}
		connection = DBUtil.getConnection();
		try {
			PreparedStatement preparedStatement = connection.prepareStatement("select * from users");
			ResultSet resultSet = preparedStatement.executeQuery();
			while (resultSet.next()) {
				System.out.println(resultSet.getString(1));

			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			DBUtil.closeConnection();;
		}
		// Connection connection = null;
		// System.out.println(PropertyUtil.getValue(CommmonConstant.JDBC_PROPERTIES_PATH,
		// CommmonConstant.DB_NAME_KEY));
		// System.out.println(PropertyUtil.getValue(CommmonConstant.JDBC_PROPERTIES_PATH,
		// CommmonConstant.DB_URL_KEY));
		// try {
		// Class.forName(PropertyUtil.getValue(CommmonConstant.JDBC_PROPERTIES_PATH,
		// CommmonConstant.DB_NAME_KEY));
		// String url =
		// PropertyUtil.getValue(CommmonConstant.JDBC_PROPERTIES_PATH,
		// CommmonConstant.DB_URL_KEY);
		// String user =
		// PropertyUtil.getValue(CommmonConstant.JDBC_PROPERTIES_PATH,
		// CommmonConstant.DB_USER_KEY);
		// String password =
		// PropertyUtil.getValue(CommmonConstant.JDBC_PROPERTIES_PATH,
		// CommmonConstant.DB_PASSWORD_KEY);
		// connection = DriverManager.getConnection(url, user, password);
		// PreparedStatement preparedStatement =
		// connection.prepareStatement("select * from users");
		// ResultSet resultSet = preparedStatement.executeQuery();
		// while (resultSet.next()) {
		// System.out.println(resultSet.getString("user_name"));
		// }
		// } catch (Exception e) {
		// // TODO: handle exception
		// }
	}
}
