package com.gokhangunay;

public class Hello {

	private String message1;
	
	private String message2;
	
	public void show(){
		System.out.println(this.getMessage1()+ "\n" + this.getMessage2());
	}

	public String getMessage1() {
		return message1;
	}

	public void setMessage1(String message1) {
		this.message1 = message1;
	}

	public String getMessage2() {
		return message2;
	}

	public void setMessage2(String message2) {
		this.message2 = message2;
	}
	
	
	
}
