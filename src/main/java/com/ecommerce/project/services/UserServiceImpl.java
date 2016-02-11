package com.ecommerce.project.services;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.ecommerce.project.domain.User;
import com.ecommerce.project.util.HibernateUtil;


public class UserServiceImpl implements UserService {
	
	public Integer status;
	
	
	public Integer registerCustomer(User user) {
		
SessionFactory sessionFactory=	HibernateUtil.getSessionFactory();
		
	Session session=sessionFactory.openSession();
	Transaction transaction=session.beginTransaction();
		
    status= (Integer) session.save(user);
    transaction.commit();

	return status;
			
	}

}
