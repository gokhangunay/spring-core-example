package com.gokhangunay;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class AppRun {
	

	public static void main(String[] args) {

		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");
		
		// bu sekilde tip donusumu yapmayalim! Hello hello = (Hello) applicationContext.getBean("beanHello");
		
		Hello hello = applicationContext.getBean("beanHello", Hello.class);
		Hello hello2 = applicationContext.getBean("beanHello", Hello.class);
		
		hello.setMessage("Hello!"); 
		
		// buradaki olay tek nesne uzerinden isleri yapar. her istekte yeni bir nesne veriyor
		
		hello2.show(); 
		hello.show();
		
		System.out.println(applicationContext.getBean("beanHello", Hello.class));
		System.out.println(applicationContext.getBean("beanHello", Hello.class));
		System.out.println(applicationContext.getBean("beanHello", Hello.class));
		System.out.println(applicationContext.getBean("beanHello", Hello.class));
		System.out.println(applicationContext.getBean("beanHello", Hello.class));
	}

}
