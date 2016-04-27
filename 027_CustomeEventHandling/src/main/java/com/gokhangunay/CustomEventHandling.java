package com.gokhangunay;

import org.springframework.context.ApplicationListener;

public class CustomEventHandling implements ApplicationListener<CustomEvent>{
	
	// olay nerede kullanilacaksa onu soyleyecegiz.

	public void onApplicationEvent(CustomEvent event) {
		System.out.println(event.toString());
	}
	
}
