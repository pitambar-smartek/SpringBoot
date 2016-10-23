package com.pita.spring;
public class HelloWorldBean {
	private String message;
	public void setMessage(String message)
	{
		this.message=message;
	}
	/**
	 * This method display the  Spring bean's message
	 */
	public void display()
	{
		System.out.println(message);
	}

}
