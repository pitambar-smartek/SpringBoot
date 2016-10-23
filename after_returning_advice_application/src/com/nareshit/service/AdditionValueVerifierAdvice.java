package com.nareshit.service;

import java.lang.reflect.Method;

import org.springframework.aop.AfterReturningAdvice;

public class AdditionValueVerifierAdvice implements AfterReturningAdvice{

	
	public void afterReturning(Object returnValue, Method methodDetail, Object[] argumentDetail,
			Object targetObject) throws Throwable {
		System.out.println(methodDetail.getName()+"is intercepted");
		System.out.println("The Summation value is::"+returnValue);
		System.out.println(argumentDetail.length+"The length of sum method "+" The argumentOne is="+argumentDetail[0]+" The argumentTwo is="+argumentDetail[1]);
		System.out.println("The Target Object="+targetObject);
		int sum=(Integer)returnValue;
		if(sum<100)
		{
			throw new RuntimeException();
		}
		
	}

}
