package com.lcomputerstudy.backup2.books.java.ch1;

// 출력
public class Ex1 {

	public static void main(String[] args) {
		System.out.println("안녕하세요,");
		System.out.print("엘컴퓨터학원에 오신 것을 ");
		System.out.println("환영합니다.");
		System.out.printf("자 이제 자바를%n배워 봅시다.");
		
		System.out.println("5 + 3 은 얼마 인가요?");
		System.out.println("정답은 " + (5+3) + "입니다.");
		System.out.println("정답은 " + 5+3 + "입니다.");
		
		System.out.printf("7 + 8 은 얼마 인가요?%n");
		System.out.printf("정답은 %d 입니다.", 7+8);
		
		//System.out.printf("PI 는 %d 입니다.", 3.14);
		System.out.printf("PI 는 %f 입니다.%n", 3.14);
		System.out.printf("PI 는%6.2f 입니다.", 123.14);
		
	}

}
// 1. 자기소개를 %n, %d, %f, 사칙연산을 사용하여 출력하세요.

// 2. 3.1415926535 를 소수점 셋째자리에서 반올림하여 출력하세요.