package com.nikunj.springcore.beanFactoryDemo.demo;

/**
 * Purpose : Spring Bean Initialization using beanFactory interface with setter Initialization
 * 
 * @author Nikunj Balar
 *
 */
public class BeanFactorySetterDemo {
	
	private int id;
	private String name;

	//public default constructor 
	public BeanFactorySetterDemo() {
		System.out.println("bean Initialization using beanFactory with Setter");
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
