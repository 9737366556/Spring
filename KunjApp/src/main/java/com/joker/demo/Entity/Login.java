package com.joker.demo.Entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * Purpose : loginEntity with all the field required for login 
 *  
 * @author Nikunj Balar
 *
 */

@Getter
@Setter
@ToString
public class Login {

	private String userName;
	private String password;
	
	public Login() {
		System.out.println("invoking "+this.getClass().getSimpleName());
	}
}
