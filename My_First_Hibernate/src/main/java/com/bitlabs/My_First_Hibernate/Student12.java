package com.bitlabs.My_First_Hibernate;

import javax.persistence.Entity;
import javax.persistence.Id;
//To create Table
@Entity
public class Student12 {
	//Primary Key
	@Id
	private int Id;
	private String Name;
	private int roll_no;
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public int getRoll_no() {
		return roll_no;
	}
	public void setRoll_no(int roll_no) {
		this.roll_no = roll_no;
	}
	@Override
	public String toString() {
		return "Student12 [Id=" + Id + ", Name=" + Name + ", roll_no=" + roll_no + "]";
	}

}
