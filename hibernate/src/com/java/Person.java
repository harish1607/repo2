package com.java;

public class Person {
	private int personid;
    private String firstname;
    private String lastname;
    private Address address;
	
    public Person(){}

	public Person(int personid, String firstname, String lastname,
			Address address) {
		super();
		this.personid = personid;
		this.firstname = firstname;
		this.lastname = lastname;
		this.address = address;
	}

	public int getPersonid() {
		return personid;
	}

	public void setPersonid(int personid) {
		this.personid = personid;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}
	    

}
