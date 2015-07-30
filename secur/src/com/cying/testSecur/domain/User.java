package com.cying.testSecur.domain;

public class User {
    
	private String username;
    
	private String password;
	
	private int enable;
	
	private String usernamecn;

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public int getEnable() {
		return enable;
	}

	public void setEnable(int enable) {
		this.enable = enable;
	}

	public String getUsernamecn() {
		return usernamecn;
	}

	public void setUsernamecn(String usernamecn) {
		this.usernamecn = usernamecn;
	}
}
