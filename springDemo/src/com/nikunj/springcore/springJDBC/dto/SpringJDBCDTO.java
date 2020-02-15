package com.nikunj.springcore.springJDBC.dto;

public class SpringJDBCDTO {

	private int id;
	private String name;
	private int age;

	public SpringJDBCDTO(int id, String name, int age) {
		System.out.println("invoking "+this.getClass().getSimpleName());
		this.id = id;
		this.name = name;
		this.age = age;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	@Override
	public String toString() {
		return "id=" + id + "\nname=" + name + "\nage=" + age;
	}

}
