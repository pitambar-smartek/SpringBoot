package com.nareshit.spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeforeApplication {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context =new ClassPathXmlApplicationContext("beans.xml");
		CoreConcernBean bean=(CoreConcernBean)context.getBean("ccb");//core concern bean
		bean.x();
		bean.y();
		System.out.println("Everything might be fine");

	}

}
