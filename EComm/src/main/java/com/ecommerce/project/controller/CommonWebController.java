package com.ecommerce.project.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author Ravi
 * @since 8-2-2016
 * @version 1.0
 * Handles requests for the application home page.
 */
@Controller
public class CommonWebController {
	
	private static final Logger logger = LoggerFactory.getLogger(CommonWebController.class);
	private static final String WEB_HOME="home";
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public ModelAndView  home() {
		
		
		return new ModelAndView(WEB_HOME);
	}
	
}
