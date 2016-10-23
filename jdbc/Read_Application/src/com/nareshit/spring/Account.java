package com.nareshit.spring;

public class Account {
	String namee;
	String ac;
	double balance;
	
	public void setName(String name) {
		this.namee = name;
	}
	
	public String getAccountno() {
		return ac;
	}

	public void setAccountno(String accountno) {
		this.ac = accountno;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}
	public void displayAccountDetail()
	{
		System.out.println("Account No::"+ac+"  Account Holder Name::"+namee+" Total Balance="+balance);
	}

}
