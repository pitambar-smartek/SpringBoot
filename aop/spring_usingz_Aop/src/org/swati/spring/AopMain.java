package org.swati.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.swati.spring.service.ShapeService;

public class AopMain {

	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("spring.xml");
		ShapeService service=(ShapeService) context.getBean("shapeService");
		System.out.println(service.getCircle().getName());
		System.out.println(service.getTriangle().getName());
	}
	
}
