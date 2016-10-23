package com.pita.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class SpringApplication {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//XmlBeanFactory factory=new XmlBeanFactory(("beans.xml"));
		
		ApplicationContext context=new FileSystemXmlApplicationContext("beans.xml");
		CompanyBean bean=(CompanyBean)context.getBean("compantyBean");
		bean.employeesInCompany();
		
	    

	}

}
