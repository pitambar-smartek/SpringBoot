package com.nareshit.dto;

public class Account {
	String accountNo;
	double balance;
	String name;
	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void displayAccountDetail(){
		System.out.println("Th accountNO="+accountNo+" Account Holder's Name="+name+ " Total Available Balance="+balance);
	}
	public String getAccountNo() {
		return accountNo;
	}
	public double getBalance() {
		return balance;
	}
	public String getName() {
		return name;
	}
	
	

}
