package com.example.SpringDemoApp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

//@Component To achieve LOOSE COUPLING
@Component
public class Connection {

//	@Autowired To inject spring bean objects => 🟢 FIELD(variable) INJECTION
//	@Autowired
	private HelloWorld helloworld;
	
//	@Autowored To inject bean object => 🟢 CONSTRUCTOR INJECTION
	@Autowired
	public Connection(HelloWorld helloworld) {
		this.helloworld = helloworld;
		System.out.println(helloworld);
	}
	
	public void display() {
		System.out.println("Successfull");
		helloworld.add();
	}
}
