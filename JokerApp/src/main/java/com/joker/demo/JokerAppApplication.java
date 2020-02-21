package com.joker.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class JokerAppApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context=SpringApplication.run(JokerAppApplication.class, args);
	}

}
