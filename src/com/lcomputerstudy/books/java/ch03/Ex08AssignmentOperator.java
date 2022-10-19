package com.lcomputerstudy.books.java.ch03;

// 할당 연산자
public class Ex08AssignmentOperator {

	public static void main(String[] args) {
		int sum = 20;
		System.out.println("sum = " + sum);
		
		sum += 500;
		System.out.printf("sum += 500 (%d)%n", sum);
		
		sum -= 220;
		System.out.printf("sum -= 220 (%d)%n", sum);
		
		sum *= 2;
		System.out.printf("sum *= 2 (%d)%n", sum);

		sum /= 2;
		System.out.printf("sum /= 2 (%d)%n", sum);
		
		sum %= 290;
		System.out.printf("sum %%= 290 (%d)%n", sum);
	}

}

/*
문제 1.
둘리의 통장에 잔고는 500원입니다.
둘리가 100원 짜리 사탕을 구매한 뒤 잔고를 할당 연산자를 사용하여 작성하고 잔고를 출력하세요. 
*/