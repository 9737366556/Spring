package com.nikunj.springcore.dependencyInjection.setterBase;

public class EmployeeUsingSetter {
	private int id;
	private String name;
	private AddressUsingSetter address;

	public void setId(int id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setAddress(AddressUsingSetter address) {
		this.address = address;
	}

	public void show() {
		System.out.println("employee details using setter injection \nid = " + id + "\nname = " + name);
		System.out.println(address.toString());
	}

}
