package com.gokhangunay;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppRun {

	public static void main(String[] args) {
		
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("SpringBeanConfig.xml");
		
		Student student = applicationContext.getBean("beanStudent", Student.class);
		
		System.out.println(student.getName() + "\n" +
				student.getSurName() + "\n" + 
				student.getAge());
	}
	
	// calistiginda hata alinacak. cunku required annot. kullanildi. exception icerigine dikkat edin.

}
