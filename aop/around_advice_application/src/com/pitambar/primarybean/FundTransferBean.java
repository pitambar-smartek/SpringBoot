package com.pitambar.primarybean;

public class FundTransferBean {
	public boolean transferFunds(int sourceAccount,int destinationAcccount,int transferAmound){
		System.out.println("Veryfying the amount from source account for funds transfer");
		boolean flag=false;
		if(transferAmound>2000)
		{
			flag=true;
		}
		return flag;
		
	}

}
