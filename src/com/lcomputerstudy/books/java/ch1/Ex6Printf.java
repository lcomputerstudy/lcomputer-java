package com.lcomputerstudy.books.java.ch1;

// 출력
public class Ex6Printf {

	public static void main(String[] args) {
		int balance = 1000;
		System.out.printf("현재 잔액은 %d원 입니다.%n%n", balance);
		
		int tvPrice = 300;
		System.out.printf("TV는 %d원 입니다.%n", tvPrice);
		System.out.printf("TV를 구매하였습니다.%n");
		
		balance = balance - tvPrice;
		System.out.printf("현재 잔액은 %d원입니다.%n", balance);
		
		int salary = 500;
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
위 내용을 코드로 작성하세요.

*/ 