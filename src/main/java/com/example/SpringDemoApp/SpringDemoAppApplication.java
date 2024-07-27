package com.example.SpringDemoApp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringDemoAppApplication {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		ConfigurableApplicationContext application = SpringApplication.run(SpringDemoAppApplication.class, args);
	
		System.out.println("Hello World!");
		
//		Connection connection = application.getBean(Connection.class);
//		connection.display();
		
//		Buy buy = application.getBean(Buy.class);
//		buy.buying();
        
//		----------🚫 TIGHTLY COUPLED 🚫---------
//		Connection con = new Connection();
//		con.display();
	}
}
