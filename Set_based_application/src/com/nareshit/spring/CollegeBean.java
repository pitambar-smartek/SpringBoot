package com.nareshit.spring;

import java.util.Set;

public class CollegeBean {
	String name;
	private Set<StudentBean> students;
	public void setName(String name) {
		this.name = name;
	}
	public void setStudents(Set<StudentBean> students) {
		this.students = students;
	}
	public void displayCollegeDetails()
	{
		System.out.println("The college Name::"+name);
		for(StudentBean st:students)
		{
			st.displayStudentDetails();
		}
	}

}
