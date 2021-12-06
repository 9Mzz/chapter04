package com.javaex.ex02;
import java.util.Arrays;

public class CircleList {
	
	//필드
	private Circle[] cArray;
	private int cPoint;
	
	//생성자
	public CircleList() {
		this.cArray = new Circle[3];
		this.cPoint = 0;
	}

	public CircleList(Circle[] circleArray, int cirPoint) {
		this.cArray = circleArray;
		this.cPoint = cirPoint;
	}
	//메소드
	//메소드 일반
	public void add(Circle c) {
		cArray[cPoint] = c;
		cPoint++;
	}
	public Circle get(int index) {
		Circle result = cArray[index];
		return result;
	}
	public int size() {
		return cPoint;
	}

	@Override
	public String toString() {
		return "CircleApp [cArray=" + Arrays.toString(cArray) + ", cPoint=" + cPoint + "]";
	}
	
	
}
