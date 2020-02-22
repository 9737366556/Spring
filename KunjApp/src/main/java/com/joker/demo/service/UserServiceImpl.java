package com.joker.demo.service;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Service;

import com.joker.demo.Entity.Login;
import com.joker.demo.Entity.Register;
import com.joker.demo.dto.User;
import com.joker.demo.repository.UserRepository;
import com.joker.demo.userUtility.Jms;
import com.joker.demo.userUtility.Jwt;
import com.joker.demo.userUtility.UserResponse;

/**
 * Purpose : Implementation of service interface 
 *  
 * @author Nikunj Balar
 *
 */
@Service
@PropertySource(value = { "messages.properties" })
public class UserServiceImpl implements UserService {

	@Autowired 
	private UserRepository repository;

	@Autowired
	private Jms jms;
	
	@Autowired
	private Jwt jwt;

	@Autowired
	private Environment environment;

	public UserServiceImpl() {
		System.out.println("invoking " + this.getClass().getSimpleName());
	}

	@Override
	public UserResponse saveUser(Register register) {
		boolean save = false;
		User user = new User();
		BeanUtils.copyProperties(register, user);
		if (user.getPassword().equals(user.getConformPassword())) {
			repository.save(user);
			save = true;
		}
		if (save) {
			String token=jwt.createToken(register.getEmail());
			jms.sendMail(register.getEmail(), token);
			return new UserResponse(environment.getProperty("USER_REGISTERD"),
					environment.getProperty("SERVER_CODE_SUCCESS"));
		} else
			return new UserResponse(environment.getProperty("INVALID_PASSWORD"),
					environment.getProperty("SERVER_CODE_ERROR"));
	}

	@Override
	public UserResponse login(Login login) {

		boolean valid = false;
		User user = repository.findByUserName(login.getUserName());
		if (user == null)
			System.out.println("userNotFound");
		else {
			if (login.getUserName().equals(user.getUserName())) {
				if (login.getPassword().equals(user.getPassword())) {
					valid = true;
				}
			}
		}
		if (valid)
			return new UserResponse(environment.getProperty("LOGIN_SUCCESS"),
					environment.getProperty("SERVER_CODE_SUCCESS"));
		else
			return new UserResponse(environment.getProperty("INVALID_CREDENTIALS"),
					environment.getProperty("SERVER_CODE_ERROR"));
	}
}
