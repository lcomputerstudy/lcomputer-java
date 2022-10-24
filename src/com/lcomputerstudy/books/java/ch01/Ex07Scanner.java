/*
 * Copyright 2022. 이신만 <rngooqw@gmail.com> All rights reserved.
 */
package com.lcomputerstudy.books.java.ch01;

import java.util.Scanner;

// 입력
public class Ex07Scanner {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int balance;
		int tvPrice;
		int salary;
		
		System.out.printf("잔액을 입력하세요.%n");
		balance = scan.nextInt();
		System.out.printf("티비의 금액을 입력하세요.%n");
		tvPrice = scan.nextInt();
		System.out.printf("월급을 입력하세요.%n");
		salary = scan.nextInt();
		
		System.out.printf("현재 잔액은 %d원 입니다.%n%n", balance);
		
		System.out.printf("TV는 %d원 입니다.%n", tvPrice);
		System.out.printf("TV를 구매하였습니다.%n");
		
		balance = balance - tvPrice;
		System.out.printf("현재 잔액은 %d원입니다.%n", balance);
		
		System.out.printf("%n월급 %d원이 입금되었습니다.", salary);
		
		balance = balance + salary;
		System.out.printf("%n현재 잔액은 %d원입니다.", balance);
	}

}

/* 

문제 1. 슈퍼에는 10개의 사탕이 있습니다. 
철수는 3개의 사탕을 사고 영희는 2개의 사탕을 샀습니다.
둘리는 예전에 사두었던 사탕 2개를 환불했습니다.
슈퍼에 남아 있는 사탕의 재고는 7개입니다.
위 내용을 scanner를 사용하여 작성하세요.
 
*/ 