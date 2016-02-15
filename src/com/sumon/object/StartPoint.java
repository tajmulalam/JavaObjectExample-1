package com.sumon.object;

public class StartPoint {

	public static void main(String[] args) {
		
		Address address=new Address();
		address.setHouseNo("h/303");
		address.setRoadNo("33/a");
		address.setPostCode(2022);
		address.setDistrict("Dhaka");
		
		
		Person aPerson=new Person("Karim","Rahman","Badsha");
		aPerson.setPersonAddress(address);
//		aPerson.setFirstName("Karim");
//		aPerson.setMiddleName("Rahman");
//		aPerson.setLastName("Badsha");
//		
		System.out.println(aPerson.getPersonAddress().getFullAddres());
		System.out.println();
		
	}

}
