package com.nikunj.springcore.autowire.defaultAutowire;

public class EmployeeWithDefault {

	private String name;
	private AddressWithDefault addressWithDefault;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public AddressWithDefault getAddressWithDefault() {
		return addressWithDefault;
	}

	public void setAddressWithDefault(AddressWithDefault addressWithDefault) {
		this.addressWithDefault = addressWithDefault;
	}

	@Override
	public String toString() {
		System.out.println("data from defailt autowired attributr");
		return "name=" + name + "\n" + addressWithDefault;
	}

}
