package com.example.SpringDemoApp;

import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Buy {
	
	private Shop shop;
	
//	@Autowired
//	public Buy(@Qualifier("vegPizza") Shop shop){
	
//	Here, we use vegPizza as reference for the class named VegPizza (First letter lowercase) because 
//	by default in IOC Container objects will be created with LOWERCASE for first letter of object.
	
	public Buy(Shop shop){
		this.shop = shop;
	}
	
	public void buying() {
		shop.getPizza();
	}
}

