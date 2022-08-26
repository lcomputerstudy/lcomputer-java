package com.lcomputerstudy.books.java.ch6;

// for문
public class Ex1ForLoop {

	public static void main(String[] args) {
		for (int i=1; i<=3; i++) {
			System.out.println("i는 " + i + "입니다.");
		}
		
		System.out.println();
		
		for (int i=1; i<=3; i++)
			System.out.println("i는 " + i + "입니다.");
		System.out.println("반복문 또는 loop문이라고 합니다.");
		System.out.println();
		
		int sum = 0;
		for (int i=1; i<=10; i++) {
			sum += i;
			System.out.printf("i가 %d일 때 sum은 %d입니다.%n", i, sum);
		}
		System.out.println();
		
	}

}
