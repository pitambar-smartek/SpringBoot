package com.pitambar.secondaryconcern;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;

@Aspect
public class CrossCuttingSecurityBean {
	@After("execution(public int addition( int ,int ))")
	public void afterReturning() {
		System.out.println("CrossCuttingConcernBean's After advice method is executed");
		System.out
				.println("This method is executed after the business method is execute");
		System.out
				.println("Here we write the logic to check the Verification of processed data");
	}

}
