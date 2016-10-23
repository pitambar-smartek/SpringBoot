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

	public void displayEmployeeDetails()
	{
		System.out.println("The Employee Name:::"+employeeName+" Address:::"+employeeAddress+" EinNO:::"+employeeEinNO);
		/*System.out.println("The Employee Addres="+employeeAddress);
		System.out.println("The Employee EinNO="+employeeEinNO);*/
		//System.out.println("-------------------------------------------------");
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		
		result = prime * result
				+ ((employeeEinNO == null) ? 0 : employeeEinNO.hashCode());
		
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		EmployeeBean other = (EmployeeBean) obj;
		
		if (employeeEinNO == null) {
			if (other.employeeEinNO != null)
				return false;
		} else if (!employeeEinNO.equals(other.employeeEinNO))
			return false;
		
		return true;
	}
  

}
