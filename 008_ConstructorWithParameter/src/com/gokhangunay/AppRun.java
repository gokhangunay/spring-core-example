 package com.gokhangunay;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppRun {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// burda besgen verdik. fakat spring.xml icerisinde property olarak style i gosterimini sagladik. burdan value diyerek deger atamasi yapabiliriz.
		// context metadata okur.container ise bunun ustu. container nesneleri olusturur. context ise bu nesneler arasi baglari olusturur.
		// context bilgiyi tarif eder. kim kiminle ne is yapar.
		
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext(new String[]{"spring.xml"});
		Triangle triangleContext = (Triangle) applicationContext.getBean("triangle");
//		triangleContext.setStyle("Besgen");
		
		triangleContext.draw();
		
	}

}
