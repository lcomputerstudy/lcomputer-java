/*
 * Copyright 2022. 이신만 <rngooqw@gmail.com> All rights reserved.
 */
package com.lcomputerstudy.books.java.ch01;

// 변수
public class Ex03Variable {

	public static void main(String[] args) {
		System.out.println("현재 잔액은 " + 1000 + "원 입니다.");
		System.out.println();
		
		System.out.println("TV는 " + 300 + "원 입니다.");
		System.out.println("TV를 구매하였습니다.");
		
		System.out.println("현재 잔액은 " + (1000 - 300) + "원입니다.");
		
		System.out.println();
		
		System.out.println("월급 " + 500 + "원이 입금되었습니다.");
		System.out.println("현재 잔액은 " + (1000 - 300 + 500) + "원입니다.");
	}

}

/* 
 
문제 1. 2000원의 잔액에서 300원 짜리 TV 2대를 구매하고 300원의 월급이 입금되는 코드를 작성하세요.
 
*/ 