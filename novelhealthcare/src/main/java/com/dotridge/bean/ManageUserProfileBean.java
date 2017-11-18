package com.dotridge.bean;

import java.io.Serializable;

public class ManageUserProfileBean implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -1340862724852365820L;
	private String firastName;
	private String lastName;
	private String email;
	private String userName;
	private String password;
	private String phoneNum;
	public String getFirastName() {
		return firastName;
	}
	public void setFirastName(String firastName) {
		this.firastName = firastName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getPhoneNum() {
		return phoneNum;
	}
	public void setPhoneNum(String phoneNum) {
		this.phoneNum = phoneNum;
	}
	@Override
	public String toString() {
		return "ManageUserProfileBean [firastName=" + firastName + ", lastName=" + lastName + ", email=" + email
				+ ", userName=" + userName + ", password=" + password + ", phoneNum=" + phoneNum + "]";
	}
	
}
