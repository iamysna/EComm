package com.ecomm.trail.dao;

import java.util.List;

import com.ecomm.trail.forms.Login;
import com.ecomm.trail.forms.Registration;

public interface RegisterDAO {

	public void addCustomer(Registration regis);
	public List<Registration> listCustomer();
	public void removeRegistration(Integer id);
	
	public void addIntoLogin(Login login);
	public List<Login> listLogin(); 
}
