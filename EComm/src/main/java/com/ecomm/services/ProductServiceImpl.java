package com.ecomm.services;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.ecomm.util.HibernateUtil;
import com.ecomm.web.Productadd;

public class ProductServiceImpl implements ProductService {
	
	Integer status=null;

	@Override
	public Integer saveProduct(Productadd productadd) {
		
	SessionFactory sessionFactory=HibernateUtil.getSessionFactory();
	Session session=sessionFactory.openSession();
 Transaction transaction=session.beginTransaction();
		Integer status= (Integer) session.save(productadd);
		transaction.commit();
		return status;
	}

}
