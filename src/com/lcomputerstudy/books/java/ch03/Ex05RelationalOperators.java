/*
 * Copyright 2022. 이신만 <rngooqw@gmail.com> All rights reserved.
 */
package com.lcomputerstudy.books.java.ch03;

// 관계 연산자
public class Ex05RelationalOperators {

	public static void main(String[] args) {
		int a = 3;
		int b = 7;
		int c = 3;
		int d = 8;
		
		System.out.printf("%d != %d && %d == %d, (%b)%n", a, b, a, c, a != b && a == c);
		System.out.printf("%d >= %d && %d == %d, (%b)%n", a, b, a, c, a >= b && a == c);
		System.out.printf("%d >= %d || %d == %d, (%b)%n", a, b, a, c, a >= b || a == c);
		
		System.out.printf("%d == %d || %d < %d && %d == %d, (%b)%n", a, c, c, d, a, b, a == c || c < d && a == b);
		System.out.printf("(%d == %d || %d < %d) && %d == %d, (%b)%n", a, c, c, d, a, b, (a == c || c < d) && a == b);
	}

}

/*
문제 1.
TV의 가격이 300원 보다 작거나 500원 보다 크고 600원 보다 작은 경우 true를 반환하는 코드를 작성하고 결과를 출력하세요. 
*/
