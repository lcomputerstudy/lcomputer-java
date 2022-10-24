/*
 * Copyright 2022. 이신만 <rngooqw@gmail.com> All rights reserved.
 */
package com.lcomputerstudy.books.java.ch14;

public class Ex04StringBuffer {

	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("자바");
		sb.append(" ").append("문법 ").append("엘컴퓨터학원 ");
		sb.append(123);
		String str = sb.toString();
		System.out.println(str);
		
		StringBuilder sb2 = new StringBuilder("자바");
		sb2.append(" ").append("문법 ").append("엘컴퓨터학원 ");
		sb2.append(123);
		String str2 = sb2.toString();
		System.out.println(str2);
		
		
		long startTime = 0;
		long endTime = 0;
		String str3 = "";
		startTime = System.currentTimeMillis();
		for (int i=0; i<10000; i++) {
			str3 += "a";
		}
		endTime = System.currentTimeMillis();
		System.out.println(endTime - startTime);
		
		System.out.println();
		
		startTime = 0;
		endTime = 0;
		StringBuffer sb3 = new StringBuffer();
		startTime = System.currentTimeMillis();
		for (int i=0; i<10000; i++) {
			sb3.append("a");
		}
		endTime = System.currentTimeMillis();
		System.out.println(endTime - startTime);
	}

}

/*
문제 1.
String str = "안 녕 하세 요, 자바 기본 문법 엘 컴퓨터 학원 입니다.";
위 문자열을 char[] 타입으로 변환하세요.
StringBuffer를 이용해 문자열로 만들어 출력하세요. 
*/