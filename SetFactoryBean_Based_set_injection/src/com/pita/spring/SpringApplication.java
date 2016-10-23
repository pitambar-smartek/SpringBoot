package com.pita.spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringApplication {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// XmlBeanFactory factory=new XmlBeanFactory(("beans.xml"));

		// ApplicationContext context=new
		// FileSystemXmlApplicationContext("beans.xml");
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
				"beans.xml");
		CompanyBean bean = (CompanyBean) context.getBean("compantyBean");
		System.out.println("\nDisplay Contractual Employee of SymphonyTeleca");
		System.out
				.println("-------------------------------------------------\n");
		bean.employeesInCompany();

		System.out.println("\nDisplay Direct Shiksha Employee");
		System.out.println("---------------------------------------\n");
		CompanyBean beanOne = (CompanyBean) context.getBean("compantyBeanOne");
		beanOne.employeesInCompany();

	}

}
