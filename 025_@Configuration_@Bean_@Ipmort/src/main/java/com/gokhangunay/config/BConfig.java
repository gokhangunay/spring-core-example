package com.gokhangunay.config;

import org.springframework.context.annotation.Bean;

import com.gokhangunay.B;

public class BConfig {

	@Bean(name="beanB")
	public B instance(){
		return new B();
	}
	
}
