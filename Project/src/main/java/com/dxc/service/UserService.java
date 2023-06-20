package com.dxc.service;

import com.dxc.exception.IncorrectPasswordException;
import com.dxc.exception.UserExistsException;
import com.dxc.exception.UserNotFoundException;
import com.dxc.model.User;
import com.dxc.model.UserCredential;

public interface UserService {
	public User registerUser(User user) throws UserExistsException;
	public UserCredential authenticateUser(int userId,String password) throws UserNotFoundException,IncorrectPasswordException;
	public User getUserById(int id);
	public void deleteUserById(int id);
	public User updateUser(User user);
}