package dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import constant.CommmonConstant;
import dao.UserDao;
import model.User;
import util.DBUtil;

public class UserDaoImpl implements UserDao {

	@Override
	public User get(String userName, String password) {
		Connection connection = null;
		PreparedStatement preparedStatement = null;
		ResultSet resultSet = null;
		User user = null;
		try {
//			Class.forName(CommmonConstant.DB_NAME);
//			connection = DriverManager.getConnection(CommmonConstant.DB_URL, CommmonConstant.DB_USER,
//					CommmonConstant.DB_PASSWORD);
			connection = DBUtil.getConnection();
			preparedStatement = connection.prepareStatement(CommmonConstant.SELECT_USER_BY_USER_NAME_AND_PASSWORD);
			preparedStatement.setString(1, userName);
			preparedStatement.setString(2, password);
			resultSet = preparedStatement.executeQuery();
			while (resultSet.next()) {
				user = new User();
				user.setUserName(resultSet.getString("user_name"));
			}
			
		} catch (Exception e) {
			throw new RuntimeException();
		} finally {
			try {
				resultSet.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			try {
				preparedStatement.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return user;
	}

}
