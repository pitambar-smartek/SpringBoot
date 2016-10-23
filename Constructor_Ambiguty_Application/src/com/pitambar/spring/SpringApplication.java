package com.pitambar.spring;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

public class SpringApplication {

	public static void main(String[] args) {
		XmlBeanFactory factory=new XmlBeanFactory(new FileSystemResource("beans.xml"));
		EmployeeBean employeeBean=(EmployeeBean) factory.getBean("employeeBean");
		employeeBean.displayEmployeeDetails();

	}

}
