package com.gokhangunay;

public class Words {

	private String sentence;

	public String getSentence() {
		return sentence;
	}

	public void setSentence(String sentence) {
		this.sentence = sentence;
	}
	
	public void show(){
		System.out.println(getSentence());
	}
	
}
