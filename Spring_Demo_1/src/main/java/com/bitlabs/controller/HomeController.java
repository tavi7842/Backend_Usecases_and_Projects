package com.bitlabs.controller;

import org.springframework.stereotype.Controller;


@Controller
public class HomeController {
	
	
	@RequestMapping("/")
	public String home() {
		System.out.println("hello.....");
		return "hi";
	}

}
