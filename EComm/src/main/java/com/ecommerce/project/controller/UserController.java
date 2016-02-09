package com.ecommerce.project.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

/**
 * 
 * @author Ravi
 * @since 8-2-2016
 * @version 1.0
 * 
 * this controller is used get the request from users and landing 
 * the corresponding pages
 *
 */


@Controller
public class UserController {
	
	@RequestMapping("login")
	public ModelAndView getLogin()
	{
		return new ModelAndView("login");
	}
	
	
	@RequestMapping("customerregistration")
	public ModelAndView getRegistrationPage()
	{
		return new ModelAndView("customerRegistration");
	}
	
	
	@RequestMapping(value="customerRegistration",method=RequestMethod.POST)
	public ModelAndView getRegistrationDetails(@RequestParam("userName") String userName,
			                                    @RequestParam("emailId") String emailId,
			                                    @RequestParam("password") String password,
			                                    @RequestParam("age") Integer age,
			                                    @RequestParam("mobileNo1") String mobileNo1,
			                                    @RequestParam("mobileNo2") String mobileNo2,
			                                    @RequestParam("addressLine1") String addressLine1,
			                                    @RequestParam("addressLine2") String addressLine2,
			                                    @RequestParam("city") String city,
			                                    @RequestParam("state") String state,
			                                    @RequestParam("country") String country,
			                                    @RequestParam("zipCCode") Integer zipCode)
	{
		
		
		
		
		
		return new ModelAndView();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

	

}
