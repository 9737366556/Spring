package com.joc.annotationDemo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.joc.annotationDemo.dto.MatrimonyDTO;
import com.joc.annotationDemo.services.MatrimonyService;

@Controller
@RequestMapping("/")
public class MatrimonyController {

	@Autowired
	MatrimonyService service;

	public MatrimonyController() {
		System.out.println("invoking " + this.getClass().getSimpleName());
	}

	@RequestMapping(value = "/matrimony.joker" ,method = RequestMethod.POST)
	public String onRegistration(MatrimonyDTO dto, ModelMap map) {

		map.addAttribute("dto", dto);
		boolean save = this.service.validAndSave(dto);
		if (save) {
			System.out.println("Saved sucessfully");
			return "success.html";
		} else
			return "register.html";
	}
}
