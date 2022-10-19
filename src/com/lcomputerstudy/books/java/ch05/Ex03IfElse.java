package com.lcomputerstudy.books.java.ch05;

// if else문
public class Ex03IfElse {

	public static void main(String[] args) {
		int level = -1;
		String name = "익명"; 
		
		if (level >= 9) {
			name = "관리자";
		} else if (level >= 8) {
			name = "중간관리자";
		} else if (level >= 7) {
			name = "우수회원";
		} else if (level >= 6) {
			name = "일반회원";
		} else if (level == -1) {
			name = "탈퇴한회원";
		} else {
			name = "방문자";
		}
		
		System.out.printf("회원님의 레벨은 %d이며 %s 입니다.%n", level, name);
	}

}
/*
문제 1.
입력 받은 숫자가 3~5이면 "봄", 6~8이면 "여름", 9~11이면 "가을" 12,1,2 를 입력하면 "겨울"을 출력하고 
그 외의 숫자를 입력하면 "잘 못 입력하였습니다"를 출력하는 코드를 작성하세요.  
*/