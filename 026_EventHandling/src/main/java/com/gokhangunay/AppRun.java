package com.gokhangunay;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppRun {
	
	public static void main(String[] args) {
		
		//ApplicationContext applicationContext = new ClassPathXmlApplicationContext("SpringBeanConfiguration.xml"); bunu kapadik cunku assada 
		// .start() , refresh(), stop() , close() yapilarini daha rahat kullanmak icin gerek duymadik.
		
		ConfigurableApplicationContext applicationContext = new ClassPathXmlApplicationContext("SpringBeanConfiguration.xml");
		
		applicationContext.start(); // context ayaga kalkiyor :)
		
		Words words = applicationContext.getBean("beanWords", Words.class);
		
		words.show();
		
		applicationContext.refresh();
		
		applicationContext.stop();
		
		applicationContext.close();
		

		
	}
	
	
	
	
	
}
