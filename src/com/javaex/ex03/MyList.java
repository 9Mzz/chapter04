package com.javaex.ex03;

public class MyList {
	//Object를 담는 형식으로 변경
	//Object는 모든 클래스의 조상
	//MyList.java는 어떠한 클래스가 와도 관리할 수 있다.
	
	//필드
	private Object[] oArray;
	private int cPoint;
	
	//생성자
	public MyList() {
		this.oArray = new Object[3];
		this.cPoint=0;
	}
	//메소드
	
	//메소드일반
	public void add(Object o) {
		oArray[cPoint]=o;
		cPoint++;
	}
	public Object get(int index) {
		Object result = oArray[index];
		return result;
	}
	public int size() {
		return cPoint;
	}
	
	

}
