package com.joker.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.joker.demo.Entity.Login;
import com.joker.demo.Entity.Register;
import com.joker.demo.service.UserService;
import com.joker.demo.userUtility.UserResponse;

/**
 * Purpose : for controlling the application API 
 *  
 * @author Nikunj Balar
 *
 */
@RestController
@RequestMapping("/api")
public class KunjController {

	@Autowired
	UserService service;

	// function for register the the details 
	@PostMapping("/register")
	public ResponseEntity<UserResponse> register(Register register) {
		// return the response to the client
		return new ResponseEntity<UserResponse>(service.saveUser(register), HttpStatus.OK);
	}

	// function for login 
	@GetMapping("/login")
	public ResponseEntity<UserResponse> login(Login login) {
		// return response to the client
		return new ResponseEntity<UserResponse>(service.login(login), HttpStatus.OK);
	}
}
