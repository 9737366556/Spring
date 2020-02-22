package com.joker.demo.dto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Transient;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;


/**
 * Purpose : All property required for application that are map with the table 
 *  
 * @author Nikunj Balar
 *
 */

@Getter
@Setter
@ToString

@Entity
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
	
	public User() {
		System.out.println("invoking "+this.getClass().getSimpleName());
	}
}
