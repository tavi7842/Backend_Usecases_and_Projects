package com.bitlabs.Selenium_Express;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.bitlabs.Entity.Airtel_Customer;

public class App {

	public static void main(String[] args) {
		
		System.out.println("Hello Customer");
		
		ApplicationContext context = new ClassPathXmlApplicationContext("configure.xml");
		
		Airtel_Customer airtel = (Airtel_Customer) context.getBean("airtel");
		
		airtel.display();

	}

}
