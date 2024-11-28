package com.app.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.dto.ProductDto;
import com.app.entity.Products;
import com.app.repo.ProductRepo;
import com.app.service.ProductService;
 

@Service
public class ProductServiceImpl implements ProductService {

	@Autowired
	private ProductRepo productImpl;
	
	
	@Override
	public Products addProduct(ProductDto product) {
		
		//create entity class object to store data from DTO
		Products pro = new Products();
		BeanUtils.copyProperties(product, pro); 
		
		pro.setStatus("Active");
		Products saveProduct = productImpl.save(pro);
		return saveProduct;
	}

	@Override
	public List<Products> viewAllProducts() {
		
		return productImpl.findAll();
	}

	@Override
	public Products viewProduct(int pid) {

		Optional <Products> productById = productImpl.findById(pid);
		Products product = null;

		if(productById.isPresent())
		{
			product = productById.get();
		}
		return product;
	}

	@Override
	public boolean deleteProduct(int pid) {
		boolean flag = false;
		Products product;
		product = productImpl.findById(pid).get();
		
		if(product != null)
		{
			product.setStatus("INACTIVE");
			productImpl.deleteById(product.getPid());
			flag = true;
			
		}
		return flag;
	}

}
