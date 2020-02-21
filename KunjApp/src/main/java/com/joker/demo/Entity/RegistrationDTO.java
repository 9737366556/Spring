package com.joker.demo.Entity;

import lombok.Data;

@Data
public class RegistrationDTO {
	
	private int id;
	private String userName;
	private String gender;
	private String password;
	private String conformPassword;
}
