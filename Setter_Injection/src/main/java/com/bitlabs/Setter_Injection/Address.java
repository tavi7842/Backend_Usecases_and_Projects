package com.bitlabs.Setter_Injection;

import org.springframework.beans.factory.annotation.Autowired;

public class Address {
	
	private String city;
	private String area;
	
	@Autowired
	private Student stu;

//	public String getCity() {
//		return city;
//	}

	public void setCity(String city) {
		this.city = city;
	}

//	public String getArea() {
//		return area;
//	}

	public void setArea(String area) {
		this.area = area;
	}

//	public Student getStu() {
//		return stu;
//	}

	public void setStu(Student stu) {
		this.stu = stu;
	}

	@Override
	public String toString() {
		return "Address [city=" + city + ", area=" + area + ", stu=" + stu + "]";
	}
	
	
	

}
