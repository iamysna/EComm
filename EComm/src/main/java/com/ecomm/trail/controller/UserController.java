package com.ecomm.trail.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.ecomm.trail.model.User;
import com.ecomm.trail.service.UserService;

@Controller
public class UserController {
	
	@Autowired
	private UserService userService; 	
	
	@RequestMapping("/reg")
	public String setupForm(Map<String, Object> map)
	{
		User user = new User();
		map.put("user", user);
		map.put("userList", userService.getAllUser());
		return "register";
	}
	@RequestMapping(value="/regit" , method=RequestMethod.POST)
	public String doAction(@ModelAttribute("user") User user, BindingResult result, Map<String, Object> map)
	{
		//System.out.println("mayur lad");
		User userResult= new User();
		userService.add(user);
		userResult=user;
//		switch (action.toLowerCase()) {
//		case "add":
//			userService.add(user);
//			userResult=user;
//			break;
//		case "edit":
//			userService.edit(user);
//			userResult=user;
//			break;
//		case "delete":
//			userService.delete(user.getUserid());
//			userResult=new User();
//			break;
//		case "search":
//			User searchUser = userService.getUser(user.getUserid());
//			userResult=searchUser!=null ? searchUser : new User();
//			break;
//		}
		map.put("user", userResult);
		map.put("userList", userService.getAllUser());
		return "login";
	}
}
