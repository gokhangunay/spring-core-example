package com.gokhangunay;

public class Car {

	private Fuel fuel;
	
//	public Car(){
//		this.fuel = new Fuel();
//	}
	
	public Car(Fuel fuel){
		this.fuel = fuel;
	}
	
	public void moveOn(){
		fuel.tank();
		System.out.println("Car is moving!");
	}
	
}
