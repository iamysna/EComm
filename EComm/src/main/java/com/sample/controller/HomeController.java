package com.sample.controller;

import java.util.Locale;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.sample.dao.Products;
import com.sample.dao.UserDeatails;
import com.sample.dao.Users;
@Controller
public class HomeController{
	
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		return "home";
	}
	@RequestMapping(value = "/home-page", method = RequestMethod.GET)
	public  ModelAndView home() {
		 return new ModelAndView("home");  
	}
	
	@RequestMapping(value = "admin/products", method = RequestMethod.GET)  
	  public ModelAndView employee() {  
	    return new ModelAndView("admin/productForm", "command", new Products());  
	   }  
	      
	  @RequestMapping(value = "/addproduct", method = RequestMethod.POST)  
	  public String addEmployee(@ModelAttribute("SpringWeb")Products product, ModelMap model) {  
	     model.addAttribute("productId", product.getProductId());  
	     model.addAttribute("productName",product.getProductName());  
	     model.addAttribute("price",product.getPrice());  
	     model.addAttribute("description",product.getDescription());  
	     return "ProductFromDeatails";  
	   }
	  @RequestMapping(value = "/login", method = RequestMethod.GET)  
	  public ModelAndView UserLoginForm() {  
	    return new ModelAndView("login", "command", new Users());  
	   }  
	  @RequestMapping(value = "/register", method = RequestMethod.GET)  
	  public ModelAndView UserRegisterForm() {  
	    return new ModelAndView("customer/register", "command", new UserDeatails());  
	   }  
	  @RequestMapping(value = "/contactUs", method = RequestMethod.GET)  
	  public ModelAndView ContactUsForm() {  
	    return new ModelAndView("contactUs");  
	   }  
	  @RequestMapping(value = "/aboutUs", method = RequestMethod.GET)  
	  public ModelAndView aboutUsForm() {  
	    return new ModelAndView("aboutUs");  
	   }  
	  @RequestMapping(value = "/admin", method = RequestMethod.GET)  
	  public ModelAndView adminForm() {  
	    return new ModelAndView("admin/admin-home");  
	   } 
	  @RequestMapping(value = "/customer", method = RequestMethod.GET)  
	  public ModelAndView adminProductForm() {  
	    return new ModelAndView("customer/customer-homepage");  
	   } 
	  @RequestMapping(value = "/addproducts", method = RequestMethod.GET)  
	  public ModelAndView productForm() {  
	    return new ModelAndView("product");  
	   } 
	  @RequestMapping(value = "customer/profile", method = RequestMethod.GET)  
	  public ModelAndView UserProfile() {  
	    return new ModelAndView("customer/profile", "command", new Users());  
	  }
	  @RequestMapping(value = "customer/edit", method = RequestMethod.GET)  
	  public ModelAndView UserUpdateForm() {  
	    return new ModelAndView("customer/edit", "command", new UserDeatails());  
	   }

	
}
