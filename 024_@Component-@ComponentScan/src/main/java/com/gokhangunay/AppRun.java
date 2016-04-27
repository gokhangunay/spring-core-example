package com.gokhangunay;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.gokhangunay.math.Calculator;

public class AppRun {

	public static void main(String[] args) {
		
		ApplicationContext applicationContext =  new ClassPathXmlApplicationContext("SpringBeanConfiguration.xml");
		Calculator calculator = applicationContext.getBean("calculator", Calculator.class);
		
		calculator.showResult(6, 3);	
		
	}

}
