package com.gokhangunay;

public class Triangle {

	private String style;
	
	public Triangle(String style) {
		this.style = style;
	}
	
	public String getStyle() {
		return style;
	}

	public void setStyle(String style) {
		this.style = style;
	}
	
	public void draw(){
		System.out.println(getStyle() + " Üçgen çiz...");
	}
	
}
