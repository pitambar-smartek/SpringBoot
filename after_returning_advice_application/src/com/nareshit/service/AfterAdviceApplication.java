package com.nareshit.service;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AfterAdviceApplication {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("beans.xml");
		AdditionBean bean=(AdditionBean) context.getBean("pfb");
		System.out.println(bean.add(52, 98));

	}

}
