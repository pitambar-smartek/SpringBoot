package com.pitambar.spring;

import org.springframework.beans.factory.annotation.Required;

public class InstituteBean {
	
	private StudentBean studentBean;
	private String instituteName;
	private int strength;
	public StudentBean getStudentBean() {
		return studentBean;
	}
	public String getInstituteName() {
		return instituteName;
	}
	public int getStrength() {
		return strength;
	}
	@Required	
	public void setStudentBean(StudentBean studentBean) {
		this.studentBean = studentBean;
	}
	public void setInstituteName(String instituteName) {
		this.instituteName = instituteName;
	}
	public void setStrength(int strength) {
		this.strength = strength;
	}
	

}
