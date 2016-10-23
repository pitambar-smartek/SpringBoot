package org.pitambar.spring;

import org.pitambaar.spring.service.ShapeService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AopMain {

	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("spring.xml");
		
		
		ShapeService service=(ShapeService) context.getBean("shapeService");
		
		System.out.println(service.getCircle().getName());
		System.out.println(service.getTriangle().getName());
		/*service.getCircle().get();
		System.out.println(service.getMyclass().getPitambar());*/
		
	}
	
}
