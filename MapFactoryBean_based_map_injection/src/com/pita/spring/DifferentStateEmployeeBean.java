package com.pita.spring;

import java.util.Collection;
import java.util.Map;

public class DifferentStateEmployeeBean {
	Map<EmployeeNameBean, EmployeeDetailBean> map;

	public void setMap(Map<EmployeeNameBean, EmployeeDetailBean> map) {
		this.map = map;
	}
	public void getValue()
	{

		Collection<EmployeeDetailBean> allValues=map.values();
		System.out.println("---The EMPLOYEE DETAILS---");
		System.out.println("==============================");
		for(EmployeeDetailBean value:allValues)
		{
			value.displayEmployeeDetails();
			
		}
		
	}
	

}
