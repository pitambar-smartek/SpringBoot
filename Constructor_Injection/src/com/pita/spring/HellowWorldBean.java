package com.pita.spring;

public class HellowWorldBean {
	String message;

	public HellowWorldBean(String message) {
		this.message = message;

	}
	public void displayMessage()
	{
		System.out.println("The Message is="+message);
	}

}
