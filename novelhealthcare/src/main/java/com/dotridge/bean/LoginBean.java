package com.dotridge.bean;

import java.io.Serializable;

public class LoginBean implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1741168369465614991L;
	private String userId;
	private String password;

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "LoginBean [userId=" + userId + ", password=" + password + "]";
	}
}
