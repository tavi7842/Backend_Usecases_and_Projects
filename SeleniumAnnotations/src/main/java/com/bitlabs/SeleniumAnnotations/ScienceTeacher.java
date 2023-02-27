package com.bitlabs.SeleniumAnnotations;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component("science")
@Primary
public class ScienceTeacher implements Teacher {

	public void teacher() {
		System.out.println("He is Teaching Science");
		
	}

}
