/*
 * Copyright 2022. 이신만 <rngooqw@gmail.com> All rights reserved.
 */
package com.lcomputerstudy.books.java.ch15;

public class Ex02Autoboxing {

	public static void main(String[] args) {
		Integer intg = 3;
		System.out.println(intg);
		
		Integer intg2 = Integer.valueOf(3);
		System.out.println(intg2.intValue());
		
		System.out.println();
		
		Integer intg3 = intg + intg2;
		System.out.println(intg3);
		
		Integer intg4 = Integer.valueOf(intg.intValue() + intg2.intValue());
		System.out.println(intg4.intValue());
		
		System.out.println();
		
		int i = intg;
		System.out.println(i);
		
		int i2 = intg.intValue();
		System.out.println(i2);
		
		System.out.println();
		
		System.out.println(intg + 7);
		System.out.println(intg.intValue() + 7);
		
		System.out.println();
		
		double d = (Double)3.14;
		System.out.println(d);
		
		double d2 = Double.valueOf(3.14).doubleValue();
		System.out.println(d2);
		
		System.out.println();
		
		Object obj = (Object)3.14;
		System.out.println(obj);
		
		Object obj2 = (Object)Double.valueOf(3.14);
		System.out.println(obj2);
	}

}

/*
문제 1.
Integer intgA = 3;
Integer intgB = 7;
int sum = intgA + intgB;
위 내용을 오토박싱과 오토언박싱이 필요 없는 코드로 수정하세요.
*/