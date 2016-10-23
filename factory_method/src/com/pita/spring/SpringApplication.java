package com.pita.spring;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

public class SpringApplication {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		XmlBeanFactory factory=new XmlBeanFactory(new FileSystemResource("beans.xml"));
		EmployeeBean bean=(EmployeeBean)factory.getBean("employeeBean");
		bean.displayEmployeeDetail();
		System.out.println("Everythig is fine");

	}

}
