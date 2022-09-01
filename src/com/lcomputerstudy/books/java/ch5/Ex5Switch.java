package com.lcomputerstudy.books.java.ch5;

public class Ex5Switch {

	public static void main(String[] args) {
		int level = 5;
		String name = ""; 
		
		switch (level) {
			case 2:
			case 3:
			case 4:
				name = "일반회원";
				break;
			case 5:
			case 6:
				name = "중간관리자";
				break;
			case 9:
				name = "관리자";
				break;
			default:
				name = "방문자";
		}
		
		System.out.printf("회원님의 레벨은 %d이며 %s 입니다.%n", level, name);

	}

}

/*
문제 1.
입력 받은 숫자가 3~5이면 "겨울", 6~8이면 "여름", 9~11이면 "가을" 12,1,2 를 입력하면 "겨울"을 출력하고 
그 외의 숫자를 입력하면 "잘 못 입력하였습니다"를 출력하는 코드를 switch문으로 작성하세요.
*/