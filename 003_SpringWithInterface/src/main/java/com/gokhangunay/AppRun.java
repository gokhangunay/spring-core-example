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
		BeanFactory beanFactoryCar = new XmlBeanFactory(new FileSystemResource("SpringBeansConfig.xml"));
		Car car = (Car) beanFactoryCar.getBean("car");
		car.moveOn();
		
		BeanFactory beanFactoryTruck = new XmlBeanFactory(new FileSystemResource("SpringBeansConfig.xml"));
		Truck truck = (Truck) beanFactoryTruck.getBean("truck");
		truck.moveOn();
		
		
		
	}

}
