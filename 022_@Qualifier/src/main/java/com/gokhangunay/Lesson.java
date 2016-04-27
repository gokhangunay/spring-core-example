package com.gokhangunay;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Lesson {
	
	@Autowired //014 teki projeyi incelemenizi tavsiye ederim. //autowired ile qualifieri ayrimamak daha dogru.
	@Qualifier("beanStudent2") // calisma zamanindaki sectigimiz nesneyi getirir. Spring bean configde bir suru beanStudent var. Bunu kaldirirsak patlar :)
	private Student student;

	private int point;
	
	private String courseContent;
	
	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}

	public int getPoint() {
		return point;
	}

	public void setPoint(int point) {
		this.point = point;
	}

	public String getCourseContent() {
		return courseContent;
	}

	public void setCourseContent(String courseContent) {
		this.courseContent = courseContent;
	}

}
