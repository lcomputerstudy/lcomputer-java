/*
 * Copyright 2022. 이신만 <rngooqw@gmail.com> All rights reserved.
 */
package com.lcomputerstudy.books.java.ch06;

// for문
public class Ex01For {

	public static void main(String[] args) { 
		for (int i=1; i<=3; i++) {
			System.out.println("i는 " + i + "입니다.");
		}
		
		System.out.println();
		
		for (int i=1; i<=3; i++)
			System.out.println("i는 " + i + "입니다.");
		System.out.println("반복문 또는 loop문이라고 합니다.");
		System.out.println();
		
		int sum = 0;
		for (int i=1; i<=10; i++) {
			sum += i;
			System.out.printf("i가 %d일 때 sum은 %d입니다.%n", i, sum);
		}
		System.out.println();
		
		int evenSum = 0;
		int oddSum = 0;
		for (int i=1; i<=10; i++) {
			if (i%2 == 0)
				evenSum += i;
			else
				oddSum += i;
		}
		System.out.println("1에서 10 중 짝수의 합은 = " + evenSum);
		System.out.println("1에서 10 중 홀수의 합은 = " + oddSum);
		
	}

}

/*
문제 1.
구구단 중 2단만 출력하세요.
예) 
2x1=2 2x2=4 ... 2x9=18

문제 2.
학생 3명의 중간고사 점수가 저장된 배열을 만들고 임의의 점수를 저장한 뒤
for 문을 사용하여 출력하세요.

문제 3.
중간고사 점수가 저장된 배열의 점수를 출력하되 점수가 60점 이상일 경우에만 출력하고 60점 미만일 경우 "재시험"을 출력하는 코드를 작성하세요. 
*/
