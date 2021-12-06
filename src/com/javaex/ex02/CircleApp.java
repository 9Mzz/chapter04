package com.javaex.ex02;

public class CircleApp {

	public static void main(String[] args) {
	
		Circle c01 = new Circle(5);
		Circle c02 = new Circle(7);
		System.out.println(c01.toString());
		System.out.println("==========================");
		CircleList cList = new CircleList();
		cList.add(c01);
		cList.add(c02);
		System.out.println(cList.size());
		System.out.println(cList.get(0).getRadius());
		System.out.println(cList.get(0).toString());
		System.out.println("==========================");
		System.out.println(cList.get(1).getRadius());
		System.out.println(cList.get(1).toString());
		System.out.println(cList.get(1).equals(c02));
		System.out.println("==========================");
		Circle c04 = new Circle(6);
		cList.add(c04);
		System.out.println(cList.size());
		System.out.println(cList.toString());
		
	}
}
