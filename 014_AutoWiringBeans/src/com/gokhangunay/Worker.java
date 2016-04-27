package com.gokhangunay;

public class Worker {

	private String name;
	
	private String surName;
	
	private Address address;
	
//	public Worker(Address address){
//		this.address = address;
//	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurName() {
		return surName;
	}

	public void setSurName(String surName) {
		this.surName = surName;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}
	
	@Override
	public String toString(){
		return "Worker address: " + this.getAddress().getFullAddress() +
				"/n Name: " + this.getName() +
				"/n Surname: " + this.getSurName();
	}
}
