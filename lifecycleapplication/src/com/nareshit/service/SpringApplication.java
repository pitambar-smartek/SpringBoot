package com.nareshit.service;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;
import org.springframework.core.io.Resource;

public class SpringApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Resource rc;
		XmlBeanFactory bf;
		rc=new FileSystemResource("beans.xml");
		bf=new XmlBeanFactory(rc);
		AccountService serviceBean=(AccountService)bf.getBean("seviceBean");
	    float interest=serviceBean.calculateInterest();
	    System.out.println("The interest is="+interest);
	   // serviceBean.destroy();
	   bf.destroySingletons();

		
		
		
	}

}
