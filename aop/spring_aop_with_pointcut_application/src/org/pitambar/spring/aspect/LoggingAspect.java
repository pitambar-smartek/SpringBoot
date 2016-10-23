package org.pitambar.spring.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class LoggingAspect {

	//@Before("execution(* get*())")
	@Before("allGetters()")
	public void LoggingAdvice(){
		System.out.println("Advice run. Get method is called");
	}
	
	//@Before("execution(* get*())")
	@Before("allGetters()")
	public void secondAdvice(){
		System.out.println("Second Advice Execeuted");
	}
	
	//@Pointcut("execution(* get*())")
    @Pointcut("execution(* org.pitambar.spring.model.Circle.get*())")  
	//@Pointcut("within(org.pitambar.spring.model.Triangle)")
	public void allGetters(){} //dummy method that hold all pointcut methods
	
}
