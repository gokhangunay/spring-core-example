package com.gokhangunay;

public class Student {
	
	private String name;
	
	private String surName;
	
	private String department;
	
	private int age;

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

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString(){
		return "Name: " + name +
				"\nSurname: " + surName+
				"\nDepartment: " + department +
				"\nAge: " + age;
	}
	
}
