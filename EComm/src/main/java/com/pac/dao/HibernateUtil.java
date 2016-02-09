package com.pac.dao;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {
	@SuppressWarnings("deprecation")
	public static SessionFactory getSessionFactory()
	{
		
		
		SessionFactory sessionFactory=null;
		
		Configuration configuration=new Configuration();
		configuration.configure("com/pac/dao/hibernate.cfg.xml");
	sessionFactory=configuration.buildSessionFactory();
	
		
		return sessionFactory;
		
	}

}