package com.nikunj.springcore.autowire.constructor;

import com.nikunj.springcore.autowire.byType.AddressByType;

public class EmployeeConstructor {

	private String name;
	private AddressByType addressByType;

	public EmployeeConstructor(String name, AddressByType addressByType) {
		this.name = name;
		this.addressByType = addressByType;
	}
	
	public String getName() {
		return name;
	}
	
	public AddressByType getAddress() {
		return addressByType;
	}

	@Override
	public String toString() {
		System.out.println("data from constructor autowire attribute");
		return "name=" + name + "\n" + addressByType ;
	}
}
