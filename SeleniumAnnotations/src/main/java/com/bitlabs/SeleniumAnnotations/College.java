package com.bitlabs.SeleniumAnnotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("collegeBean")
public class College {
	
	@Value("${College.name}")
	private String name;
	
	@Autowired
	//@Qualifier("maths")
	private Teacher teacher;
	
	
	public void setTeacher(Teacher teacher) {
		this.teacher = teacher;
	}


	public void test() {
		System.out.println("Calling test method");
		teacher.teacher();
		System.out.println(name);
	}

}
