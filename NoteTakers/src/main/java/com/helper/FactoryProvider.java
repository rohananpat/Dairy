package com.helper;

import org.hibernate.SessionFactory;

import org.hibernate.cfg.Configuration;

public class FactoryProvider {
public static SessionFactory factory;
public static SessionFactory getFactory()
{
	if(factory == null)
	{
	factory=new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();	
	//System.out.println(111111);
	}
	return factory;
}
public void closefactory()
{
	if(factory.isOpen())
	{
		factory.close();
	}
}
}
