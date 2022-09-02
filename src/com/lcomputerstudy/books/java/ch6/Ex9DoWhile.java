package com.lcomputerstudy.books.java.ch6;

import java.util.Scanner;

public class Ex9DoWhile {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		char ch = ' ';
		do {
			System.out.println("문자를 입력해 주세요: ");
			String str = scanner.nextLine();
			ch = str.charAt(0);
			if (ch >= '0' && ch <= '9')
				System.out.println("숫자입니다.");
			else if (ch >= 'A' && ch <= 'Z')
				System.out.println("알파뱃 대문자입니다.");
			else if (ch >= 'a' && ch <= 'z')
				System.out.println("알파뱃 소문자입니다.");
		} while (ch != 'q');
		System.out.println("프로그램이 종료되었습니다.");
	}

}

/*
문제 1.
do while문을 사용하여 대문자 Z가 입력될 때까지 입력된 문자를 출력하는 코드를 작성하세요.
Z가 입력되면 프로그램을 종료한다는 문구를 출력 후 프로그램을 종료하세요.
*/