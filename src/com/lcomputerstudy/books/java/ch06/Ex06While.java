package com.lcomputerstudy.books.java.ch06;

import java.util.Scanner;

public class Ex06While {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("생산할 TV의 수량을 입력하세요:");
		int tvCount = scanner.nextInt();
		
		int i = 0;
		while (i < tvCount) {
			System.out.println("TV 1대를 생산하였습니다.");
			i++;
		}
	}

}

/*
문제 1.
while문도 for문처럼 중첩시킬 수 있습니다. 
중첩 while문을 이용해 구구단을 출력하세요.
*/