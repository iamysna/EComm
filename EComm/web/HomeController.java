package com.ecomm.web;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	
		/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Loginuser user, Map<String,Object> model) { 
	return "home";
		
	}
	@RequestMapping(value="/login" , method=RequestMethod.GET)
	public ModelAndView getLoginuPage()
	
	{
		Loginuser log=new Loginuser();
		return new ModelAndView("login","loginUser",log);
	}
	
	@RequestMapping(value="/admin" , method=RequestMethod.GET)
	public ModelAndView adminLoginuPage()
	
	{
		Loginuser log=new Loginuser();
		return new ModelAndView("adminlogin","loginadmin",log);
	}
	@RequestMapping(value="/reg" , method=RequestMethod.GET)
	public ModelAndView registation()
	
	{
		RegistationCus r=new RegistationCus();
		return new ModelAndView("customerreg","regist",r);
	}
	
}
