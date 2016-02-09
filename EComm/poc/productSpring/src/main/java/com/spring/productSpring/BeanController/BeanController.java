package com.spring.productSpring.BeanController;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class BeanController {
	@RequestMapping(value = "/beanScope", method = RequestMethod.GET)
	   public String beanScope() {
	      return "beanScope";
	   }
	

}
