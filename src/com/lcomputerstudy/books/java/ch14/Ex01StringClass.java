/*
 * Copyright 2022. 이신만 <rngooqw@gmail.com> All rights reserved.
 */
package com.lcomputerstudy.books.java.ch14;

public class Ex01StringClass { 

	public static void main(String[] args) {
		String s1 = "엘컴퓨터학원";		// String 리터럴
		String s2 = "엘컴퓨터학원";
		
		System.out.println(System.identityHashCode(s1));
		System.out.println(System.identityHashCode(s2));
		System.out.println();
		
		String s3 = new String("엘컴퓨터학원");
		String s4 = new String("엘컴퓨터학원");
		System.out.println(s3.hashCode());
		System.out.println(s4.hashCode());
		System.out.println(System.identityHashCode(s3));
		System.out.println(System.identityHashCode(s4));
		System.out.println();
		
		System.out.println(System.identityHashCode(s1));
		System.out.println(System.identityHashCode(s3));
		System.out.println(System.identityHashCode(s3.intern()));
		System.out.println();
		
		System.out.println(s1 == s2);
		System.out.println(s3 == s4);
		System.out.println(s3.equals(s4));
		System.out.println(s1.equals(s2));
		System.out.println();
		
		String s5 = null;
		//System.out.println(s5.length());
		String s6 = "";
		System.out.println(s6.length());
	}

}

/*
문제 1.
== 과 equals 의 차이를 설명할 수 있는 예제를 작성하세요.
*/

