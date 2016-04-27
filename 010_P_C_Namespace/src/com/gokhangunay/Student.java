package com.gokhangunay;

public class Student {
	
	private String name;
	
	private String surName;
	
	private Integer number;
	
	private School universty; 
	
	private Adress adress;
	
//	alt satirdaki constructori neden yorum satiri haline getirdim? 
//	ben spring.xml icerisinde bunlara propertyler ekledim. ve gittim bunlara deger atamasi yaptim.
//	bu deger atamasi yapiosan constructor ne boka yariyor o zaman derler adama.
//	ama eger bos bir tane daha constructor olsaydi patlamazdi spring.xml.
//	aslinda defaultta bos constructor var. ama sen yeni olusturunca eziosun bos olani.
	
//	public Student(String name, String surName, Integer number){
//		this.name = name;
//		this.surName = surName;
//		this.number = number;
//	}
	
	public Student(){ // spring xml hata vermemesi icin bos paramereliyi actik.
		
	}
	
	public Student(Adress adress){ // spring xml constructoer referansli olsun die olusturduk.
		this.adress = adress;
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

	public Integer getNumber() {
		return number;
	}

	public void setNumber(Integer number) {
		this.number = number;
	}

	public School getUniversty() {
		return universty;
	}

	public void setUniversty(School universty) {
		this.universty = universty;
	}

	public Adress getAdress() {
		return adress;
	}

	public void setAdress(Adress adress) {
		this.adress = adress;
	}

}
