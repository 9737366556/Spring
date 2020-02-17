package com.nikunj.springcore.autowire.byName;

public class Address {

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
		System.out.println("data from byName autowire attribute");
		return "city = " + city + "\nstate = " + state;
	}
	
	
}
