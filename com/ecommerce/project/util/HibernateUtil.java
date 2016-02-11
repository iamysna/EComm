package com.ecommerce.project.util;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {
	
	public static SessionFactory sessionFactory;
	
	public static SessionFactory getSessionFactory()
	{
		
	
		Configuration configuration=new Configuration();
		configuration.configure("com/ecommerce/project/services/hibernate.cfg.xml");
		sessionFactory=configuration.buildSessionFactory();
	
		
		return sessionFactory;
	
	}
	

}
