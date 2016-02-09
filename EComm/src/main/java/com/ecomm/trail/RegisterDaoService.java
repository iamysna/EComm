package com.ecomm.trail;

import java.util.List;

import org.springframework.stereotype.Service;
@Service
public interface RegisterDaoService {
	public void addCustomer(RegistrationPojo regis);
	public List<RegistrationPojo> listCustomer();
	public void removeRegistration(Integer id);
	
	public void addIntoLogin(LoginPojo login);
	public List<LoginPojo> listLogin(); 
}
