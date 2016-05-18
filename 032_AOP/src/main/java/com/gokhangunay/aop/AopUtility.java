package com.gokhangunay.aop;

import java.lang.reflect.Method;

import org.springframework.aop.AfterReturningAdvice;
import org.springframework.aop.MethodBeforeAdvice;
import org.springframework.aop.ThrowsAdvice;

public class AopUtility implements MethodBeforeAdvice, AfterReturningAdvice, ThrowsAdvice{

	public void before(Method method, Object[] args, Object target) throws Throwable {
		
		// Burada Loglama, Transaction Managment, Caching, Exception Handling, Recovery, Retry, Security işlemlerini yapabiliriz.
		
		System.out.println("****** Before General ******");
		
		if(method.getName().equals("personelNameAndSurnameControl")){
			System.out.println("****** Before personelNameAndSurnameControl method******");
		}
		
		if(method.getName().equals("hello")){
			System.out.println("****** Before hello method******");
		}
		
		if(method.getName().equals("personelInfo")){
			System.out.println("****** Before personelInfo method******");
		}

	}

	public void afterReturning(Object returnValue, Method method, Object[] object, Object target) throws Throwable {
		
		// Burada Loglama, Transaction Managment, Caching, Exception Handling, Recovery, Retry, Security işlemlerini yapabiliriz.
			
		System.out.println("****** After General ******");
		
		if(method.getName().equals("personelNameAndSurnameControl")){
			System.out.println("****** After personelNameAndSurnameControl method******");
		}
		
		if(method.getName().equals("hello")){
			System.out.println("****** After hello method******");
		}
		
		if(method.getName().equals("personelInfo")){
			System.out.println("****** After personelInfo method******");
		}
	}

	
	public void afterThrowing(IllegalArgumentException e) throws Throwable{
		System.err.println(" After exception"); // err.println olduğu için ekrana kırımızı basacak. Yukarıda ad soyadın lenght kontrolü var. 
	}											// SpringBeanConfig.xml içerisinde ad yada soyadın karakterini 2 den az yaparsanız bu durum gerçekleşecek.
												// lenght kontrolü Personel classı içerisinde yapılmakta
	
}

	