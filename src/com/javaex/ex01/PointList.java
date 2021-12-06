package com.javaex.ex01;

import java.util.Arrays;

public class PointList {

	// 필드
	private Point[] pArray;
	private int crtPoint;

	// 생성자
	public PointList() {
		this.pArray = new Point[3];
		this.crtPoint = 0;
	}

	public PointList(Point[] pArray, int crtPoint) {
		this.pArray = pArray;
		this.crtPoint = crtPoint;
	}
	// 메소드

	// 메소드 일반
	public void add(Point p) {
		pArray[crtPoint] = p;
		crtPoint++;
	}
	
	public Point get(int index) {
		Point result = pArray[index];
		return result;
	}
	public int size() {
		return crtPoint;
	}

	@Override
	public String toString() {
		return "PointList [pArray=" + Arrays.toString(pArray) + ", crtPoint=" + crtPoint + "]";
	}
	

}
