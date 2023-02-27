package com.bitlabs.Setter_Injection;

import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.beans.factory.annotation.Required;
import org.springframework.beans.factory.annotation.Value;

public class Student {

	private int id;
	private String name;
	private String college;
//	private List<String> list;
//	private Set<String> set;
//	private Map<Integer,String> map;
//	public int getId() {
//		return id;
//	}
	@Value("${student.id}")
	public void setId(int id) {
		this.id = id;
	}
//	public String getName() {
//		return name;
//	}
	@Required
	@Value("")
	public void setName(String name) {
		this.name = name;
	}
//	public String getCollege() {
//		return college;
//	}
	@Value("${student.college}")
	public void setCollege(String college) {
		this.college = college;
	}
//	public List<String> getList() {
//		return list;
//	}
//	public void setList(List<String> list) {
//		this.list = list;
//	}
//	public Set<String> getSet() {
//		return set;
//	}
//	public void setSet(Set<String> set) {
//		this.set = set;
//	}
//	public Map<Integer, String> getMap() {
//		return map;
//	}
//	public void setMap(Map<Integer, String> map) {
//		this.map = map;
//	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", college=" + college + "]";
	}
	
	
	
	
}
