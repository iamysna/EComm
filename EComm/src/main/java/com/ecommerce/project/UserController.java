package com.ecommerce.project;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
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

	

}
