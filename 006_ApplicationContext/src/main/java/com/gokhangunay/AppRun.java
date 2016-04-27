 package com.gokhangunay;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SuppressWarnings("deprecation")
public class AppRun {

	public static void main(String[] args) {
//		Resource resource = new FileSystemResource("spring.xml"); // resoure nerde gorursek bir yerde belirli bir kaynak var.
//		XmlBeanFactory xmlBeanFactory = new XmlBeanFactory(resource);
	
//		ClassPathResource classPathResource = new ClassPathResource("spring.xml");
//		XmlBeanFactory xmlBeanFactory = new XmlBeanFactory(classPathResource);
	
		
//		projde birden cok xml dosyamiz olabilir. modul modul olabilir. birden cok config varsa bu sekilde kullaniriz
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext(new String[]{"spring.xml"}); // bir yerde classPath geciyorsa src ye mutlaka bak
		BeanFactory beanFactory = applicationContext;
		
		Triangle triangle = (Triangle) beanFactory.getBean("triangle");
		Circle circle = (Circle) beanFactory.getBean("circle");
		triangle.draw();
		circle.draw();
		
		// transaction olacaksta appContet olacaktir.
		// appContext fdaha kapsamli daha buyuk isler yapmak icin kullaniriz. 
		// buraya katar farkli farkli seneryolar anlattim.
		//yukarida bean factory ile anlatim oldu. Application context beanFactory nin daha buyugudur.
		
		
		
		// isin icerisinde sadece appContex olacak sekilde assada tasarlayalim. Yukarida bean factory ile kullanimi vardi.
		
		Triangle triangleContext = (Triangle) applicationContext.getBean("triangle");
		Circle circleContext = (Circle) applicationContext.getBean("circle");
		triangleContext.draw();
		circleContext.draw();
		
		// sorular aliniyor?
		//appcontext web uygulamasinda kendisi ayaga kalkiyor. web xml application context var. o ayaga kalkiyor.
		
		//birseyin onunde pre- prepare  varsa onceden onu calistirmis yada onceden onu yuklemis kullanmis 
		
	}

}
