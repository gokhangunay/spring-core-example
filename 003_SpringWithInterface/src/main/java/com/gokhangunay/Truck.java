package com.gokhangunay;

public class Truck {

	private Fuel fuel;
	
//	public Car(){
//		this.fuel = new Fuel();
//	}
	
	public Truck(Fuel fuel){
		this.fuel = fuel;
	}
	
	public void moveOn(){
		fuel.tank();
		System.out.println("Truck is moving!");
	}
	
}
