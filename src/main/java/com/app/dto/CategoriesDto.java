package com.app.dto;

public class CategoriesDto {
  private Long categoryId;
  private String categoryName;
  
  
public CategoriesDto(Long categoryId, String categoryName) {
	super();
	this.categoryId = categoryId;
	this.categoryName = categoryName;
}
public Long getCategoryId() {
	return categoryId;
}
public void setCategoryId(Long categoryId) {
	this.categoryId = categoryId;
}
public String getCategoryName() {
	return categoryName;
}
public void setCategoryName(String categoryName) {
	this.categoryName = categoryName;
}


@Override
public String toString() {
	return "CategoriesDto [categoryId=" + categoryId + ", categoryName=" + categoryName + "]";
}
  
  
}
