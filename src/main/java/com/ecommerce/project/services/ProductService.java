package com.ecommerce.project.services;

import java.util.List;

import com.ecommerce.project.domain.Product;



public interface ProductService {
	
	
	public Integer addProduct(Product product);
	public List viewProducts();

}
