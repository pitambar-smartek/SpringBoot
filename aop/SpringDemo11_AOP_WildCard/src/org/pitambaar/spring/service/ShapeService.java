package org.pitambaar.spring.service;

import org.aspectj.weaver.NewMethodTypeMunger;
import org.pitambaar.MyClass;
import org.pitambar.spring.model.Circle;
import org.pitambar.spring.model.Triangle;

public class ShapeService {

	private Circle circle;
	private Triangle triangle;
	private MyClass myClass;
	public MyClass getMyclass(){
		return new MyClass();
	}
	
	public Circle getCircle() {
		return circle;
	}
	public void setCircle(Circle circle) {
		this.circle = circle;
	}
	public Triangle getTriangle() {
		return triangle;
	}
	public void setTriangle(Triangle triangle) {
		this.triangle = triangle;
	}
	
}
