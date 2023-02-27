package com.bitlabs.ApplicationContext;

public class Student {

	private String name;
	private int id;
	private Address add;

	public void setName(String name) {
		this.name = name;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setAdd(Address add) {
		this.add = add;
	}
	
	

	

	public Student(String name, int id, Address add) {
	super();
	this.name = name;
	this.id = id;
	this.add = add;
}

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public String toString() {
		return "Student [name=" + name + ", id=" + id + ", add=" + add + "]";
	}

}
