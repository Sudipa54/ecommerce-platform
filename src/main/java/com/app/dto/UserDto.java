package com.app.dto;

import jakarta.persistence.Column;

public class UserDto {

	private String email;
	
	private String pwd;
	
	private String uname;

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	public String getUname() {
		return uname;
	}

	public void setUname(String uname) {
		this.uname = uname;
	}

	public UserDto(String email, String pwd, String uname) {
		super();
		this.email = email;
		this.pwd = pwd;
		this.uname = uname;
	}
	
}
