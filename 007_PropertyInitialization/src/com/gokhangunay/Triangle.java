package com.gokhangunay;

public class Triangle {
	
	private String style; // property

	public void draw(){
		System.out.println(getStyle() + " Üçgen çiz...");
	}

	/**
	 * @author gokhangunay
	 * @return style
	 * @since 19/01/2016
	 * bu eklemeler getStyle() metodunun uzerine gelince cikar ve buda guzel bir kod ornegini temsil eder.
	 */
	public String getStyle() {
		return style;
	}

	public void setStyle(String style) {
		this.style = style;
	}
	
}
