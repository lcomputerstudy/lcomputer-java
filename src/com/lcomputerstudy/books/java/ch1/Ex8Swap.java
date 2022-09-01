package com.lcomputerstudy.books.java.ch1;

public class Ex8Swap {

	public static void main(String[] args) {
		int i = 10;
		int j = 70;
		System.out.printf("i의 값은 %d 이고 j의 값은 %d 입니다.%n%n", i, j);
		
		int tmp = i;
		i = j;
		j = tmp;
		System.out.printf("i의 값은 %d 이고 j의 값은 %d 입니다.", i, j);
		

	}

}

/*
문제 1.
int a = 50;
int b = 30;
int c = 70;
swap알고리즘을 사용하여 세 변수의 값을 바꿔 주세요.
*/