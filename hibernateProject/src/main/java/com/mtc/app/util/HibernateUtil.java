package com.mtc.app.util;


import org.hibernate.SessionFactory;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

import com.mtc.app.sampledatabase.OrderDetails;
import com.mtc.app.sampledatabase.ProductLines;
import com.mtc.app.sampledatabase.Products;

public class HibernateUtil {
	
	private static final SessionFactory SESSION_FACTORY;
	static {
		Configuration configuration = new Configuration();
		configuration.configure();
		
		configuration.addAnnotatedClass(Products.class);
		configuration.addAnnotatedClass(ProductLines.class);
		configuration.addAnnotatedClass(OrderDetails.class);
		
		ServiceRegistry serviceRegistry =  new StandardServiceRegistryBuilder().applySettings(configuration.getProperties()).build();
		SESSION_FACTORY = configuration.buildSessionFactory(serviceRegistry);
		
	}
	
	public static SessionFactory getSessionFactory() {
		return SESSION_FACTORY;
	}

}
