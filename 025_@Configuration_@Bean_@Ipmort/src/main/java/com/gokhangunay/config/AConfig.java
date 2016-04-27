package com.gokhangunay.config;

import org.springframework.context.annotation.Bean;

import com.gokhangunay.A;

public class AConfig {

	@Bean(name="beanA")
	public A instance(){
		return new A();
	}
	
}
