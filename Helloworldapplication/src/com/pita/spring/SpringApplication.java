package com.pita.spring;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class SpringApplication {

	public static void main(String[] args) {
		FileSystemXmlApplicationContext factory=new FileSystemXmlApplicationContext("C:\\Users\\Admin\\AllSpringApplication\\Helloworldapplication\\src\\beans.xml");
		HelloWorldBean bean=(HelloWorldBean) factory.getBean("hwb");
		bean.display();
		System.out.println("The helloWorldBean="+bean);
		System.out.println("After calling display method");
		
		HelloWorldBean beanTwo=(HelloWorldBean) factory.getBean("hwb");
		System.out.println("2nd Bean="+beanTwo);
		
		
		
		FileSystemXmlApplicationContext clFactory=new FileSystemXmlApplicationContext("C:\\Users\\Admin\\AllSpringApplication\\Helloworldapplication\\src\\beans.xml");
		HelloWorldBean beanOne=(HelloWorldBean) clFactory.getBean("hwb");
		
		System.out.println("The helloWorldBean="+beanOne);
		beanOne.display();

	}

}
