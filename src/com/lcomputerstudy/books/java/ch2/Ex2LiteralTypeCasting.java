package com.lcomputerstudy.books.java.ch2;

// 리터럴 형변환(캐스팅)
public class Ex2LiteralTypeCasting {

	public static void main(String[] args) {
		System.out.println("5 / 2 = " + 5/2);
		System.out.println("5 / 2f = " + 5/2f);
		System.out.println("5 / 2.0 = " + 5/2.0);
		System.out.println("5 / (double)2 = " + 5/(double)2);
		System.out.println();
		
		System.out.println(1000000*1000000);
		System.out.println(1000000*1000000L);
		// System.out.println(10000000000);	// 에러
		System.out.println(10000000000L);
		System.out.println();
		
		System.out.println("둘리의 나이는 " + 20 + "살 입니다.");
		System.out.println(20);
		System.out.println(""+20);
		System.out.println(20+20+"");
		System.out.println(""+20+20);
	}

}

/*
문제1.
float f = 3.14 + 2.5f;
오류가 나지 않도록 수정해 주세요.
*/