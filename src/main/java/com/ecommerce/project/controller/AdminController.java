package com.ecommerce.project.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.ecommerce.project.domain.Product;
import com.ecommerce.project.services.ProductService;
import com.ecommerce.project.services.ProductServiceImpl;

@Controller
public class AdminController {
	
	@RequestMapping(value="viewProducts",method=RequestMethod.GET)
	public String getViewProducts(HttpServletRequest httpServletRequest)
	{
		
	ProductService productService=new ProductServiceImpl();
	    List products=productService.viewProducts();
	 
	    Map<String, Object> map=new HashMap<String, Object>();
	    map.put("productResponse", products);
		httpServletRequest.getSession(false).setAttribute("productList",products);

		return "viewProduct";
		
	    
	    
	}

}
