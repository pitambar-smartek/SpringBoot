package com.nareshit.spring;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

public class InitialClass {

	public static void main(String[] args) {
		BeanFactory factory=new XmlBeanFactory(new FileSystemResource("beans.xml"));
		BookBean bean=(BookBean) factory.getBean("bookBeanOne");
		bean.displayBookDetails();

	}

}
