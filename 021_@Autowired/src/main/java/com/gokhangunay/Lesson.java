package com.gokhangunay;

import org.springframework.beans.factory.annotation.Autowired;

public class Lesson {
	
	@Autowired //014 teki projeyi incelemenizi tavsiye ederim.
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
