package com.joker.demo.Entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * Purpose : register entity with required field for registration 
 *  
 * @author Nikunj Balar
 *
 */

@Getter
@Setter
@ToString
public class Register {

	private String userName;
	private long number;
	private String email;
	private String password;
	private String conformPassword;
	
	public Register(){
		System.out.println("invoking "+this.getClass().getSimpleName());
	}
}
