package com.pita.spring;

public class EmployeeDetailBean {
	String stateName;
	int pinCode;
	String districtName;
	String homwTownName;
	String houseNo;
	

	public void setStateName(String stateName) {
		this.stateName = stateName;
	}


	public void setPinCode(int pinCode) {
		this.pinCode = pinCode;
	}


	public void setDistrictName(String districtName) {
		this.districtName = districtName;
	}


	public void setHomwTownName(String homwTownName) {
		this.homwTownName = homwTownName;
	}


	public void setHouseNo(String houseNo) {
		this.houseNo = houseNo;
	}


	public void displayEmployeeDetails()
	{
		System.out.println("The Employee Details:=:-"+"StateName::"+stateName+"   DistrictName::"+districtName+"    HomeTownName::"+homwTownName+"   HouseName::"+houseNo+"PinCode::"+pinCode);
	}

}
