package org.pita.spring;

public class Address {
private String houseNo;
private String homeTown;
private String streetName;
public void setHouseNo(String houseNo) {
	this.houseNo = houseNo;
}
public void setHomeTown(String homeTown) {
	this.homeTown = homeTown;
}
public void setStreetName(String streetName) {
	this.streetName = streetName;
}
public void displayAddressDetails()
{
	System.out.println("HouseNo"+houseNo+" HomeTown="+homeTown+" StreetName="+streetName);
}

}
