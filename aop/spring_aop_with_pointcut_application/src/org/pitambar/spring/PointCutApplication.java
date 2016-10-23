package org.pitambar.spring;

import org.pitambar.spring.service.ShapeService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PointCutApplication {

	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("spring.xml");
		ShapeService service=(ShapeService) context.getBean("shapeService");
		System.out.println(service.getCircle().getName());
		System.out.println(service.getTriangle().myName());
		service.getTriangle().setName("ramachandra");
	}
	
}
