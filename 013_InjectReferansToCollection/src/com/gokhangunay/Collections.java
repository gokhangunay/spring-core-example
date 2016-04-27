package com.gokhangunay;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class Collections {
	
	private List<Object> list;
	
	private Map<Object, Object> map;
	
	private Set<Object> set;
	
	private Properties properties;

	public Properties getProperties() {
		return properties;
	}

	public void setProperties(Properties properties) {
		this.properties = properties;
	}

	public Map<Object, Object> getMap() {
		return map;
	}

	public void setMap(Map<Object, Object> map) {
		this.map = map;
	}

	public Set<Object> getSet() {
		return set;
	}

	public void setSet(Set<Object> set) {
		this.set = set;
	}

	public List<Object> getList() {
		return list;
	}

	public void setList(List<Object> list) {
		this.list = list;
	}
	
	@Override
	public String toString(){
		return "List: " + list +
				"\nMap: " + map +
				"\nSet: " + set +
				"\nProperties: " + properties;
	}

}
