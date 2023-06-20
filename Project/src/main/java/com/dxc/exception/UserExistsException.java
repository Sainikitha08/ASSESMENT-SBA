package com.dxc.exception;


public class UserExistsException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public UserExistsException() {
		super();
	}

	public UserExistsException(String message) {
		super(message);
	}

	
}
