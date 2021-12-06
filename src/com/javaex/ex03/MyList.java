
package com.javaex.ex03;

import java.util.Arrays;
//Object를 담는 형식으로 변경
//Object는 모든 클래스의 조상
//MyList.java는 어떠한 클래스가 와도 관리할 수 있다.
//T  --> Point     Circle
public class MyList<T> {
	
	//필드
	private T[] oArray;
	private int crtPos;
	
	//생성자
	public MyList() {
		this.oArray = (T[])new Object[3];
		this.crtPos = 0;
	}
	
	
	//메소드 g/s
	
	//메소드 일반
	public void add(T o) {
		
		oArray[crtPos] = o;
		crtPos++;
	}
	
	public T get(int index) {
		T result = oArray[index];
		return result;
	}
	
	public int size() {
		return crtPos;
	}


	@Override
	public String toString() {
		return "MyList [oArray=" + Arrays.toString(oArray) + ", crtPos=" + crtPos + "]";
	}
	


}
