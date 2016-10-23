package com.pita.spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringApplication {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("beans.xml");
		PersonBean personBean=(PersonBean)context.getBean("personBean");
		personBean.displayPersonDetails();
		System.out.println("everything might be fine");

	}

}
