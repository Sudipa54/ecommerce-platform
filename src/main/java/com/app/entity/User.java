package com.app.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;



@Entity
public class User {

	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Id
	@Column(name = "user_id")
	private int uid;
	
	@Column(name = "email")
	private String email;
	
	@Column(name = "password")
	private String pwd;
	
	@Column(name = "username")
	private String uname;
	
	@Column(name ="status")
	private String status;

	
	//setters and getters
	
	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public int getUid() {
		return uid;
	}

	public void setUid(int uid) {
		this.uid = uid;
	}

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

	public User(int uid, String email, String pwd, String uname) {
		super();
		this.uid = uid;
		this.email = email;
		this.pwd = pwd;
		this.uname = uname;
	}

	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
