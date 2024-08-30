package com.demo.dto;

public class User{
	private String userName;
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPasswod() {
		return passwod;
	}
	public void setPasswod(String passwod) {
		this.passwod = passwod;
	}
	private String email;
	private String passwod;
	public User(String userName, String email, String passwod) {
		super();
		this.userName = userName;
		this.email = email;
		this.passwod = passwod;
	}
	
}
