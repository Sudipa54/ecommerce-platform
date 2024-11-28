package com.app.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;


@Entity

public class Products {

	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Id
	@Column(name = "pid")
	private int pid;
	
	@Column(name = "pname")
	private String pname;
	
	@Column(name = "quantity")
	private int quantity;
	
	@Column(name = "price")
	private double price;

	@Column(name = "description")
	private String description;

	@Column(name = "image")
	private String image;

	@Column(name ="status")
	private String status;
	
	public String getStatus() {
		return status;
	}


	public void setStatus(String status) {
		this.status = status;
	}


	//foreign key
	private int cid;

	
	//setters and getters

	
	public int getCid() {
		return cid;
	}


	public void setCid(int cid) {
		this.cid = cid;
	}
	
	
	public int getPid() {
		return pid;
	}


	public void setPid(int pid) {
		this.pid = pid;
	}


	public String getPname() {
		return pname;
	}


	public void setPname(String pname) {
		this.pname = pname;
	}


	public int getQuantity() {
		return quantity;
	}


	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}


	public double getPrice() {
		return price;
	}


	public void setPrice(double price) {
		this.price = price;
	}


	public String getDescription() {
		return description;
	}


	public void setDescription(String description) {
		this.description = description;
	}


	public String getImage() {
		return image;
	}


	public void setImage(String image) {
		this.image = image;
	}


	public Products(int pid, String pname, int quantity, double price, String description, String image, int cid) {
		super();
		this.pid = pid;
		this.pname = pname;
		this.quantity = quantity;
		this.price = price;
		this.description = description;
		this.image = image;
		this.cid = cid;
	}


	public Products() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	
	
}
