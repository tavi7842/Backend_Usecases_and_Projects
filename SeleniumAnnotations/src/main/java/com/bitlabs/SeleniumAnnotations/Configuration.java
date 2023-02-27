package com.bitlabs.SeleniumAnnotations;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.PropertySource;

@org.springframework.context.annotation.Configuration
@ComponentScan(basePackages = "com.bitlabs.SeleniumAnnotations")
@PropertySource("classpath:info.properties")
public class Configuration {
	
//	@Bean
//	public College collegeBean() {
//		College college = new College();
//		
//		return college;
//	}
//	
//	@Bean
//	public Teacher teacherBean() {
//		
//		Teacher teach = new MathsTeacher();
//		
//		return teach ;
//	}
//	
//	@Bean
//	public Teacher teacherBean1() {
//		
//		Teacher teach = new ScienceTeacher();
//		
//		return teach ;
//	}

}
