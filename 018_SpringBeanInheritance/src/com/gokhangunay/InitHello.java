package com.gokhangunay;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class InitHello implements BeanPostProcessor {

	//Hello sinifinda yaptigimiz initHello nun oncesi ve sonrasinda kullanacak class ve implementasyonu BeanPostProcessor
	
	@Override
	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
		System.out.println("start after beanName: " + beanName);
		return bean;
	}

	@Override
	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
		System.out.println("start before beanName: " + beanName);
		return bean;
	}

}
