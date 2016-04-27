package com.gokhangunay;

import org.springframework.context.ApplicationEvent;

public class CustomEvent extends ApplicationEvent{
	
	// bu bir olay

	private static final long serialVersionUID = 1L; // farklı jbm ler arasında iletisimi saglarken bilginin kullanilmamasi icin.

	public CustomEvent(Object object){
		super(object);
	}

	@Override
	public String toString() {
		return "Custom Event";
	}
	
	
	
}
