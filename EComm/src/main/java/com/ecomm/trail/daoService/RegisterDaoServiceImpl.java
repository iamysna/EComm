package com.ecomm.trail.daoService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ecomm.trail.dao.RegisterDAO;
import com.ecomm.trail.forms.Login;
import com.ecomm.trail.forms.Registration;

@Service
public class RegisterDaoServiceImpl implements RegisterDaoService{

	@Autowired
	private RegisterDAO regDAO;
	
	@Override
	public void addCustomer(Registration regis) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Registration> listCustomer() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void removeRegistration(Integer id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void addIntoLogin(Login login) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Login> listLogin() {
		// TODO Auto-generated method stub
		return null;
	}

}
