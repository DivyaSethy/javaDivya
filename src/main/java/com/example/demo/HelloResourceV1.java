package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;


public interface HelloResourceV1 {

	@GetMapping(path = "/hello")
	public String getHelloWorld(); 
	
	@GetMapping(path = "/welcome")
	public String getWelcomeMsg(); 
		
}
