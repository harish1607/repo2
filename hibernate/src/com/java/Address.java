package com.java;

public class Address {
	private int addressid;
	private String city;
	private String state;
	private String country;
	private String pincode;
	private Person person;
	
	public Address()
	{}

	public Address(int addressid, String city, String state, String country,
			String pincode, Person person) {
		super();
		this.addressid = addressid;
		this.city = city;
		this.state = state;
		this.country = country;
		this.pincode = pincode;
		this.person = person;
	}

	public int getAddressid() {
		return addressid;
	}

	public void setAddressid(int addressid) {
		this.addressid = addressid;
	}

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

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getPincode() {
		return pincode;
	}

	public void setPincode(String pincode) {
		this.pincode = pincode;
	}

	public Person getPerson() {
		return person;
	}

	public void setPerson(Person person) {
		this.person = person;
	}
	

}
