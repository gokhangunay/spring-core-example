package com.gokhangunay;

public class Hello {

	private String message;
	
	public void initHello(){ // @PostConstructor
		System.out.println("Bean start");
	}
	
	public void destroyHello(){ // @PreDestroy
		System.out.println("Bean finish");
	}
	
	public void show(){
		System.out.println(this.getMessage());
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
}
