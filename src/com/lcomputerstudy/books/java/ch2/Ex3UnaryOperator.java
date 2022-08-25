package com.lcomputerstudy.books.java.ch2;

// 단항 연산자
public class Ex3UnaryOperator {

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

*/