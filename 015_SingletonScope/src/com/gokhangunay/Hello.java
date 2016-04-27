package com.gokhangunay;

public class Hello {
	
	private String message;
	
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
