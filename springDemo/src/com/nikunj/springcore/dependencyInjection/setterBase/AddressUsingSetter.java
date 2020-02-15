package com.nikunj.springcore.dependencyInjection.setterBase;

public class AddressUsingSetter {
	private String city;
	private String state;

	public void setCity(String city) {
		this.city = city;
	}

	public void setState(String state) {
		this.state = state;
	}

	@Override
	public String toString() {
		return "city = " + city + "\nstate = " + state;
	}

}