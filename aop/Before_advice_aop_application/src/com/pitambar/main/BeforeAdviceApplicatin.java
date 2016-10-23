package com.pitambar.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.pitambar.primaryconcern.PrimaryConcern;
import com.pitambar.primaryconcern.PrimaryConcernBean;

public class BeforeAdviceApplicatin {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
				"spring.xml");
		PrimaryConcernBean coreBean = (PrimaryConcernBean) context
				.getBean("coreBean");
		coreBean.enteringIntoYourLockerInBank();
		
		
		PrimaryConcern con=(PrimaryConcern)context.getBean("core");
		con.enteringIntoYourLockerInBank();
		System.out.println("Before Advice is executed successfully");

	}

}
