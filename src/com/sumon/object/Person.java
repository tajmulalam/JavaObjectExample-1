package com.sumon.object;

public class Person {
	private String firstName;
	private String middleName;
	private String lastName;
	private Address personAddress;
	
	public void setPersonAddress(Address personAddress)
	{
		this.personAddress = personAddress;
	}
	
	public Address getPersonAddress()
	{
		return personAddress;
	}

	public Person(String firstName, String middleName, String lastName) {
		
		setFirstName(firstName);
		setMiddleName(middleName);
		setLastName(lastName);
	}
//	public Person() {
//		
//	}
	protected String getFirstName() {
		return firstName;
	}
	protected void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	protected String getMiddleName() {
		return middleName;
	}
	protected void setMiddleName(String middleName) {
		this.middleName = middleName;
	}
	protected String getLastName() {
		return lastName;
	}
	protected void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	
	public String  getFullName() {
		return firstName+" "+middleName+" "+lastName;
	}
}
