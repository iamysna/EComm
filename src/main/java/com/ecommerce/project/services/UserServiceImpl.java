package com.ecommerce.project.services;

import org.hibernate.SessionFactory;
import org.hibernate.classic.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.ecommerce.project.domain.Customer;

@Repository
public class UserServiceImpl implements UserService {
	
	@Autowired
	private SessionFactory sessionFactory;
	@Override
	public Integer registerCustomer(Customer customer) {
		
		Integer status=null;
		
		
	Session session=sessionFactory.openSession();
	if(session!=null)
	{
		
    status= (Integer) session.save(customer);
	return status;
		
		
	}
	return status;
			
	}

}
