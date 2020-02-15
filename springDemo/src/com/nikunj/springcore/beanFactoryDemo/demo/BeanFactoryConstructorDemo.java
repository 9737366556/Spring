package com.nikunj.springcore.beanFactoryDemo.demo;

/**
 * Purpose : Spring Bean Initialization using beanFactory interface with constructor Initialization
 * 
 * @author Nikunj Balar
 *
 */
public class BeanFactoryConstructorDemo {

	private String name;
	private int id;

	// public default constructor
	public BeanFactoryConstructorDemo(String name, int id) {
		System.out.println("bean Initialization using beanFactory with Setter");
		this.name = name;
		this.id = id;
	}
	
	// function to show the value of the property 
	public void show() {
		System.out.println(id + " " + name);
	}

}
