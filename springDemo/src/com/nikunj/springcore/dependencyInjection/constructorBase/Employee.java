package com.nikunj.springcore.dependencyInjection.constructorBase;

public class Employee {
	private int id;
	private String name;
	private Address address;
	
	public Employee(int id , String name ,Address address) {
		this.id = id;
		this.name = name ;
		this.address = address;
	}
	
	public void show() {
		System.out.println("employee details using constructor injection \nid = "+id+"\nname = "+ name);
		System.out.println(address.toString());
	}
}
