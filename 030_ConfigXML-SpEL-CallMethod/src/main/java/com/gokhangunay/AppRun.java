package com.gokhangunay;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppRun {
	
	public static void main(String[] args) {
		
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("SpringBeanConfiguration.xml");
	
		Author author = applicationContext.getBean("beanAuthor", Author.class);
		
		System.out.println(author);
		
	}
	
	
	
	
	
}
