package com.pitambar.spring;

public class EmployeeBean {
	String name;
	String designation;
	float salary;

	public EmployeeBean(String name, String designation) {
		this.name = name;
		this.designation = designation;
	}
	public EmployeeBean(float salary,String name)
	{
		this.name=name;
		this.salary=salary;
	}
	public void displayEmployeeDetails()
	{
		System.out.println("The employee name="+name);
		System.out.println("The employee salary="+salary);
		System.out.println("The Designation="+designation);
	}

}
