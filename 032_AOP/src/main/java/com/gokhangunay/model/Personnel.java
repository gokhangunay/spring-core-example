package com.gokhangunay.model;

public class Personnel {

	private String name;
	
	private String surName;
	
	private String experience;

	public void personelNameAndSurnameControl(){
		System.out.println(" AOP ------ personelNameAndSurnameControl");
		if(getName().length() < 2 || getSurName().length() < 2){
			throw new IllegalArgumentException();
		}
	}
	
	public void hello(String messages){
		System.out.println(" AOP ------ hello");
		System.out.println(" Messages: " + messages);
	}

	public void personelInfo(){
		System.out.println(" AOP ------ personelInfo");
		System.out.println("Name: " + getName() +
				"\n Surname: " + getSurName() +
				"\n Experience: " + getExperience());
	}

	
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

	public String getExperience() {
		return experience;
	}

	public void setExperience(String experience) {
		this.experience = experience;
	}
}
