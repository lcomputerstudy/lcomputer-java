package com.lcomputerstudy.books.java.ch3;

// 삼항연산자
public class Ex7TernaryOperator {

	public static void main(String[] args) {
		int score = 75;
		
		String result = score >= 60 ? "합격" : "불합격";
		System.out.println(result);
		
		score = 48;
		System.out.printf("%s%n", score >= 60 ? "합격" : "불합격");

	}

}
