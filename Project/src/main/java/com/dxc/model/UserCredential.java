package com.dxc.model;


public class UserCredential {

	private int userId;
	private String userPassword;
	
	public UserCredential() {

	}

	public UserCredential(int userId, String userPassword) {
		this.userId = userId;
		this.userPassword = userPassword;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getUserPassword() {
		return userPassword;
	}

	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}

	@Override
	public String toString() {
		return "UserCredential [userId=" + userId + ", userPassword=" + userPassword + "]";
	}
}
