package com.javaex.ex04;

import java.util.HashSet;
import java.util.Set;

public class Ex03 {

	public static void main(String[] args) {
		// HashSet을 이용해서 로또 자동생성기

		Set<Integer> iSet = new HashSet<Integer>();

		while (true) {
			// 6개면 탈출
			if (iSet.size() >= 6) {
				break;
			}
			int num = (int) (Math.random() * 45) + 1;
			System.out.println("생성된 숫자." + num);
			iSet.add(num); // 중복체크는 Set을 통해 해결
		}
		for (int no : iSet) { // 언박싱
			System.out.println(no);
		}

//		int iArray[] = new int[8];
//		Integer i01 = ((int)(Math.random()*45))+1;
//		Integer i02 = ((int)(Math.random()*45))+1;
//		Integer i03 = ((int)(Math.random()*45))+1;
//		Integer i04 = ((int)(Math.random()*45))+1;
//		Integer i05 = ((int)(Math.random()*45))+1;
//		Integer i06 = ((int)(Math.random()*45))+1;
//		Integer i07 = ((int)(Math.random()*45))+1;
//		Integer i08 = ((int)(Math.random()*45))+1;
//
//		Set<Integer> iSet = new HashSet<Integer>();
//		iSet.add(i01);
//		iSet.add(i02);
//		iSet.add(i03);
//		iSet.add(i04);
//		iSet.add(i05);
//		iSet.add(i06);
//		iSet.add(i07);
//		iSet.add(i08);
//		
//		for (int i=0; i<8; i++) {
//			System.out.println(i);
//		}
//		

//		Integer iO[] = new Integer[8];
//		for (int i=0; i<8; i++) {
//			iO[i]=((int)(Math.random()*45))+1;
//		}
//		for(int i=0; i<8; i++) {
//			System.out.println(iO[i]);
//		}

//		for(int i=0; i<iO.length; i++) {
//			iSet.add(i);
//		}
//		System.out.println(iSet.toString());
//		
	}

}
