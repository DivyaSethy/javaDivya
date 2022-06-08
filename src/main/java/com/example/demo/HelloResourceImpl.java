package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class HelloResourceImpl implements HelloResourceV1{

	@Autowired
	PrototypeBean bean;
	
	@Value("${APP_ENV}")
	private String env;
	
	@Override
	public String getHelloWorld() {
		// TODO Auto-generated method stub
		SingletonBean bean = new SingletonBean();
		System.out.println(bean + "" + this.bean.bean);
		return "hello world Divya " + env;
	}

	@Override
	public String getWelcomeMsg() {
		// TODO Auto-generated method stub
		return "welcome to devops journey " +env;
	}



}
