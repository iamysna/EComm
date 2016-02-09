package com.pac.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.pac.domain.Customer;
import com.pac.domain.User;

public class CustomerDAOImp  implements CustomerDAO{

	@Override
	public Integer addRegistration(Customer customer, User user) {
		SessionFactory sessionFactory=HibernateUtil.getSessionFactory();
		Session session=sessionFactory.openSession();
	 Integer stdId=  (Integer) session.save(customer);
	 session.save(user);
	 Transaction transaction=session.beginTransaction();
	 transaction.commit();
		return stdId;
		
	}

}
