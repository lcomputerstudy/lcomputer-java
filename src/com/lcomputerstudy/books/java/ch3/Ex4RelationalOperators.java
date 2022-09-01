package com.lcomputerstudy.books.java.ch3;

// 관계 연산자 (비교 연산자)
public class Ex4RelationalOperators {

	public static void main(String[] args) {
		int a = 3, b = 7;
		boolean result = a == 7;
		System.out.printf("%d == %d (%b)%n", a, b, result);
		System.out.printf("%d != %d (%b)%n", a, b, a != b);
		System.out.printf("%d > %d (%b)%n", a, b, a > b);
		System.out.printf("%d < %d (%b)%n%n", a, b, a < b);
		
		int c = 7;
		System.out.printf("%d >= %d (%b)%n%n", b, c, b >= c);
		System.out.printf("%d <= %d (%b)%n%n", a, c, a <= c);
		System.out.printf("%d != %d (%b)%n%n", b, c, b != c);
		System.out.printf("%d != %d (%b)%n%n", b, c, a != c);
		
	}

}

/*
문제 1.
TV의 금액은 300원입니다.
잔액이 1000원일 때 TV의 구매 가능 여부를 조건식을 이용하여 출력하세요.
*/