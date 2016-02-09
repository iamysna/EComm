package com.spring.productSpring.jstl;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.spring.productSpring.product.Product;

@Controller
public class JSTLController {
	@RequestMapping(value = "/jstl", method = RequestMethod.GET)
	public String jstl() {
	  return "jstl";
	}
	
	@RequestMapping(value = "/ccatch", method = RequestMethod.GET)
	public String ccatch() {
	  return "ccatch";
	}
	
	@RequestMapping(value = "/cout", method = RequestMethod.GET)
	public String cout() {
	  return "cout";
	}
	
	@RequestMapping(value = "/processCout", method = RequestMethod.POST)
	public String ProcessCout() {
	  return "processCout";
	}
	
	@RequestMapping(value = "/cimport", method = RequestMethod.GET)
	public String cimport() {
	  return "cimport"; 
	}
	
	@RequestMapping(value = "/cforeach", method = RequestMethod.GET)
	public String cforeach() {
	  return "cforeach";
	}
	
	@RequestMapping(value = "/cif", method = RequestMethod.GET)
	public String cif() {
	  return "cif";
	}
	
	@RequestMapping(value = "/credirect", method = RequestMethod.GET)
	public String credirect() {
	  return "credirect";
	}
	
	@RequestMapping(value = "/cremove", method = RequestMethod.GET)
	public String cremove() {
	  return "cremove";
	}
	
	@RequestMapping(value = "/cchoose", method = RequestMethod.GET)
	public String cchoose() {
	  return "cchoose";
	}
	
	@RequestMapping(value = "/cparam", method = RequestMethod.GET)
	public String cparam() {
	  return "cparam";
	}
	
	@RequestMapping(value = "/cfortoken", method = RequestMethod.GET)
	public String cfortoken() {
	  return "cfortoken";
	}
	
	/*@RequestMapping(value = "/reg", method = RequestMethod.GET)
	   public ModelAndView reg() {
		Register registers=new Register();
		ModelAndView model=new ModelAndView("reg", "register", registers);
		List<String> list1 = getCountryList();
		model.addObject("countryList", list1);
		List<String> list2 = getHobbyList();
		model.addObject("hobbyList", list2);
	    return model;
	   }*/
	
	@RequestMapping(value = "/reg", method = RequestMethod.GET)
	   public String reg(Map<String, Object> model) {
		model.put("regis", new Register());
		List<String> list1 = getCountryList();
		model.put("countryList", list1);
		System.out.println(list1);
		List<String> list2 = getHobbyList();
		model.put("hobbyList", list2);
		System.out.println(list2);
	    return "reg";
	   }
		
	private List<String> getCountryList() {

		List<String> list = new ArrayList<String>();
		list.add("-- select --");
		list.add("America");
		list.add("Africa");
		list.add("Bangalesh");
		list.add("Bangkok");
		list.add("Canada");
		list.add("Denmark");
		list.add("Europe");

		return list;

	}
	
	private List<String> getHobbyList() {

		List<String> list = new ArrayList<String>();
		list.add("Dancing");
		list.add("Singing");
		list.add("Skatting");
		list.add("Bowling");
		list.add("gaming");
		list.add("gardening");
		list.add("cooking");

		return list;

	}
	
	@RequestMapping(method = RequestMethod.POST)
	   public String user(@Valid @ModelAttribute("regis")Register register,BindingResult result,ModelMap model) {
	      
		  if(result.hasErrors())
		  {
			  model.put("countryList", getCountryList());
			  model.put("hobbyList", getHobbyList());
			  return "reg";
		  }
		  model.addAttribute("uname", register.getUname());
	      model.addAttribute("pass", register.getPass());
	      model.addAttribute("fname", register.getFname());
	      model.addAttribute("lname", register.getLname());
	      model.addAttribute("gender", register.getGender());
	      model.addAttribute("email", register.getEmail());
	      model.addAttribute("phone", register.getPhone());
	      model.addAttribute("country", register.getCountry());
	      model.addAttribute("hobby", register.getHobby());
	      model.addAttribute("address", register.getAddress());
	      model.addAttribute("mail", register.getMail());
	      
	      return "user";
	   }
}
