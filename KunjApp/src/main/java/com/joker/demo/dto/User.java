package com.joker.demo.dto;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Transient;

import lombok.Data;

@Data
public class User {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	private String userName;
	private long number;
	private String email;
	private String password;
	@Transient
	private String conformPassword;
}
