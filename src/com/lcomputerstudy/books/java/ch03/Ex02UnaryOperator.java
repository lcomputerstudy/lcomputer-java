/*
 * Copyright 2022. 이신만 <rngooqw@gmail.com> All rights reserved.
 */
package com.lcomputerstudy.books.java.ch03;

// 단항 연산자
public class Ex02UnaryOperator {

	public static void main(String[] args) {
		int a = 5;
		int b = 3;
		System.out.printf("%d + %d = %d%n", a, b, a+b);
		
		b = -b;
		System.out.printf("%d + %d = %d%n", a, b, a+b);
		
		b = -b;
		System.out.printf("%d + %d = %d%n", a, b, a+b);
	}

}

/*
문제 1.
735 + 525 를 두 개의 변수에 저장 후 연산하여 출력하세요.

문제 2.
int a = 30;
변수 a의 값을 음수로 출력하세요. 
*/