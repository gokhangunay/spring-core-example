package com.gokhangunay;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppRun {
	
	public static void main(String[] args) {
		
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");
		
		Hello hello = applicationContext.getBean("beanHello", Hello.class);
		
		hello.show();
		
		System.out.println("---------------------------");
		
		Author author = applicationContext.getBean("beanAuthor", Author.class);
		
		author.show();	
	
		
		((AbstractApplicationContext) applicationContext).registerShutdownHook();
		
	}

}
