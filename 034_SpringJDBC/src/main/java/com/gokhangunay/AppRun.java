package com.gokhangunay;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.gokhangunay.dao.impl.PersonelDaoImpl;
import com.gokhangunay.model.Personnel;

public class AppRun {
	
	public static void main(String[] args) {
	
//		ConfigurableApplicationContext applicationContext = new ClassPathXmlApplicationContext("SpringBeanConfig.xml");
		
		ApplicationContext applicationContext = new FileSystemXmlApplicationContext("src/main/resources/SpringBeanConfig.xml");
		PersonelDaoImpl daoImpl= applicationContext.getBean("personelDaoImplBean", PersonelDaoImpl.class);
		
//-1		Personnel personnel = new Personnel("Gökhan", "Günay", "2");
//-1		daoImpl.addPersonel(personnel);
		
		
//-2		Personnel personnel = daoImpl.getPersonelById(1);		
//-2		System.out.println(personnel.toString());	
		
	}

}
