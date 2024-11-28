package com.app.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.dto.ProductDto;
import com.app.entity.Products;
import com.app.service.impl.ProductServiceImpl;

import jakarta.websocket.server.PathParam;

@RestController
@RequestMapping("/api/product")
public class ProductController {

	@Autowired 
	private ProductServiceImpl serviceImpl;
	
//	public Products addProduct(ProductDto product)
//	{
//		Products pro = serviceImpl.addProduct(product);
//		if(pro != null)
//			return pro; 
//		else
//			
//	} 
	
	// Create a new product
	@PostMapping("/add")
	public ResponseEntity<?> createProduct(@RequestBody ProductDto product)
	{
		Products pro = serviceImpl.addProduct(product);
		if(pro != null)
			return new ResponseEntity(HttpStatus.OK).ok(pro);
		else
			return new ResponseEntity(HttpStatus.OK).ok("Product inserstion failed");
			
	}
	
	// Get all products
	@GetMapping("/all")
	public ResponseEntity<?> getAllProducts()
	{
		List<Products> allProducts;
		allProducts = serviceImpl.viewAllProducts();
		if(allProducts != null && !allProducts.isEmpty())
			return new ResponseEntity(HttpStatus.OK).ok(allProducts);
		else
			return new ResponseEntity(HttpStatus.OK).ok("Cannot fetch all products");
	
	}
	
	// Get product by ID
	@GetMapping("/{pid}")
	public ResponseEntity<?> getProduct(@PathVariable int pid)
	{
		Products productById;
		productById = serviceImpl.viewProduct(pid);
		if(productById != null)
			return new ResponseEntity(HttpStatus.OK).ok(productById);
		else
			return new ResponseEntity(HttpStatus.OK).ok("Cannot fetch the product id" + pid);
	
	}
	
	
	// Delete product by ID
	@DeleteMapping("/delete/{pid}")
	public String deleteProduct(@PathVariable int pid)
	{
		
		boolean isDeleted = serviceImpl.deleteProduct(pid); 
		
		if(isDeleted)
		{
			return "Record deleted Sucessfully";
		}
		else
			return "Record not deleted";
		
	}
}
