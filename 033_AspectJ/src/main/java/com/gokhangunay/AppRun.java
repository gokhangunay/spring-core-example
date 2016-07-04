package com.gokhangunay;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.gokhangunay.model.Personel;

public class AppRun {
		
			
	public static void main(String[] args) {
		
		ConfigurableApplicationContext configurableApplicationContext = new ClassPathXmlApplicationContext("SpringBeanConfig.xml");
		Personel personnel = configurableApplicationContext.getBean("beanPersonel", Personel.class);
		
		try {
			personnel.personelNameAndSurnameControl();
		//	personnel.hello("Hello!");
			//personnel.personelInfo();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		configurableApplicationContext.close();
		
	}
}
