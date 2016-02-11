package com.ecomm.web;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.ecomm.dao.ProductDAO;
import com.ecomm.dao.ProductImp;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	
		/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home() { 
	return "home";
		
	}
//	@RequestMapping(value="/login" , method=RequestMethod.GET)
//	public ModelAndView getLoginuPage()
//	
//	{
//		Loginuser log=new Loginuser();
//		return new ModelAndView("login","loginUser",log);
//	}
//	
	@RequestMapping(value="/login" , method=RequestMethod.GET)
	public String getLoginuPage()
	{
		return "login";
		
	}
	
	
	@RequestMapping(value = "/denied", method = RequestMethod.GET)
	public String loginerror(ModelMap model) {
		model.addAttribute("error", "true");
		return "denied";
	}
	
	@RequestMapping(value="/admin" , method=RequestMethod.GET)
	public ModelAndView adminLoginuPage()
	
	{
		Loginuser log=new Loginuser();
		return new ModelAndView("adminlogin","loginadmin",log);
	}
	@RequestMapping(value="/reg" , method=RequestMethod.GET)
	public ModelAndView registation()
	
	{
		RegistationCus r=new RegistationCus();
		return new ModelAndView("customerreg","regist",r);
	}
	
	
	
	@RequestMapping(value="/addproduct" , method=RequestMethod.GET)
	public ModelAndView addproduct()
	{
	
		return new ModelAndView("addproduct");
	}
//	
//	@RequestMapping(value="/pro",method=RequestMethod.POST)
//	public ModelAndView productDetails(@RequestParam("id") Integer id,
//			                                    @RequestParam("pname") String pname,
//			                                    @RequestParam("description") String description,
//			                                    @RequestParam("price") Integer price)
//	{
//		Productadd p=new Productadd();
//		p.setId(id);
//		p.setPname(pname);
//		p.setDescription(description);
//		p.setPrice(price);
//		
//		ProductDAO pd = new ProductImp();
//		Integer response= pd.addproduct(p);
//		if(response>0){
//			String mes="succeessfully product inserted ";		
//			return new ModelAndView("moreproducts");
//		}
//		else
//			return new ModelAndView("addproduct");		
//		
//	}
}
