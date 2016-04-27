package com.gokhangunay;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.gokhangunay.config.SpringBeanConfig;

public class AppRun {

	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext();
		
		annotationConfigApplicationContext.register(SpringBeanConfig.class);
		
		annotationConfigApplicationContext.refresh();
		
		A aInstance = (A) annotationConfigApplicationContext.getBean("beanA");
		aInstance.show("A Class Message Parameter");
		
		B bInstance = (B) annotationConfigApplicationContext.getBean("beanB");
		bInstance.show("B Class Message Parameter");
		
		annotationConfigApplicationContext.close();
		
	}

}
