package com.example.SpringDemoApp;

//import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class HelloWorld {

//	@Autowired
	public void add() {
		System.out.println("Add method");
	}
}

