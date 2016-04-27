 package com.gokhangunay;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;
import org.springframework.core.io.Resource;

@SuppressWarnings("deprecation")
public class AppRun {

	public static void main(String[] args) {
		Resource resource = new FileSystemResource("spring.xml"); // resoure nerde gorursek bir yerde belirli bir kaynak var.
		XmlBeanFactory xmlBeanFactory = new XmlBeanFactory(resource);
		
		Triangle triangle = (Triangle) xmlBeanFactory.getBean("triangle");
		triangle.draw();
	}

}
