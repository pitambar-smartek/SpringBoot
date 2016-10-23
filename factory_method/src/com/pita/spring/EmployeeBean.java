package com.pita.spring;

public class EmployeeBean {
	String name;
	String einNo;
	String companyName;
	public void setName(String name) {
		this.name = name;
	}
	public void setEinNo(String einNo) {
		this.einNo = einNo;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	public void displayEmployeeDetail()
	{
		System.out.println("The employee Name="+name);
		System.out.println("The Employee's company Name="+companyName);
		System.out.println("The Employee's einNO="+einNo);
	}
	public static EmployeeBean getInstance(){
		System.out.println("getInstance method is executed by spring container");
		return new EmployeeBean();
	}
	

}
