package com.example.demo;

import org.springframework.web.bind.annotation.RestController;



@RestController
public class HelloResourceImpl implements HelloResourceV1{


	@Override
	public String getHelloWorld() {
		// TODO Auto-generated method stub
		return "hello world Divya";
	}

	@Override
	public String getWelcomeMsg() {
		// TODO Auto-generated method stub
		return "welcome to devops journey";
	}



}
