package com.nareshit.spring;

public class HelloWorldBean {
	String message;

	public HelloWorldBean(String message) {
		
		this.message = message;
	}
	public void displayMessage()
	{
		System.out.println("The message is="+message);
	}

}
