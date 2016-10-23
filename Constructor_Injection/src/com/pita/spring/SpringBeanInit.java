package com.pita.spring;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

public class SpringBeanInit {

	
	public static void main(String[] args) {
		XmlBeanFactory factory=new XmlBeanFactory(new FileSystemResource("beans.xml"));
		HellowWorldBean bean=(HellowWorldBean)factory.getBean("hwb");
		bean.displayMessage();
		
		
	}

}
