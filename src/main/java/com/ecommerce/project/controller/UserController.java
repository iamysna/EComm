package com.ecommerce.project.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.ecommerce.project.domain.User;
import com.ecommerce.project.services.UserService;
import com.ecommerce.project.services.UserServiceImpl;

/**
 * 
 * @author Ravi
 * @since 8-2-2016
 * @version 1.0 O this controller is used get the request from users and landing
 *          the corresponding pages
 *
 */

@Controller
public class UserController {

	@RequestMapping("login")
	public ModelAndView getLogin() {
		return new ModelAndView("login");
	}

	@RequestMapping("customerregistration")
	public ModelAndView getRegistrationPage() {
		return new ModelAndView("customerRegistration");
	}

	@RequestMapping(value = "customerRegistration", method = RequestMethod.POST)
	public ModelAndView getRegistrationDetails(@RequestParam("userName") String userName,
			@RequestParam("emailId") String emailId, @RequestParam("password") String password,
			@RequestParam("age") Integer age, @RequestParam("mobileNo1") String mobileNo1,
			@RequestParam("mobileNo2") String mobileNo2, @RequestParam("addressLine1") String addressLine1,
			@RequestParam("addressLine2") String addressLine2, @RequestParam("city") String city,
			@RequestParam("state") String state, @RequestParam("country") String country,
			@RequestParam("zipCode") Integer zipCode) {

		User user = new User();

		user.setUserName(userName);
		user.setEmailId(emailId);

		user.setAge(age);
		user.setMobileNo1(mobileNo1);
		user.setMobileNo2(mobileNo2);
		user.setAddressLine1(addressLine1);
		user.setAddressLine2(addressLine2);
		user.setCity(city);
		user.setState(state);
		user.setCountry(country);
		user.setZipCode(zipCode);

		// UserAuthentication userAuthentication=new UserAuthentication();
		// userAuthentication.setUserName(emailId);
		// userAuthentication.setPassword(password);
		//
		// UserRoles userRoles=new UserRoles();
		// userRoles.setUserName(emailId);
		// userRoles.setUserRole("user");
		UserService userService = new UserServiceImpl();
		Integer response = userService.registerCustomer(user);

		if (response > 0) {

			return new ModelAndView("customerRegistration", "message",
					"you are successfully registered and your Id is:" + response);
		} else {
			return new ModelAndView("customerRegistration", "message",
					"you are not successfully registered please try again");
		}

	}

}
