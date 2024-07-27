package com.example.SpringDemoApp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
//import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Primary
@Component
public class VegPizza implements Shop{

	@Autowired
	public void getPizza() {
		System.out.println("This is VEG Pizza");
	}
}
