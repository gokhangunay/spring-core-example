package com.gokhangunay;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.gokhangunay.model.Personnel;

public class AppRun {

	/*
  		AOP Kavramları nelerdir?
	
 		*Cross-Cutting Concern: Tüm katmanların hepsinin dikey olarak kesilmeisidr ve AOP' un merkezindedir.
 		*Concern: Transactions, logging, exception handling, security, caching bunların tümüne verilen isimdir.
 		*AspectJ: Spring AOP modülü ile XML ler üzerinde AspectJ ile de Java sınıflarından annotation'lar ile AOP işlemlerini yapmaktayız.
 		*Advice: Belirli bir JoinPoint zamanında herhangi bir aspect tarafından gerçekleştirilen iştir.
 			befor- öncesinde bir metodu çalıştırır.
 			after- sonrasında bir metodu çalıştırır.
 			afterReturnning- metodun geri dönüşünden önce
 			afterThrowing- bir işlemde bir excp. sonrasında işletilir.
 			arround- bir isteğin öncesi ve  sonrasında işletirilir
	
 			Advice: 		BeforeAdvice | AfterAdvice | Interceptor
 			BeforeAdvice:	MethodBeforeAdvice
 			AfterAdvice:	AfterReutnningAdvice | ThrowsAdvice	
 			Interceptor:	MethodInterceptor
	
  		AOP Hangi Katmanlarda çalışır?
  			-Presentation Layer
  			-Services Layer
  			-Business Layer
  			-Persistence Layer
	*/
		
			
	public static void main(String[] args) {
		
		ConfigurableApplicationContext configurableApplicationContext = new ClassPathXmlApplicationContext("SpringBeanConfig.xml");
		Personnel personnel = configurableApplicationContext.getBean("beanPersonelProxy", Personnel.class); // Buraya Dikkat! beanPersonelProxy kullanıyoruz.
		
		personnel.personelNameAndSurnameControl();
		personnel.hello("Hello!");
		personnel.personelInfo();
		
		configurableApplicationContext.close();
		
	}
}
