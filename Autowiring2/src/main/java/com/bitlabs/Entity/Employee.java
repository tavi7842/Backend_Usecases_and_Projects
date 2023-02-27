package com.bitlabs.Entity;

import org.springframework.beans.factory.annotation.Autowired;

public class Employee {

	@Autowired
	private Address add;

	public Address getAdd() {
		return add;
	}

	public void setAdd(Address add) {
		this.add = add;
	}

	public Employee(Address add) {
		super();
		this.add = add;
	}

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Employee [add=" + add + "]";
	}
	
	
}
