package com.pitambar.spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringApplication {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("spring.xml");
		InstituteBean inBean=(InstituteBean) context.getBean("instituteBean");
		System.out.println("institute details are Name:-"+inBean.getInstituteName()+" strength="+inBean.getStrength());
		System.out.println("student details="+inBean.getStudentBean().getFees());

	}

}
