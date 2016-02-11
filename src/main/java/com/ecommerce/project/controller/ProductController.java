package com.ecommerce.project.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.ecommerce.project.domain.Product;
import com.ecommerce.project.services.ProductService;
import com.ecommerce.project.services.ProductServiceImpl;

@Controller
public class ProductController {
	
	@RequestMapping(value="addProduct")
	public ModelAndView getProductPage()
	{
		
      return new ModelAndView("product");
	}
	
	@RequestMapping(value="productDetails", method=RequestMethod.POST)
	public ModelAndView getProductDetails(@RequestParam("productName") String productName,
			                              @RequestParam("description") String description,
			                              @RequestParam("price") Double price)
	
	
	{
		Product product=new Product();
		product.setProductName(productName);
		product.setDescription(description);
		product.setPrice(price);
		
		ProductService productService=new ProductServiceImpl();
Integer responseProduct=productService.addProduct(product);

if(responseProduct>0)
{
	return new ModelAndView("addProductSuccess","responseProduct","you are Successfully added Product To Database and your Product Id is:"+responseProduct);
	}
else
{
	return new ModelAndView("addProductFailure","responseProduct","you are not Successfully added Product To Database "+responseProduct);

}

}
}