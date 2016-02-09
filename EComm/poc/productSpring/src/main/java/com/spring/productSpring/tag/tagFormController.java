package com.spring.productSpring.tag;

import javax.servlet.ServletResponse;

import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.spring.productSpring.product.Product;

public class tagFormController {

	@RequestMapping(value = "/tag", method = RequestMethod.GET)
	public String tagTest() {
	  return "tagTest";
	}
	
	@RequestMapping(value = "/tagForm")
	   public ModelAndView tagForm() {
	      return new ModelAndView("tagForm", "customTag", new tagFormClass());
	   }
	
	@RequestMapping(value = "/submitTagForm", method = RequestMethod.POST)
	public ModelAndView submitTagForm(@ModelAttribute("tagForm") tagFormClass form, BindingResult result,
			ServletResponse response,ModelAndView mv) {	
		System.out.println(" checking errors ");

		if (result.hasErrors()) {
			System.out.println(" binding result has errors ");

			tagFormClass tfc = new tagFormClass();
			mv.addObject("errors",result.getAllErrors());
			mv.addObject("tagForm", tfc);

			return mv;

		}
		System.out.println(" no  errors ");
		mv.addObject("name", form.getName());
		mv.setViewName("submitTagForm");

		return mv;
	}
	
}
