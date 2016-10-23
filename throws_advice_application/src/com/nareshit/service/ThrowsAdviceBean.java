package com.nareshit.service;

import java.lang.reflect.Method;

import org.springframework.aop.ThrowsAdvice;

public class ThrowsAdviceBean implements ThrowsAdvice{
	public void afterThrowing(OverValueException e)throws Throwable
	{
		System.out.println("Core concern is advised");
		System.out.println(e.getMessage());
	}
	public void afterThrowing(UnderValueException e)
	{
		System.out.println("core concern is advised");
		System.out.println(e.getMessage());
	}
	public void afterThrowing(Method methodDetail,Object[] arguments,Object target,OverValueException e)throws Throwable
	{
		System.out.println(methodDetail.getName()+" is advised as"+ arguments[0]+" is more than 100");
		System.out.println(e.getMessage());
		
	}

}
