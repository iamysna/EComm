package com.ecomm.trail;

import java.util.List;

public interface RegisterDAO {

	public void addCustomer(RegistrationPojo regis);
	public List<RegistrationPojo> listCustomer();
	public void removeRegistration(Integer id);
	
	public void addIntoLogin(LoginPojo login);
	public List<LoginPojo> listLogin(); 
}
