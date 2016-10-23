package com.nareshit.service;

public class CoreConcernBean {
	public void add(int a,int b)throws OverValueException
	{
		if(a>100){
			throw new OverValueException("Ensure that the first argument is more than 100");
		}if(a<100){
			throw new UnderValueException("Please see the input value is not less than 100");
			
		}
		System.out.println("The Summation of two No is="+(a+b));
	}

}
