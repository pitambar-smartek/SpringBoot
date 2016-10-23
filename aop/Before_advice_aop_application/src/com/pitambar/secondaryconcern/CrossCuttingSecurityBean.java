package com.pitambar.secondaryconcern;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;


@Aspect
public class CrossCuttingSecurityBean {
	//@Pointcut("within(com.pitambar.primaryconcern.*)")
	@Before("execution(public void enteringIntoYourLockerInBank())")
	public void security()
	{
		System.out.println("Security logic should be placed here");
		System.out.println("Security pass ya fail should me mention in log file");
	}
	
	public void securityOne()
	{
		System.out.println("hhhhhhhhhhhhhhhhhh");
		System.out.println("uuuuuuuuuuuuuuuuuuuuuuu");
	}


}
