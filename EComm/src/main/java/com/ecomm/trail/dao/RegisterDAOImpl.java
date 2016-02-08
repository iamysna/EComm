package com.ecomm.trail.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.ecomm.trail.forms.Login;
import com.ecomm.trail.forms.Registration;


@Repository
public class RegisterDAOImpl implements RegisterDAO{

	@Autowired
	private SessionFactory sessionFactory;
	
	@Override
	public void addCustomer(Registration regis) {
		// TODO Auto-generated method stub
		sessionFactory.getCurrentSession().save(regis);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Registration> listCustomer() {
		// TODO Auto-generated method stub
		return (List<Registration>)sessionFactory.getCurrentSession().createQuery("from customer").list();
	}

	@Override
	public void removeRegistration(Integer id) {
		// TODO Auto-generated method stub
		Registration register = (Registration) sessionFactory.getCurrentSession().load(Registration.class, id);
		if (null != register) {
			sessionFactory.getCurrentSession().delete(register);
		}
	}

	@Override
	public void addIntoLogin(Login login) {
		// TODO Auto-generated method stub
		sessionFactory.getCurrentSession().save(login);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Login> listLogin() {
		// TODO Auto-generated method stub
		return (List<Login>)sessionFactory.getCurrentSession().createQuery("from login").list();
	}

}
