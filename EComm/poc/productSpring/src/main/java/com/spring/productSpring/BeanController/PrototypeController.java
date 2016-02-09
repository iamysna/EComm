package com.spring.productSpring.BeanController;

import java.io.IOException;

import javax.annotation.Resource;
import javax.servlet.ServletOutputStream;
import javax.servlet.ServletResponse;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@Scope("prototype")
public class PrototypeController{
	@Resource
	BeanExample requestbean;
	
	@Resource
	BeanExample singletonbean;
	
	@Resource
	BeanExample sessionbean;
	
	@Resource
	BeanExample prototypebean;
	
	int i=0;

	
@RequestMapping(value="/prototype")
@ResponseBody
public void showMessage(ServletResponse response) {
	System.out.println("in controller");
	i++;
	ServletOutputStream out;
	try {
		out = response.getOutputStream();
		out.println(" Bean Scope Singleton /n default scope controller count "+i);
		out.println(" defaultScopeBean count "+singletonbean.getI()+"\n");
		out.println("requestBean count   "+requestbean.getI());
		out.println(" sessionBean count   "+sessionbean.getI());
		out.println(" prototypeScopeBean count   "+prototypebean.getI());
		out.println();
	} catch (IOException e) {
		// // TODO Auto-generated catch block
		e.printStackTrace();
	}
}
}