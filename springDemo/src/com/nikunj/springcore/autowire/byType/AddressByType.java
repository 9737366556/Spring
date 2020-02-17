package com.nikunj.springcore.autowire.byType;

public class AddressByType {

	private String city;
	private String state;
	
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	@Override
	public String toString() {
		return "city = " + city + "\nstate = " + state;
	}
	
	
}
