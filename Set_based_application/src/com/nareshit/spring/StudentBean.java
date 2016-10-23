package com.nareshit.spring;

public class StudentBean {
	String studentName;
	String rollNo;
	String address;
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public void setRollNo(String rollNo) {
		this.rollNo = rollNo;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public void displayStudentDetails()
	{
		System.out.println("The studentName::"+studentName+" RollNo::"+rollNo+"  Address::"+address);
	}

}
