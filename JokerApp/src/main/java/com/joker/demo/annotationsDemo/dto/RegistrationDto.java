package com.joker.demo.annotationsDemo.dto;

import org.springframework.stereotype.Component;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Component
@Getter
@Setter

@ToString
@EqualsAndHashCode
public class RegistrationDto {

	private int id;
	private String name;

	public RegistrationDto() {
		System.out.println("invoking " + this.getClass().getSimpleName());
	}

}
