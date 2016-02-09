package com.trail.project;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

@Transactional
public class productService {
	
	@Autowired
	private productDao pdao;

	public void setPdao(productDao pdao) {
		this.pdao = pdao;
	}
	
	@Transactional
	public void addProduct(Product product) {
		pdao.addProduct(product);
	}
	

}
