package com.gokhangunay;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class Student {
	
	private List<?> studentList;
	
	private Set<?> studentSet;
	
	private Map<?, ?> studentMap;
	
	private Properties studentProperties;

	public List<?> getStudentList() {
		return studentList;
	}

	public void setStudentList(List<?> studentList) {
		this.studentList = studentList;
	}

	public Set<?> getStudentSet() {
		return studentSet;
	}

	public void setStudentSet(Set<?> studentSet) {
		this.studentSet = studentSet;
	}

	public Map<?, ?> getStudentMap() {
		return studentMap;
	}

	public void setStudentMap(Map<?, ?> studentMap) {
		this.studentMap = studentMap;
	}

	public Properties getStudentProperties() {
		return studentProperties;
	}

	public void setStudentProperties(Properties studentProperties) {
		this.studentProperties = studentProperties;
	}

}
