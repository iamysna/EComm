package com.spring.productSpring;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeController {
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	   public String home() {
	      return "home";
	   }
	
	@RequestMapping(value = "/abc", method = RequestMethod.GET)
	public String abc() {
	  return "abc";
	   }

	@RequestMapping(value = "/res")
	@ResponseBody
	public String res() {
	    return "Hello World";
	}
	
	
	@RequestMapping(value = "/form", method = RequestMethod.GET)
	public String form() {
	  return "form";
	}
	
	@RequestMapping(value = "/display/{name}", method = RequestMethod.GET)
	public String form1(@PathVariable("name") String name, Model model) {
		model.addAttribute("name", name);
	  return "display";
	}
	
	@RequestMapping(value = "/processform", method = {RequestMethod.GET, RequestMethod.POST})
	public String processform(@RequestParam("fname") String fname, @RequestParam("lname") String lname, Model model ) {
		model.addAttribute("fname", fname);
		model.addAttribute("lname", lname);
	  return "processForm";
	}
	
	
}
