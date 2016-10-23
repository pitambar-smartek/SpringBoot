package com.pita.spring;

import org.springframework.context.support.FileSystemXmlApplicationContext;

public class SpringApplication {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		FileSystemXmlApplicationContext contextSpringConainer=new FileSystemXmlApplicationContext("beans.xml");
		DifferentStateEmployeeBean mapBean=(DifferentStateEmployeeBean) contextSpringConainer.getBean("mapBean");
		mapBean.getValue();
		System.out.println("everything might be right");

	}

}
