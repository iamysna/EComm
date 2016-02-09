package com.spring.productSpring.tag;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.ModelAttribute;

public class AbstractPageController {

	@ModelAttribute("years") 
	public List<String> getYears() {
		List<String> years = new ArrayList<String>();
		years.add("2016");
		years.add("2014");
		years.add("2015");
		return years;
	}
}