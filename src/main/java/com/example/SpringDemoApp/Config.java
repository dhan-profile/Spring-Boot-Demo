package com.example.SpringDemoApp;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Configuration
//@Component
public class Config {
//	  @Bean
      public VegPizza vegPizza()
      {
    	  return new VegPizza();
      }
	  
//	  @Bean
	  public NonVegPizza nonVegPizza()
	  {
		  return new NonVegPizza();
	  }
	  
//	  @Bean
	  public Buy buy()
	  {
//		  return new Buy(vegPizza());
		  return new Buy(nonVegPizza());
	  }
}
