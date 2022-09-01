package com.lcomputerstudy.books.java.ch5;

// if else문
public class Ex2IfElse {

	public static void main(String[] args) {
		int level = 3;
		String name = "익명";
		
		if (level >= 9) {
			name = "관리자";
		} else {
			name = "방문자";
		}
		
		System.out.printf("회원님의 레벨은 %d이며 %s입니다.%n", level, name);
		
		if (level >= 9)
			name = "관리자";
		else
			name = "방문자";
		
		System.out.printf("회원님의 레벨은 %d이며 %s입니다.%n", level, name);
	}

}

/*
문제 1.
사용자에게 입력 받은 레벨이 3 보다 크다면 "정회원님 안녕하세요."를 출력하고
3보다 작다면 "회원님 안녕하세요."를 출력하는 코드를 작성하세요.
*/
