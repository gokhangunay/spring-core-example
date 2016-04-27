package com.gokhangunay;

public class B {

	private A aInstance;
	
	public B(A aInstance) {
		System.out.println("B constructor");
		this.aInstance = aInstance;
	}
	
	public void show(){
		System.out.println("Show B Class");
		this.aInstance.show();
	}

	public A getaInstance() {
		return aInstance;
	}

	public void setaInstance(A aInstance) {
		this.aInstance = aInstance;
	}

	
}
