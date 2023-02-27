package com.bitlabs.Entity;

/**
 * Hello world!
 *
 */
public class Airtel_Customer 
{
	private Service service;

	public void setService(Service service) {
		this.service = service;
	}
	
	public void display() {
		service.service();
	}
	
 
}
