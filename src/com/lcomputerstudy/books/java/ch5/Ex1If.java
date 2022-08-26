package com.lcomputerstudy.books.java.ch5;

// if문
public class Ex1If {

	public static void main(String[] args) {
		int level = 3;
		String name = "익명";
		
		if (level > 9) {
			name = "관리자";
		}
		
		System.out.printf("회원님의 레벨은 %d이며 %s입니다.%n", level, name);
		
		level = 5;
		if (level >= 5)
			name = "일반회원";
		
		System.out.printf("회원님의 레벨은 %d이며 %s입니다.%n", level, name);
	}

}
