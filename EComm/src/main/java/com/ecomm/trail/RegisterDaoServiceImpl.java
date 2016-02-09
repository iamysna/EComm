package com.ecomm.trail;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;



@Service
public class RegisterDaoServiceImpl implements RegisterDaoService{

	@Autowired
	private RegisterDAO registerDao;
	@Override
	@Transactional
	public void addCustomer(RegistrationPojo regis) {
		// TODO Auto-generated method stub
		registerDao.addCustomer(regis);
	}

	@Override
	@Transactional
	public List<RegistrationPojo> listCustomer() {
		// TODO Auto-generated method stub
		return registerDao.listCustomer();
	}

	@Override
	@Transactional
	public void removeRegistration(Integer id) {
		// TODO Auto-generated method stub
		registerDao.removeRegistration(id);
	}

	@Override
	@Transactional
	public void addIntoLogin(LoginPojo login) {
		// TODO Auto-generated method stub
		registerDao.addIntoLogin(login);
	}

	@Override
	@Transactional
	public List<LoginPojo> listLogin() {
		// TODO Auto-generated method stub
		return registerDao.listLogin();
	}

	

}
