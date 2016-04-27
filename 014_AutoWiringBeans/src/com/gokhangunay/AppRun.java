package com.gokhangunay;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppRun {

	public static void main(String[] args) {

		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");
		Worker worker = (Worker) applicationContext.getBean("beanWorker", Worker.class);
		
		System.out.println(worker);
	}

}
