package com.gokhangunay;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AppRun {

	public static void main(String[] args) {

		AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext();
		
		annotationConfigApplicationContext.register(SpringBeanConfig.class);
		
		annotationConfigApplicationContext.refresh(); // app contextin hareketlenmesi
		
		Student student = annotationConfigApplicationContext.getBean(Student.class);
		
		System.out.println(student.getCity().getName());
		System.out.println(student.getName());
		System.out.println(student.getAge());
		System.out.println(student.getCity().getPlateNumber());
		
		annotationConfigApplicationContext.close(); // app contextin kapatilmasi.
		
		// ((ConfigurableApplicationContext) annotationConfigApplicationContext).close(); // bir ust satirdakinin yeirne de kullanilabiliyor
		
	}

}
