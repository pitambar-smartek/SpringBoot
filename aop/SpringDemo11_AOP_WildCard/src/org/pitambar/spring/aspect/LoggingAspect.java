package org.pitambar.spring.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class LoggingAspect {

	//@Before("execution(public String org.pitambar.spring.model.Circle.getName())")//exact matches the name of the method
	//@Before("execution(public String get*())")//starting with get+any other
	//@Before("execution(public * get*())") //any return type and after get+any as method name
	//@Before("execution(* get*())")//0 args any return type
	//@Before("execution(* get*(*))")//1 to many args
	//@Before("execution(* get*(..))")//0 to any number of args
	@Before("execution(* org.pitambar.spring.model.*.get*(..))")
	public void LoggingAdvice(){
		System.out.println("Advice run. Get method is called");
	}
	int i=0;
	@Before("execution(public * get*())")
	public void secondAdvice(){
		System.out.println("Second Advice Execeuted"+i);
		i++;
	}
	
}
