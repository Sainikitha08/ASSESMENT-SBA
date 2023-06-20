package com.dxc.model;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="user")
public class User {
	
	@Id
	private int userId;
	
	private String userName;
	private String userPassword;
	private String userMobileNumber;
	private String userAddedDate;
	
	public User() {

	}

	public User(int userId, String userName, String userPassword, String userMobileNumber, String userAddedDate) {

		this.userId = userId;
		this.userName = userName;
		this.userPassword = userPassword;
		this.userMobileNumber = userMobileNumber;
		this.userAddedDate = userAddedDate;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserPassword() {
		return userPassword;
	}

	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}

	public String getUserMobileNumber() {
		return userMobileNumber;
	}

	public void setUserMobileNumber(String userMobileNumber) {
		this.userMobileNumber = userMobileNumber;
	}

	public String getUserAddedDate() {
		return userAddedDate;
	}

	public void setUserAddedDate(String userAddedDate) {
		this.userAddedDate = userAddedDate;
	}

	@Override
	public String toString() {
		return "User [userId=" + userId + ", userName=" + userName + ", userPassword=" + userPassword
				+ ", userMobileNumber=" + userMobileNumber + ", userAddedDate=" + userAddedDate + "]";
	}
}
