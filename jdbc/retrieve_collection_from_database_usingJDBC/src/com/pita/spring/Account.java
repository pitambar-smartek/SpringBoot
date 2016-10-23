package com.pita.spring;

public class Account {
	String accountNo;
	String name;
	double balance;
	public String getAccountNo() {
		return accountNo;
	}
	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public void display() {
		System.out.println("The Account Details"+name+" balance"+balance+" AccountNO"+accountNo);
		
	}
	

}
