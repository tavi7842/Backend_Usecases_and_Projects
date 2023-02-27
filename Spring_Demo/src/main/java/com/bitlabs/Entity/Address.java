package com.bitlabs.Entity;

public class Address {
	
	private String city;
	private String place;
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getPlace() {
		return place;
	}
	public void setPlace(String place) {
		this.place = place;
	}
	@Override
	public String toString() {
		return "Address [city=" + city + ", place=" + place + "]";
	}
	
	
	

}
