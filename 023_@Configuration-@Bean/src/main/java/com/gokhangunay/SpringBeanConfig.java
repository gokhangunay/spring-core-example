package com.gokhangunay;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringBeanConfig {
	
	// onceden bu sinifin yapacagi isler icin xml dosyasi olusturuyordum. 
	
	@Bean
	public City city(){ // bean tanimlamasi yaptigimiz yere geliyor
		City city = new City();
		city.setName("Istanbul");
		city.setPlateNumber(34);
		return city;
	}
	
	@Bean 
	public Student student(){
		Student student = new Student();
		student.setName("Gokhan");
		student.setAge(27);
		student.setCity(city());
		return student;
	}

}
