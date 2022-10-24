/*
 * Copyright 2022. 이신만 <rngooqw@gmail.com> All rights reserved.
 */
package com.lcomputerstudy.books.java.ch14;

import java.util.Arrays;
import java.util.Locale;

public class Ex03StringUtils {

	public static void main(String[] args) {
		String s1 = "엘컴퓨터학원";
		String s2 = "엘컴퓨터학원";
		System.out.println(s1.compareTo(s2));	// 0
		s2 = "자바 기본문법";
		System.out.println(s1.compareTo(s2));	// 음수
		s2 = "가나다라";
		System.out.println(s1.compareTo(s2));	// 양수
		System.out.println();
		
		s1 = "엘컴퓨터학원";
		System.out.println(s1.contains("컴퓨터"));
		System.out.println(s1.contains("자바"));
		System.out.println();
		
		s1 = "엘컴";
		s2 = "퓨터학원";
		System.out.println(s1.concat(s2));
		System.out.println();
		
		s1 = "엘컴퓨터학원 자바 기본문법";
		s2 = "자바 기본문법 엘컴퓨터학원";
		System.out.println(s1.startsWith("엘"));
		System.out.println(s2.startsWith("엘"));
		System.out.println(s1.endsWith("원"));
		System.out.println(s2.endsWith("원"));
		System.out.println();
		
		s1 = "Quit";
		System.out.println(s1.equals("quit"));
		System.out.println(s1.equalsIgnoreCase("quit"));
		System.out.println();
		
		s1 = "안녕하세요!! 엘컴퓨터!!학원!!입니다.!!!";
		System.out.println(s1);
		System.out.println(s1.replace("!", ""));
		System.out.println();
		
		s1 = "안녕하세요12 엘컴퓨터34학원56입니다.7890";
		System.out.println(s1);
		System.out.println(s1.replaceAll("[0-9]", ""));		// 정규표현식
		
		s1 = "자바 기본문법";
		int i = 75300000;
		double pi = 3.14159265359;
		System.out.println(String.format("%20s", s1));
		System.out.println(String.format("%,d", i));
		System.out.println(String.format("%#6.3f", pi));
		System.out.println(String.format("%06.3f", pi));
		System.out.println();
		
		s1 = "ABCDEfghiJKlmN";
		System.out.println(s1.toLowerCase());
		System.out.println(s1.toUpperCase());
		System.out.println();
		
		s1 = "  A BC def GH I   ";
		System.out.println("[" + s1.trim() + "]");
		System.out.println();
		
		s1 = "자바 기본문법 엘컴퓨터학원알고리즘";
		System.out.println(s1.substring(8));
		System.out.println(s1.substring(8, 14));
		System.out.println();
		
		s1 = "엘컴퓨터학원";
		char[] chArr = s1.toCharArray();
		for (int j=0; j<chArr.length; j++) {
			System.out.println(chArr[j]);
		}
		System.out.println();
		
		s1 = "자바  기본    문법  엘 컴퓨터 학원 ";
		String[] strArr1 = s1.split(" +");
		System.out.println(Arrays.toString(strArr1));
		strArr1 = s1.split(" +", 3);
		System.out.println(Arrays.toString(strArr1));
		System.out.println();
		
		s1 = "asdfasdf";
		System.out.println(s1.matches("[a-z]"));
		System.out.println(s1.matches("[a-z]+"));
		s1 = "12341234";
		System.out.println(s1.matches("[0-9]+"));
		s1 = "12341zz234";
		System.out.println(s1.matches("[0-9]+"));
		System.out.println();
		
		String[] strArr2 = {"자바", "기본문법", "엘컴퓨터", "학원"};
		System.out.println(String.join(", ", strArr2));
		System.out.println();
		
		s1 = "abcd";
		System.out.println(s1.getBytes().length);
		s1 = "자바문법a1";
		System.out.println(s1.getBytes().length);
		System.out.println();
	}

}

/*
문제 1.
동해물과 백두산이 마르고 닳도록 하느님이 보우하사 우리나라 만세
위 문장에서 substring 을 사용하여 "하느님이" 부터 끝까지 출력하세요.

문제 2.
위 문장을 split을 사용하여 공백을 기준으로 배열로 만든 뒤 
배열의 맨 뒤에서 앞으로 요소들을 출력하세요.

문제 3.
동해물
백두산
두 문자열 중 더 큰 문자열을 출력하세요.
힌트) compareTo를 사용하세요.
*/