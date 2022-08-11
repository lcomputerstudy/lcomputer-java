package com.lcomputerstudy.backup2.books.java.ch1;

import java.util.Scanner;

// 입력과 변수
public class Ex4 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int total;
		
		System.out.println("티비의 재고를 입력해 주세요.");
		total = scan.nextInt();
		scan.nextLine();
		System.out.printf("티비의 현재 재고는 %d대 입니다.%n%n", total);
		
		System.out.println("구매 고객의 이름을 입력해 주세요.");
		String name = scan.nextLine();
		System.out.printf("%s 님 안녕하세요!%n", name);
		
		System.out.println("원하시는 티비의 구매 수량을 입력해 주세요.");
		int q = scan.nextInt();
		scan.nextLine();
		System.out.printf("구매하신 티비의 수량은 %d대 입니다.%n%n", q);
		
		total = total - q;
		
		System.out.printf("현재 티비 재고는 %d대 입니다.", total);
		
		scan.close();
	}

}
