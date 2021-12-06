package com.javaex.ex02;

public class Circle {

	private int radius;
	//
	public Circle() {}
	public Circle(int radius) {
		this.radius = radius;
	}
	//메소드
	public int getRadius() {
		return radius;
	}
	public void setRadius(int radius) {
		this.radius = radius;
	}
	//
	@Override
	public String toString() {
		return "Circle [radius=" + radius + "]";
	}
	
	
	
	
}
