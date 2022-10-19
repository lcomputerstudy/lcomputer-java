package com.lcomputerstudy.books.java.ch03;

// 부정 연산자
public class Ex06NotOperator {
	public static void main(String[] args) {
		boolean result = true;
		System.out.printf("result = %b%n", result);
		System.out.printf("!result = %b%n", !result);
		System.out.printf("!!result = %b%n", !!result);
		System.out.printf("!!!result = %b%n", !!!result);
	}
}

/*
문제 1.
티비의 전원이 꺼져 있습니다.
부정 연산자를 사용하여 티비의 전원 변수의 값을 반대로 바꿔 저장한 뒤 출력하세요.  
*/