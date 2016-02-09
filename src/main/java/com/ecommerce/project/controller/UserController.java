package com.ecommerce.project.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.ecommerce.project.domain.Customer;
import com.ecommerce.project.domain.UserAuthentication;
import com.ecommerce.project.domain.UserRoles;
import com.ecommerce.project.services.UserService;
import com.ecommerce.project.services.UserServiceImpl;

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
		
		Customer customer=new Customer();
		customer.setUserName(userName);
		customer.setEmailId(emailId);
		
		customer.setAge(age);
		customer.setMobileNo1(mobileNo1);
		customer.setMobileNo2(mobileNo2);
		customer.setAddressLine1(addressLine1);
		customer.setAddressLine2(addressLine2);
		customer.setCity(city);
		customer.setState(state);
		customer.setCountry(country);
		customer.setZipCode(zipCode);
		
		UserAuthentication userAuthentication=new UserAuthentication();
		userAuthentication.setUserName(emailId);
		userAuthentication.setPassword(password);
		
		UserRoles userRoles=new UserRoles();
		userRoles.setUserName(emailId);
		userRoles.setUserRole("customer");
		UserService userService=new UserServiceImpl();
		Integer response=userService.registerCustomer(customer);
		
		if(response>0)
		{
			return new ModelAndView("success");
		}
		else
		{
		
		return new ModelAndView("failure");
	}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

	

}
