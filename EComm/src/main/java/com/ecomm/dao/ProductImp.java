package com.ecomm.dao;

import java.io.Serializable;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.hibernate.cfg.Configuration;

import com.ecomm.web.Productadd;


public class ProductImp implements ProductDAO{
	
	
	@Autowired
    private SessionFactory sessionFactory;
	public Integer status;

	@Override
	public Integer addproduct(Productadd product) {
		// TODO Auto-generated method stub
		Configuration configuration=new Configuration();
		configuration.configure("com/ecomm/dao/hibernate.cfg.xml");		
		SessionFactory sessionFactory=	configuration.buildSessionFactory();
			
		Session session=sessionFactory.openSession();
		Transaction transaction=session.beginTransaction();
			
	      status = (Integer) session.save(product);
	    transaction.commit();
		return status;
		
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Productadd> listproduct() {
		// TODO Auto-generated method stub
		return this.sessionFactory.getCurrentSession()
				.createQuery("from Productadd").list();
	}

	@Override
	public void remove(Integer id) {
		// TODO Auto-generated method stub
		
	}


	
}
