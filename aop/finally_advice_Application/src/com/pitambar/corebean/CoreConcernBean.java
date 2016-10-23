package com.pitambar.corebean;

import com.pitambar.exception.OverValueException;
import com.pitambar.exception.UnderValueException;

public class CoreConcernBean {
	public int add(int a,int b)throws OverValueException,UnderValueException
	{
		System.out.println("With in Business method");
		int sum=a+b;
		if(sum<100){
			throw new UnderValueException();
		}
		if(sum>200){
			throw new OverValueException();
			
		}
		return sum;
	}

}
