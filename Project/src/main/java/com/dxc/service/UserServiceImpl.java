package com.dxc.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dxc.exception.IncorrectPasswordException;
import com.dxc.exception.UserExistsException;
import com.dxc.exception.UserNotFoundException;
import com.dxc.model.User;
import com.dxc.model.UserCredential;
import com.dxc.repository.UserRepository;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserRepository repo;

	public User registerUser(User user) throws UserExistsException {
		final boolean existById = this.repo.existsById(user.getUserId());
		if (existById) {
			throw new UserExistsException("User Already Exists");
		}
		return this.repo.save(user);
	}

	public UserCredential authenticateUser(int userId, String password) throws UserNotFoundException, IncorrectPasswordException {
		final Optional<User> optionalUser = this.repo.findByUserIdAndUserPassword(userId, password);
		if (optionalUser.isEmpty()) {
			throw new UserNotFoundException("User Not Found");
		}
		UserCredential u = new UserCredential(userId, password);
		return u;
	}

	public User getUserById(int id) {
		Optional<User> u = repo.findById(id);

		if (u.isPresent())
			return u.get();

		return null;
	}

	public void deleteUserById(int id) {
		Optional<User> u = repo.findById(id);

		if (u.isPresent()) {
			repo.deleteById(id);
			return;
		} else {
			System.out.println("No Such user");
		}
	}

	public User updateUser(User user) {
		Optional<User> u = repo.findById(user.getUserId());
		
		if(u.isPresent()) {
			repo.save(user);
			return user;
		} else {
			System.out.println("No such user exists");
			return null;
		}
	}

}
