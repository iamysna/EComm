package com.ecommerce.project.services;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.ecommerce.project.domain.Product;
import com.ecommerce.project.util.HibernateUtil;


public class ProductServiceImpl implements ProductService {

	public Integer addProduct(Product product) {
		
		Integer status=null;
		
	SessionFactory sessionFactory=HibernateUtil.getSessionFactory();
	Session session=sessionFactory.openSession();
		Transaction transaction=session.beginTransaction();
 status=(Integer) session.save(product);
 transaction.commit();
		return status;
	}

	
	
	
//=======================================================================================
	public List viewProducts() {
		
		
		SessionFactory sessionFactory=HibernateUtil.getSessionFactory();
		Session session=sessionFactory.openSession();
	Criteria criteria=session.createCriteria(Product.class);
		List list=criteria.list();
		
		return list;
		
		
		
	}

}
