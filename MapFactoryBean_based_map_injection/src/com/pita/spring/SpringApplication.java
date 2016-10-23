package com.pita.spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringApplication {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ClassPathXmlApplicationContext contextSpringConainer = new ClassPathXmlApplicationContext(
				"beans.xml");
		DifferentStateEmployeeBean mapBean = (DifferentStateEmployeeBean) contextSpringConainer
				.getBean("mapBean");
		System.out.println("\nAccessing First Bean");
		System.out.println("-----------------------\n");
		mapBean.getValue();
		System.out.println("\nAccessing 2nd Bean");
		System.out.println("-----------------------\n");
		DifferentStateEmployeeBean mapBeanOne = (DifferentStateEmployeeBean) contextSpringConainer
				.getBean("mapBeanOne");

		mapBeanOne.getValue();
	}

}
