package com.gokhangunay;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppRun {
	public static void main(String[] args) {
		
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("SpringBeanConfig.xml");
		
//		Student student = applicationContext.getBean("beanStudent", Student.class);
		
//		System.out.println(student.getName() + "\n" +
//				student.getSurName() + "\n" + 
//				student.getAge());
		
		Lesson lesson = applicationContext.getBean("beanLesson", Lesson.class);
		
		System.out.println(lesson.getCourseContent() + "\n" +
							lesson.getPoint() + "\n" + 
							lesson.getStudent().getName() + "\n" +
							lesson.getStudent().getSurName()  + "\n" +
							lesson.getStudent().getAge());
		// uygulama calistiginda degerler null gelecek cunku SpringBeanConfig.xml icerisine deger atamasi yapilmadi. Siz yapin :)
	}
}
