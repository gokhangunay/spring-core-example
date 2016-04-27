 package com.gokhangunay;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppRun {
	
	public static void main(String[] args) {
	
		ApplicationContext applicationContext = (ApplicationContext) new ClassPathXmlApplicationContext("spring.xml");
		
		//Tip Dönüşümü
		Student student = (Student) applicationContext.getBean("beanStudent");
		
		//Parametrede sinif adi.
		Student student1 = applicationContext.getBean("beanStudent", Student.class);

		//Dogrudan sinif adi. Tercih sebebi olmamasi gerekir. spring xmlde tek bean olsa bir sinif ile alakali sikinti yok ama birden cok varsa sictin.
		Student student2 = (Student) applicationContext.getBean(Student.class);
		
		System.out.println(student.getName());
		System.out.println(student.getSurName());
		System.out.println(student.getNumber());
		System.out.println(student.getUniversty().getSchoolName());
		System.out.println(student.getAdress().getStreet());
		System.out.println(student.getAdress().getDistrict());
	}
		
}


