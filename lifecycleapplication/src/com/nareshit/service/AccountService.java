package com.nareshit.service;

public class AccountService {

	private float balance;

	private AccountService() {
		System.out.println("Spring bean is instatiation");
	}

	public void setBalance(float balance) {
		this.balance = balance;
	}

	public float calculateInterest()

	{
		return (float) (balance * 0.5);
	}
	public void init()
	{
		System.out.println("The spring bean is initialized");
	}
	public void destroy()
	{
		System.out.println("The Spring Bean is destroyed");
	}

}
