package com.pita.spring;

public class Account {
	String accountNo;
	String name;
	double balance;
	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public void displayAccountDetail(){
		System.out.println("Account No="+accountNo+" Name"+name+" Balance::="+balance);
	}

}
