package com.bitlabs.SeleniumAnnotations;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component("maths")
//@Primary
public class MathsTeacher implements Teacher {

	public void teacher() {
		System.out.println("He is Teaching Maths");
	}
}
