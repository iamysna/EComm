package com.ecomm.util;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {
	
	public static SessionFactory sessionFactory;
	
	public static SessionFactory getSessionFactory()
	{
		Configuration configuration=new Configuration();
		configuration.configure("com/ecomm/services/hibernate.cfg.xml");
	SessionFactory sessionFactory=configuration.buildSessionFactory();
		
		return sessionFactory;
	}
	

}
