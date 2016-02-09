package com.spring.ecomm;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class MyController {
	
	@RequestMapping(value = "/")
	public String home() {
		return "home";
	}
	
	
	
	@RequestMapping(value = "/admin", method = RequestMethod.GET)
	public String admin() {
		return "admin";
	}
	
	@RequestMapping(value = "/admin", method = RequestMethod.POST)
	public String adminHome(Admin admin, Model model)
	{
		if(admin.getUsername().equalsIgnoreCase("admin") && admin.getPassword().equalsIgnoreCase("admin"))
		{
			model.addAttribute("userName", admin.getUsername());
			return "adminHome";
		}
		else
		{
			model.addAttribute("error", "Invalid Login Credentials, Please try again.");
			return "admin";
		}
	}
	
	
	
	
	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public String loginPage() {
		return "login";
	}
	
	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public String userHome(User user, Model model)
	{
		if(user.getUsername().equalsIgnoreCase("hanu") && user.getPassword().equalsIgnoreCase("hanu"))
		{
			model.addAttribute("userName", user.getUsername());
			return "userHome";
		}
		else
		{
			model.addAttribute("error", "Invalid Login Credentials, Please try again.");
			return "login";
		}
		
	}
	
	
	
	
	@RequestMapping(value = "/registerPage", method = RequestMethod.GET)
	public String registerPage() {
		return "registerPage";
	}
	
	@RequestMapping(value = "/registerSuccess", method = RequestMethod.POST)
	public String registerSuccess(User user, Model model)
	{
		model.addAttribute("username", user.getUsername());
		return "registerSuccess";
	}
	
	
	
	
	@RequestMapping(value = "/addProduct")
	public String addProduct()
	{
		return "addProduct";
	}
	
	@RequestMapping(value = "/addedProduct")
	public String addedProduct(Product product, Model model)
	{
		model.addAttribute("name", product.getName());
		return "addedProduct";
	}
	
	
	
	
	
	
	
	
	@RequestMapping(value = "/addBulkProduct")
	public String addBulkProduct()
	{
		return "addBulkProduct";
	}
	
	@RequestMapping(value = "/viewProduct")
	public String viewProduct()
	{
		return "viewProduct";
	}
	
}
