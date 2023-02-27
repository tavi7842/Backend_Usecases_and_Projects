package com.bitlabs.SeleniumAutoWire;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;


public class Human {
	
	@Autowired
	@Qualifier("heart2")
	private Heart heart;

	

//	public Human() {
//		System.out.println("Constructor1 method called");
//	}
//
//
//	
//	public Human(Heart heart) {
//		this.heart = heart;
//		System.out.println("Constructor method called");
//	}
//
//	public void setHeart(Heart heart) {
//		this.heart = heart;
//		System.out.println("Setter method called");
//	}
	
	public void startPumping() {
		if(heart != null) {
			heart.pumping();
			System.out.println("Name of the Animal   "+heart.getName()+"     No.of Hearts   "+heart.getHearts());
		}
		else {
			System.out.println("You are dead");
		}
	}

}
