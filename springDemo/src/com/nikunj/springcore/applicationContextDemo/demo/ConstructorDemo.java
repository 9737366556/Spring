package com.nikunj.springcore.applicationContextDemo.demo;

/**
 * Purpose : Spring Bean Initialization using Application Context interface with
 * constructor Initialization
 * 
 * @author Nikunj Balar
 *
 */
public class ConstructorDemo {

	private String name;
	private int id;

	// public default constructor
	public ConstructorDemo(String name, int id) {
		this.name = name;
		this.id = id;
	}

	// function to show the value of the property
	public void show() {
		System.out.println("bean Initialization using Application Context with constructor");
		System.out.println(id + " " + name);
	}

}
