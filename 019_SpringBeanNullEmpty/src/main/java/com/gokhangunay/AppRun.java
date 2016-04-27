package com.gokhangunay;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppRun {
	
	public static void main(String[] args) {
		
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("SpringBeanConfiguration.xml");
		B bObject = applicationContext.getBean("beanB", B.class);
		
		bObject.show();
	}
	
	
	
	
	
}
