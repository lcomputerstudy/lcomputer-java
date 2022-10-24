/*
 * Copyright 2022. 이신만 <rngooqw@gmail.com> All rights reserved.
 */
package com.lcomputerstudy.books.java.ch03;

// 단항 연산자
public class Ex03UnaryOperator {

	public static void main(String[] args) {
		int a = 3;
		System.out.printf("a = %d%n", a++);
		System.out.printf("a = %d%n", a);
		System.out.printf("a = %d%n%n", ++a);
		
		a = 3;
		int b = a++;
		System.out.printf("b = %d, a = %d%n%n", b, a);
		
		a = 3;
		b = ++a;
		System.out.printf("b = %d, a = %d%n%n", b, a);
		
		a = 3;
		System.out.printf("a = %d%n%n", --a);

	}

}

/*
문제 1.
int a = 5;
-- 연산자만 사용하여 a의 값을 3으로 만들고 출력하세요. 
*/