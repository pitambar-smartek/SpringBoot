package com.nareshit.spring;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;
import org.springframework.core.io.Resource;

public class SpringApplication {

	public static void main(String[] args) {
		Resource rs=new FileSystemResource("beans.xml");
		XmlBeanFactory factory=new XmlBeanFactory(rs);
		CustomerBean customerBean=(CustomerBean)factory.getBean("customerBean");
		System.out.println("Before calling customer bean");
		customerBean.expectFoodService();
		System.out.println("After calling customer bean");
		factory.destroySingletons();

	}

}
