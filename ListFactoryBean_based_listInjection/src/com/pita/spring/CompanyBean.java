package com.pita.spring;

import java.util.List;

public class CompanyBean {
	String compantyName;
	List<EmployeeBean> employeeList;
	
	public void setCompantyName(String compantyName) {
		this.compantyName = compantyName;
	}
	
	public void setEmployeeList(List<EmployeeBean> employeeList) {
		this.employeeList = employeeList;
	}
	public void employeesInCompany()
	{
		System.out.println("The Company Name:::"+compantyName);
		for(EmployeeBean employeBean:employeeList)
		{
			employeBean.displayEmployeeDetails();
		}
	}
	

}
