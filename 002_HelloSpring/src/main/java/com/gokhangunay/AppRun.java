package com.gokhangunay;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

@SuppressWarnings("deprecation")
public class AppRun {
	
	public static void main(String[] args) {
//		Car car = new Car();
//		car.moveOn();
		
		// beanleri olusturan fabrika. beanFactory nesnesi aslinda bizim contexttir.
		BeanFactory beanFactory = new XmlBeanFactory(new FileSystemResource("SpringBeansConfig.xml"));
		Car car = (Car) beanFactory.getBean("car");
		car.moveOn();
		
	}

}
