package com.joker.demo.annotationsDemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.joker.demo.annotationsDemo.dto.RegistrationDto;

@Controller
public class JokerController {
	
	@RequestMapping("/")
	public ModelAndView home(RegistrationDto dto) {
		ModelAndView mv = new ModelAndView();
		mv.addObject("obj",dto);
		mv.setViewName("home");	
		return mv;
	}
	
	@RequestMapping("/home")
	public ModelAndView save(RegistrationDto dto) {
		
		ModelAndView mv = new ModelAndView();
		mv.addObject("name" , dto.getName());
		mv.setViewName("success");
		
		return mv;
	}
}
