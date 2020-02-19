package com.joker.demo.annotationsDemo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.joker.demo.annotationsDemo.dto.RegistrationDto;

@Controller
public class JokerController {

	@Autowired
	private RegistrationDto dto;
	
	@RequestMapping("home")
	public String home() {
		
		dto.setId(12);
		dto.setName("nikunj");
		
		System.out.println("hi hello");
		System.out.println(dto.getId()+dto.getName() +" kem cho maja ma ");
		
		return "home.jsp";
	}
}
