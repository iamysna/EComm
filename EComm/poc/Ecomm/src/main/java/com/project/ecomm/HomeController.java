package com.project.ecomm;


import java.util.Locale;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	
	//private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	@Autowired
	private RegisterDaoService rds;
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = {"/","/home"}, method = RequestMethod.GET)
	public String home() {
	  return "home";
	   }
	
	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public ModelAndView login(Locale locale, Model model) {
		
		return new ModelAndView("login","login",new LoginPojo());
	}
	
	@RequestMapping(value = "/Registration", method = RequestMethod.GET)
	public ModelAndView Registration(Locale locale, Model model) {
		
		return new ModelAndView("Registration","registration",new com.project.ecomm.RegistrationPojo());
	}
	
	@RequestMapping(value="/proceedRegister", method=RequestMethod.POST)
	public String addCustomer(@ModelAttribute("registration")com.project.ecomm.RegistrationPojo register, BindingResult result) {
		rds.addCustomer(register);
		return "redirect:/home";
	}
		
	/*@RequestMapping(value="/proceed", method=RequestMethod.POST)
	public String proceed(@ModelAttribute("login") Login login, BindingResult result, ServletResponse response,ModelAndView mv)
	{
		mv.addObject("uname", login.getUname());
		return "login";
	}*/
	
}
