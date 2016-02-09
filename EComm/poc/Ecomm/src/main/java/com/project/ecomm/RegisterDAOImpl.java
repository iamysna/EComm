package com.project.ecomm;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class RegisterDAOImpl implements RegisterDAO{

	@Autowired
	private SessionFactory sessionFactory;
	
	@Override
	public void addCustomer(RegistrationPojo regis) {
		// TODO Auto-generated method stub
		sessionFactory.getCurrentSession().save(regis);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<RegistrationPojo> listCustomer() {
		// TODO Auto-generated method stub
		return (List<RegistrationPojo>)sessionFactory.getCurrentSession().createQuery("from customer").list();
	}

	@Override
	public void removeRegistration(Integer id) {
		// TODO Auto-generated method stub
		RegistrationPojo register = (RegistrationPojo) sessionFactory.getCurrentSession().load(RegistrationPojo.class, id);
		if (null != register) {
			sessionFactory.getCurrentSession().delete(register);
		}
	}

	@Override
	public void addIntoLogin(LoginPojo login) {
		// TODO Auto-generated method stub
		sessionFactory.getCurrentSession().save(login);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<LoginPojo> listLogin() {
		// TODO Auto-generated method stub
		return (List<LoginPojo>)sessionFactory.getCurrentSession().createQuery("from login").list();
	}

	

}
