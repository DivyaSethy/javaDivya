package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Lookup;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(value = ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class PrototypeBean {
	
	@Autowired
	SingletonBean bean;
	
	public PrototypeBean() {
		System.out.println("in PrototypeBean class");
	}
	
	@Lookup
	SingletonBean createObject() {
		return null;
	}
	
	public SingletonBean getObject() {
		return this.createObject();
	}

}
