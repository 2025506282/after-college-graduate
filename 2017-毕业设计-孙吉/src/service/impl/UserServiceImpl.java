package service.impl;

import org.eclipse.jdt.internal.compiler.ast.ThrowStatement;

import constant.CommmonConstant;
import dao.UserDao;
import dao.impl.UserDaoImpl;
import exception.ParameterException;
import model.User;
import service.UserService;
import util.StringUtil;

public class UserServiceImpl implements UserService {
	UserDao userDao = new UserDaoImpl();
	User user = null;
	@Override
	public User login(String userName, String password) throws ParameterException {
		// TODO Auto-generated method stub
		if (StringUtil.isNull(userName) || StringUtil.isNull(password)) {
			throw new ParameterException(CommmonConstant.PARAMETER_IS_WRONG);
		}
		user = (User)userDao.get(userName, password);
		if (user == null) {
			throw new ParameterException(CommmonConstant.PARAMETER_IS_WRONG);
		}
		return user;
	}

}
