package com.nikunj.springcore.applicationContextDemo.demo;

/**
 * Purpose : Spring Bean Initialization using Application Context interface with setter Initialization
 * 
 * @author Nikunj Balar
 *
 */
public class SetterDemo {

	private int id;
	private String name;

	//public default constructor 
	public SetterDemo() {
		System.out.println("bean Initialization using Application Context with Setter");
	}

	// setter method for properties
	public void setId(int id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	// to show the value of the property
	public void show() {
		System.out.println(id + " " + name);
	}
}
