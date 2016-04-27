package com.gokhangunay;

public class Adress {
	
	private String street;
	
	private String district;
	
	public Adress(String street, String district){
		this.street = street;
		this.district = district;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getDistrict() {
		return district;
	}

	public void setDistrict(String district) {
		this.district = district;
	}
	

}
