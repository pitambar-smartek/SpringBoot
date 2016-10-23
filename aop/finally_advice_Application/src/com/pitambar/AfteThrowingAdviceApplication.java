package com.pitambar;

import java.util.Scanner;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.pitambar.corebean.CoreConcernBean;
import com.pitambar.exception.OverValueException;
import com.pitambar.exception.UnderValueException;

public class AfteThrowingAdviceApplication {

	public static void main(String[] args) throws OverValueException, UnderValueException {
		ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("spring.xml");
		CoreConcernBean bean=(CoreConcernBean) context.getBean("coreBean");
		Scanner scanner=new Scanner(System.in);
		System.out.println("Please Enter the FirstNo=");
		int a=scanner.nextInt();
		System.out.println("Please Enter the SecondNo=");
		int b=scanner.nextInt();
		System.out.println("The Summation of Two No="+bean.add(a, b));

	}

}
