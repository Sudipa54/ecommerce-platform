package com.app.dto;


public class ProductDto {

	private String pname;
	
	private int quantity;
	
	private double price;

	private String description;

	private String image;

	
	//foreign key
	private int cid;


	
	//setters and getters
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


	public int getCid() {
		return cid;
	}


	public void setCid(int cid) {
		this.cid = cid;
	}


	public ProductDto(String pname, int quantity, double price, String description, String image, int cid) {
		super();
		this.pname = pname;
		this.quantity = quantity;
		this.price = price;
		this.description = description;
		this.image = image;
		this.cid = cid;
	}
	
	
}
