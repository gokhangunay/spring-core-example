package com.gokhangunay;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppRun {

	public static void main(String[] args) {
		
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");
		
		Student student = (Student) applicationContext.getBean("beanStudent");
		
		System.out.println("Name: " + student.getStudentList());
		System.out.println("Surname: " + student.getStudentMap());
		System.out.println("Age: " + student.getStudentProperties());
		System.out.println("Title: " + student.getStudentSet());

	}
	

}
