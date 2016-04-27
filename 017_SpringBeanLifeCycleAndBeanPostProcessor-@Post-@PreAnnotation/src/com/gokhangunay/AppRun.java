package com.gokhangunay;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppRun {

	public static void main(String[] args) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");
		
		Hello hello = applicationContext.getBean("beanHello", Hello.class);
		Hello hello2 = applicationContext.getBean("beanHello", Hello.class);	// init hello sinifi icin kapatabilirsin.	
		
		hello.show();	
		hello.setMessage("Hello1");		
		hello.show();
		hello2.show();	// init hello sinifi icin kapatabilirsin.
		hello2.setMessage("Hello2");	// init hello sinifi icin kapatabilirsin.
		hello2.show();	// init hello sinifi icin kapatabilirsin.
		hello.show();	// init hello sinifi icin kapatabilirsin.
		
		((AbstractApplicationContext) applicationContext).registerShutdownHook();
	}

}
