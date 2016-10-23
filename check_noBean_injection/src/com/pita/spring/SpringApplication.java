package com.pita.spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringApplication {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("beans.xml");
		AccountListBean bean=(AccountListBean) context.getBean("accountListBean");
		Account acc=bean.getAccount();
		acc.displayAccountDetail();
		System.out.println("Account is may get executed");

	}

}
