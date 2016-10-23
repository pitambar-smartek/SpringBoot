package com.pitambar.secondarybean;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;

@Aspect
public class ThrowsAdviceBean {
	@After("execution(public int add(int ,int ))")
	public void logExceptionMessage(){
		System.out.println("With in the SecondaryConcernBean method");
		System.out.println("Core concern bean is advised");
	}

}
