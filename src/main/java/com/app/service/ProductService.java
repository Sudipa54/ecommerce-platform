package com.app.service;

import java.util.List;

import com.app.dto.ProductDto;
import com.app.entity.Products;

public interface ProductService {
	
	Products addProduct(ProductDto product);
	
	List<Products> viewAllProducts();
	
	Products viewProduct(int pid);
	
	boolean deleteProduct(int pid);
	

}
