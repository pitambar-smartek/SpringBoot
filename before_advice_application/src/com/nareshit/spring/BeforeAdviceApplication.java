package com.nareshit.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeforeAdviceApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stubn
		ApplicationContext context=new ClassPathXmlApplicationContext("beans.xml");
		CoreConrnBean bean=(CoreConrnBean)context.getBean("pfb");
		bean.businessMethodOne();
		bean.businessMethodTwo("Pitambar Mohanty");

	}

}
