package com.nikunj.springcore.autowire.byType;

public class EmployeeByType {

	private String name;
	private AddressByType addressByType;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public AddressByType getAddress() {
		return addressByType;
	}

	public void setAddress(AddressByType address) {
		this.addressByType = address;
	}

	@Override
	public String toString() {
		System.out.println("data from byType autowire attribute");
		return "name = " + name + "\n" + addressByType;
	}
}
