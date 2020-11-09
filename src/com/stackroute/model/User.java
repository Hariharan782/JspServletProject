package com.stackroute.model;

public class User {
	private int code;
	private String userName;
	private String city;
	private String password;
	
	public User() {	
	}

	public User(int code, String userName, String city, String password) {
		super();
		this.code = code;
		this.userName = userName;
		this.city = city;
		this.password = password;
	}

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "User [code=" + code + ", userName=" + userName + ", city=" + city + ", password=" + password + "]";
	}
	
	
}
