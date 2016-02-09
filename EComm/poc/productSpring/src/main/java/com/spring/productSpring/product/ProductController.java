package com.spring.productSpring.product;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

/**
 * Handles requests for the application home page.
 */
@Controller
public class ProductController {
	
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	
	 @RequestMapping(value = "/product", method = RequestMethod.GET)
	   public ModelAndView product() {
		 Product pro = new Product();
	      return new ModelAndView("product", "add", pro);
	   }
	 
	 @RequestMapping(value = "/addProduct", method = RequestMethod.POST)
	   public String addProduct(@ModelAttribute("SpringWeb")Product product,ModelMap model) {
	      model.addAttribute("ID", product.getProductId());
	      model.addAttribute("Name", product.getProductName());
	      model.addAttribute("Category", product.getPrice());
	      model.addAttribute("Price", product.getCategory());
	      return "result";
	   }
	 
}
