package com.lcomputerstudy.books.java.ch3;

// 산술 연산자
public class Ex1ArithmeticOperator {

	public static void main(String[] args) {
		System.out.printf("3 + 7 = %d%n", 3+7);
		System.out.printf("7 - 5 = %d%n", 7-5);
		System.out.printf("7 * 5 = %d%n", 7*5);
		System.out.printf("5 / 2 = %d%n", 5/2);
		System.out.printf("5 %% 2 = %d%n%n", 5%2);
		
		int a = 5;
		int b = 7;
		int sum = a*b;
		System.out.printf("%d * %d = %d%n", a, b, a*b);
		System.out.printf("%d * %d = %d", a, b, sum);
	}

}

/*
문제 1.
TV의 수량과 금액을 입력 받고 총액을 출력하세요.
 */