package com.bitlabs.Entity;

public class Student {
	
	private String name;
	private int id;
	
	
	
	
	
public Student(String name, int id) {
		super();
		this.name = name;
		this.id = id;
		System.out.println("Integer Constructor method called");
	}

public Student(String name, String id) {
	super();
	this.name = name;
	this.id = Integer.parseInt(id);
	System.out.println("String Constructor method called");
}





//	public void setName(String name) {
//		this.name = name;
//		System.out.println("Calling Setter name");
//	}
//
//
//
//	public void setId(int id) {
//		this.id = id;
//		System.out.println("Calling Setter id");
//	}



	public void display() {
		System.out.println(name+" "+id);
	}

}
