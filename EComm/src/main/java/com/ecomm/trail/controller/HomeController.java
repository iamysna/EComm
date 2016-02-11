package com.ecomm.trail.controller;

import java.security.Principal;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	
	@RequestMapping(value="/user", method = RequestMethod.GET)  
	 public String executeSecurityuser(ModelMap model, Principal principal ) {  
	  System.out.println("in user");  
	  model.addAttribute("author", "user");  
	  model.addAttribute("message", "Welcome To Login Form Based Spring Security Example!!!");  
	  return "index";  
	 }
	
	@RequestMapping(value="/admin", method = RequestMethod.GET)  
	 public String executeSecurityadmin(ModelMap model, Principal principal ) {  
	   
	 // String name = principal.getName();  
	  model.addAttribute("author", "admin");  
	  model.addAttribute("message", "Welcome To Login Form Based Spring Security Example!!!");  
	  return "index";  
	 } 
	   
	 @RequestMapping(value="/login", method = RequestMethod.GET)  
	 public String login(ModelMap model) {  
	   
	  return "login";  
	   
	 }  
	   
	 @RequestMapping(value="/fail2login", method = RequestMethod.GET)  
	 public String loginerror(ModelMap model) {  
	   
	  model.addAttribute("error", "true");  
	  return "login";  
	   
	 }  
	   
	 @RequestMapping(value="/logout", method = RequestMethod.GET)  
	 public String logout(ModelMap model) {  
	   
	  return "index";  
	   
	 }  
	
}
