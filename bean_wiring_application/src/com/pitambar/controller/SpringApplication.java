package com.pitambar.controller;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

public class SpringApplication {

	public static void main(String[] args) {
		XmlBeanFactory factory=new XmlBeanFactory(new FileSystemResource("beans.xml"));
		AccountController controller=(AccountController)factory.getBean("contollerBean");
		factory.destroySingletons();

	}

}
