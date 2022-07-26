package com.lcomputerstudy.books.java.ch1;

// 변수
public class Ex3 {

	public static void main(String[] args) {
		int total = 90;
		
		System.out.printf("티비의 현재 재고는 %d대 입니다.%n%n", total);
		
		total = total - 10;
		System.out.printf("홍길동 고객님이 티비 10대를 구매하였습니다.%n현재 티비의 재고는 %d대 입니다.%n%n", total);
		
		total = total - 5;
		System.out.printf("둘리 고객님이 티비 5대를 구매하였습니다.%n현재 티비의 재고는 %d대 입니다.%n%n", total);
		
		total -= 30;
		System.out.printf("머스크 고객님이 티비 30대를 구매하였습니다.%n현재 티비의 재고는 %d대 입니다.%n%n", total);
	}

}
