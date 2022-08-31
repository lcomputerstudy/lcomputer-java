package com.lcomputerstudy.books.java.ch6;

// for문
public class Ex1ForLoop {

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
