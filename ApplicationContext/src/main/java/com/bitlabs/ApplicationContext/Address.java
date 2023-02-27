package com.bitlabs.ApplicationContext;

public class Address {

	private String area;
	private String city;

	public void setArea(String area) {
		this.area = area;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getArea() {
		return area;
	}

	public String getCity() {
		return city;
	}

	@Override
	public String toString() {
		return "Address [area=" + area + ", city=" + city + "]";
	}
}
