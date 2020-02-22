package com.joker.demo.service;

import com.joker.demo.Entity.Login;
import com.joker.demo.Entity.Register;
import com.joker.demo.userUtility.UserResponse;

/**
 * Purpose : service for validation on the repository
 *  
 * @author Nikunj Balar
 *
 */
public interface UserService {

	public UserResponse saveUser(Register register);
	
	public UserResponse login(Login login);
}
