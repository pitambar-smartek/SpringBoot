package com.pita.spring;

public class PersonBean {
	String personName;
	String fatherName;
	String mohterName;
	String addresss;
	public void setPersonName(String personName) {
		this.personName = personName;
	}
	public void setFatherName(String fatherName) {
		this.fatherName = fatherName;
	}
	public void setMohterName(String mohterName) {
		this.mohterName = mohterName;
	}
	public void setAddresss(String addresss) {
		this.addresss = addresss;
	}
	public void displayPersonDetails()
	{
		System.out.println("PersonName::"+personName+" Father Name::"+fatherName+" Mother Name::"+mohterName+ "Address::"+addresss);
	}

}
