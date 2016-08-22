package com.gokhangunay.model;

public class Personnel {
	
	private Integer idPersonnel;
	
	private String name;

	private String surname;
	
	private String experience;
	
	public Personnel(){
		
	}
	
	public Personnel(Integer idPersonnel){
		super();
		this.idPersonnel = idPersonnel;
	}
	
	public Personnel(String name, String surname, String experience) {
		super();
		this.name = name;
		this.surname = surname;
		this.experience = experience;
	}
	
	public Personnel(Integer idPersonnel, String name, String surname, String experience) {
		super();
		this.idPersonnel = idPersonnel;
		this.name = name;
		this.surname = surname;
		this.experience = experience;
	}
	
	public Integer getIdPersonnel() {
		return idPersonnel;
	}

	//aslinda buna gerek yoktu. bu islem db tarafindan auto incr. olacagindan dolayi. yinede bunu kullanirim diorsaniz ahanda burada :)
	public void setIdPersonnel(Integer idPersonnel) {
		this.idPersonnel = idPersonnel;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public String getExperience() {
		return experience;
	}

	public void setExperience(String experience) {
		this.experience = experience;
	}
	
	@Override
	public String toString() {
		return "Personnel Registration Number=" + idPersonnel + " \n"
				+ "Personel Name=" + name + " \n"
				+ "Personel Surname=" + surname + " \n"
				+ "Personel Experience= " + experience +"";
	}

}
