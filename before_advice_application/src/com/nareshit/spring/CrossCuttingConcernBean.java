package com.nareshit.spring;

import java.lang.reflect.Method;

import org.springframework.aop.MethodBeforeAdvice;

public class CrossCuttingConcernBean implements MethodBeforeAdvice{

	@Override
	public void before(Method method, Object[] methodArguments, Object target)
			throws Throwable {
		System.out.println("Before advise ");
		System.out.println("Security logic applied to this method::"+method.getName());
	     if(methodArguments.length>0)
	     {
	    	 System.out.println("The argument is::"+methodArguments[0]);
	    	 methodArguments[0]="Omprakash Pattnaik";
	     }
	     System.out.println("The Target object is"+target.toString());
		
	}

}
