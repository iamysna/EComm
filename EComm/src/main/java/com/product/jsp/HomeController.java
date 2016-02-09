package com.product.jsp;

import java.nio.channels.SeekableByteChannel;
import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import javax.security.auth.login.Configuration;

import org.hibernate.SessionFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class HomeController {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		logger.info("Welcome home! The client locale is {}.", locale);
		
		
		return "home";
	}
		
		@RequestMapping(value = "login", method = RequestMethod.GET)
		public String login(Locale locale, Model model) {
		Loginuser loginuser=new Loginuser();
		model.addAttribute("loginUser",loginuser);
			
			return "login";
	}
		@RequestMapping(value="loginform",method=RequestMethod.POST)
		public ModelAndView gertLoginValues(@RequestParam("name") String name,@RequestParam("pwd") String pwd)
		
		{
		
			if (name.equals(pwd))
			{
				return new ModelAndView("success");
			}
			else
			{
			return new ModelAndView("failure");
			}
		}
		
	//-----------------------------------------------------	
		@RequestMapping(value = "register", method = RequestMethod.GET)
		public String register(Locale locale, Model model) {
			Customer customer=new Customer();
			model.addAttribute("custoMer",customer);
			
			return "register";
		}
			
//			@RequestMapping(value="registerform",method=RequestMethod.POST)
//public ModelAndView getRegisterValues(@RequestParam("custid") String custid,@RequestParam("firstname") String ,
//		@RequestParam("lastname") String lastname,@RequestParam("dob") String  dob,@RequestParam("gender") String gender,@RequestParam("email)
//	String email)
//			
//			{
//				
//				Configuration conf=new Configuratin();
//			    conf.bui
//				
//			}
//			
			
			
			
			
			@RequestMapping(value = "product", method = RequestMethod.GET)
			public String addProduct(Locale locale, Model model) {
				
				Productadd productadd=new Productadd();
				model.addAttribute("productAdd",productadd);
				return "product";
			}
			

			
			
			
			
//			@RequestMapping(value="productform",method=RequestMethod.POST)
//public ModelAndView getRegisterValues(@RequestParam("pid") String pid,@RequestParam("pname") String pname,
//		@RequestParam("description") String description,@RequestParam("price") int  price))
			//{
			
			//}
//					
			
			
	
}

