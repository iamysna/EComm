package com.ecomm.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Handles requests for the application home page.
 */

public class Dummy {
	
		/**
	 * Simply selects the home view to render by returning its name.
	 */
	
	@RequestMapping(value="/login" , method=RequestMethod.GET)
	public String LoginPage()
	{
		Loginuser log=new Loginuser();
		if(log.getName().equals("admin") && log.getPwd().equals("admin"))
		{
			return "home";
		}
		else
		{
			return "login";
		}
	}
}
