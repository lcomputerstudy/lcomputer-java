package com.lcomputerstudy.backup.books.java.ch1;

import java.util.Scanner;

public class ZZEx11 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int age;
		
		System.out.println("당신의 나이를 입력해 주세요: ");
		age = scan.nextInt();
		
		System.out.println("당신의 나이는 " + age + "살 입니다.");
	}

}

/*

변수란 값을 저장하기 위한 공간이다.

사용자로 부터 입력 받은 나이를 출력하는 프로그램을 만들어 보자.

입력 받은 숫자를 변수에 저장해야 재사용 할 수 있다.

 */