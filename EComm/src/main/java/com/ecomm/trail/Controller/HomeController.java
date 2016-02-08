package com.ecomm.trail.Controller;


import java.util.Locale;

import javax.servlet.ServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.ecomm.trail.forms.Login;
import com.ecomm.trail.forms.Registration;


/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	
	//private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = {"/","/home"}, method = RequestMethod.GET)
	public String home() {
	  return "home";
	   }
	
	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public ModelAndView login(Locale locale, Model model) {
		
		return new ModelAndView("login","login",new Login());
	}
	
	@RequestMapping(value = "/Registration", method = RequestMethod.GET)
	public ModelAndView Registration(Locale locale, Model model) {
		
		return new ModelAndView("Registration","registration",new Registration());
	}
	
	@RequestMapping(value="/proceedRegister", method=RequestMethod.POST)
	public String addCustomer(@ModelAttribute("registration")Registration register, BindingResult result) {
		
		return "redirect:/home";
	}
		
	/*@RequestMapping(value="/proceed", method=RequestMethod.POST)
	public String proceed(@ModelAttribute("login") Login login, BindingResult result, ServletResponse response,ModelAndView mv)
	{
		mv.addObject("uname", login.getUname());
		return "login";
	}*/
	
}
