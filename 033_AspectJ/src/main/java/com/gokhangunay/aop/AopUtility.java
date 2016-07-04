package com.gokhangunay.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class AopUtility{
	
	// yukaridaki AOP ile yaptigimiz befor metodunun yerine bir alttakini kullaniyoruz.
	
	@Before("execution(* com.gokhangunay.model.personel.hello(..))")
	public void beforeForHello(JoinPoint joinPoint) throws Throwable{
		System.out.println("****** Before General ******" + joinPoint.getSignature().getName()); // metodun ismini gormek icin
	}
	
	@Before("execution(* com.gokhangunay.model.personel.personelNameAndSurnameControl(..))")
	public void beforeForNameAndSurname(JoinPoint joinPoint) throws Throwable{
		System.out.println("****** Before General ******" + joinPoint.getSignature().getName()); // metodun ismini gormek icin
	}
	
//	@After(Sonrasında) 
//	@Around(Sarmalama)- metodun icerisinde ProceedingJoinPoint tipinde bir parametre gecilir.
			// ! bu parametre ile berarber ProceedingJoinPoint icerisindeki .proceed(); metodu cagrilir. bu excetion icerisindeki metodu temsil eder. -> personelNameAndSurnameControl(..)
			// sarmalamanin en buyuk ozelligi metot oncesi ve sonrasinda kesmeler yapabiliyorsunuz. before ve afteri birlestiriyor.
//	@AfterReturning(Geri donus degerini dondukten sonra) 
//	@AfterThrowing(exception meydana geldiginde) metotlarida kullanilabilir. 
	
//	Aspect islemleri xml ile yapilamilkte. <aop:cofig tagi ile bu islemleri yapabilirsiniz. metotlarida -> pointcut(icerisine hangi metodu kesecegini bildirmeniz gerekir.) 
										// Tum egitimi tamamlarsaniz bu islemleri kolaylikla yapaiblirsiniz. xml ile ilgili config ornegi SpringBeanConfig.xml icerisinde var.
	
	
//	yukaridaki yorum satirindaki ornekleride siz yapin bir zahmet :)
	
}

	