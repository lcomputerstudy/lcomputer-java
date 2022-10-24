/*
 * Copyright 2022. 이신만 <rngooqw@gmail.com> All rights reserved.
 */
package com.lcomputerstudy.books.java.ch03;

// 삼항연산자 (조건연산자)
public class Ex07ConditionalOperators {

	public static void main(String[] args) {
		int score = 75;
		
		String result = score >= 60 ? "합격" : "불합격";
		System.out.println(result);
		
		score = 48;
		System.out.printf("%s%n", score >= 60 ? "합격" : "불합격");

	}

}

/*
문제 1.
삼항연산자를 사용하여 사용자로 부터 입력 받은 값이 음수인지 양수인지 0인지를 출력하는 코드를 작성하세요. 
*/ 
