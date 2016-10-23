package com.pitambar.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.pitambar.primaryconcern.PrimaryConcernBean;

public class AfterAdviceApplicatin {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
				"spring.xml");
		PrimaryConcernBean coreBean = (PrimaryConcernBean) context
				.getBean("coreBean");
		coreBean.addition(50, 84);
		System.out.println("After Advice is executed successfully");

	}

}
