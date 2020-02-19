package com.joker.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.joker.demo.annotationsDemo.controller.JokerController;

@SpringBootApplication
public class JokerAppApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context=SpringApplication.run(JokerAppApplication.class, args);
		
		JokerController controller = context.getBean(JokerController.class); 
		controller.toString();
		
	}

}
