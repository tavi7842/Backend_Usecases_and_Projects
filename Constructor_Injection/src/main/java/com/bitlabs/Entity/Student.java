package com.bitlabs.Entity;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Student {
	
	private int id;
	private String name;
	private String city;
	private List<String> list;
	private Set<Integer> set;
    private Map<Integer,String> map;
    
	public Student(int id, String name, String city, List<String> list, Set<Integer> set, Map<Integer, String> map) {
		super();
		this.id = id;
		this.name = name;
		this.city = city;
		this.list = list;
		this.set = set;
		this.map = map;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", city=" + city + ", list=" + list + ", set=" + set + ", map="
				+ map + "]";
	}
	 
	
//	public Student(int id, String name, String city) {
//		super();
//		this.id = id;
//		this.name = name;
//		this.city = city;
//	}
//
//
//	@Override
//	public String toString() {
//		return "Student [id=" + id + ", name=" + name + ", city=" + city + "]";
//	}
	
	
	

}
