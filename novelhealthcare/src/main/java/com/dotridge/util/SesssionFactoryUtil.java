package com.dotridge.util;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class SesssionFactoryUtil {
	private SesssionFactoryUtil(){
		
	}
	private static SessionFactory sessionFactory=null;
	public static SessionFactory getSessionFactory(){
		if(sessionFactory==null){ 
			Configuration cfg=new Configuration().configure("hibernate.cfg.xml");
			sessionFactory=cfg.buildSessionFactory(); 
		}
		return sessionFactory;
		
	}

}
