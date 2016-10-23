package com.nareshit.service;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class InitialClass {

	public static void main(String[] args) throws OverValueException {
		ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("beans.xml");
		CoreConcernBean bean=(CoreConcernBean)context.getBean("pfb");
		bean.add(100,20);
		bean.add(101, 20);
		bean.add(70, 20);
	}

}
