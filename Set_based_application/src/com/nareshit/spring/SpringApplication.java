package com.nareshit.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class SpringApplication {

	public static void main(String[] args) {
		ApplicationContext context=new FileSystemXmlApplicationContext("college.xml");
		CollegeBean collegeBean=(CollegeBean)context.getBean("collegeBean");
		collegeBean.displayCollegeDetails();
		System.out.println("Everything might be fine");
		

	}

}
