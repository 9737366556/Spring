package com.joker.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.joker.demo.Entity.RegistrationDTO;
import com.joker.demo.dao.Repository;

@Controller
public class KunjController {

	@Autowired
	private Repository dao;
	
	@RequestMapping("/")
	public ModelAndView home(RegistrationDTO dto) {
		ModelAndView mv = new ModelAndView();
		mv.addObject("msg", "data saved sucessfully ");
		mv.addObject("name",dto.getUserName());
		mv.setViewName("home");
		return mv;
	}
	
	@RequestMapping("/home.hasi")
	public ModelAndView register(RegistrationDTO dto) {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("registration");
		return mv;
	}

	@RequestMapping("/register.hasi")
	public ModelAndView home1(RegistrationDTO dto) {
		ModelAndView mv = new ModelAndView();
		dao.save(dto);

		mv.setViewName("home");
		return mv;
	}
	
	
}
