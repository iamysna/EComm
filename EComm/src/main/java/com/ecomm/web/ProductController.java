package com.ecomm.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.ecomm.services.ProductService;
import com.ecomm.services.ProductServiceImpl;

@Controller
public class ProductController {
	@RequestMapping(value="productDetails",method=RequestMethod.POST)
	public ModelAndView getProductDetails(
											@RequestParam("productName") String productName,
											@RequestParam("description") String description,
											@RequestParam("price") Integer price)
	{	
		
		Productadd productadd=new Productadd();
		productadd.setPname(productName);
		productadd.setDescription(description);
		productadd.setPrice(price);
		
		ProductService productService=new ProductServiceImpl();
	Integer response=productService.saveProduct(productadd);
	
	if(response>0)
	{
		return new ModelAndView("productSuccess","responseProduct","you  are Successfully added with id :"+response);
	}
		
	else
	{
		return new ModelAndView("productFailure","responseProduct","you  are not Successfully added");

	}
	
	}

}
