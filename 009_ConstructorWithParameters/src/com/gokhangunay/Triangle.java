package com.gokhangunay;

public class Triangle {

	private String style;
	
	private Integer height;
	
	private Double base;
	
	public Triangle(String style) {
		this.style = style;
	}
	
	public Triangle(Double base) {
		this.base = base;
	}
	
	public Triangle(String style, Integer height, Double base) {
		this.base = base;
		this.style = style;
		this.height = height;
	}
	
	public void draw(){
		System.out.println(getStyle() + " Üçgen çiz... " + "Yukseklik: " + getHeight() + " Taban: " + getBase());
	}
	
	public String getStyle() {
		return style;
	}

	public void setStyle(String style) {
		this.style = style;
	}
	
	public Integer getHeight() {
		return height;
	}

	public void setHeight(Integer height) {
		this.height = height;
	}

	public Double getBase() {
		return base;
	}

	public void setBase(Double base) {
		this.base = base;
	}


	
}
