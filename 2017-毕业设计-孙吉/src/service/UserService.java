package service;

import exception.ParameterException;
import model.User;

public interface UserService {
	public User login(String userName, String password) throws ParameterException ;
}
