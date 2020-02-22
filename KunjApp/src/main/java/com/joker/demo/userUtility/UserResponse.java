package com.joker.demo.userUtility;

import lombok.Getter;
import lombok.Setter;

/**
 * Purpose : For sending response 
 *  
 * @author Nikunj Balar
 *
 */
@Getter
@Setter
public class UserResponse {

	private String statusCode; // create status integer for user response
	private String message; // create message in String for give the user message
	// private Object data;
	
	public UserResponse(String statusCode ,String message) {
		this.statusCode = statusCode;
		this.message = message;
	}
}