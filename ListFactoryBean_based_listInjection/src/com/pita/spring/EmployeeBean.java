package com.pita.spring;

public class EmployeeBean {
	String employeeName;
	String employeeEinNO;
	String employeeAddress;

	public EmployeeBean(String employeeName, String employeeEinNO,
			String employeeAddress) {
		super();
		this.employeeName = employeeName;
		this.employeeEinNO = employeeEinNO;
		this.employeeAddress = employeeAddress;
	}

	public void displayEmployeeDetails() {
		System.out.println("The Employee Name::" + employeeName
				+ "   Emp's Address::" + employeeAddress + "  Emp's EinNo::"
				+ employeeEinNO);
		
	}

}
