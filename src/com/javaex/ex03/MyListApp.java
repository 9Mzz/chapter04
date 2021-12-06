package com.javaex.ex03;

import com.javaex.ex01.PointList;
import com.javaex.ex02.CircleList;

public class MyListApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle c01 = new Circle(5);
		Circle c02 = new Circle(19);
		
		CircleList cList = new CircleList();
		cList.add(c01);
		
		Point p01 = new Point(4,7);
		
		PointList pList = new PointList();
		pList.add(p01);
		
		
		MyList myList = new MyList();
		

	}

}
