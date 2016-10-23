package com.nareshit.spring;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;
import org.springframework.core.io.Resource;

public class SpringApplication {

	public static void main(String[] args) {
		Resource resource=new FileSystemResource("beans.xml");
	BeanFactory factory=new XmlBeanFactory(resource);
	HelloWorldBean bean=(HelloWorldBean)factory.getBean("hwb");
	bean.displayMessage();

	}

}
