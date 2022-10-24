/*
 * Copyright 2022. 이신만 <rngooqw@gmail.com> All rights reserved.
 */
package com.lcomputerstudy.books.java.ch04;

// 배열
public class Ex01Array {

	public static void main(String[] args) { 
		int[] a;
		a = new int[3];
		a[0] = 10;
		a[1] = 11;
		a[2] = 12;
		//a[3] = 10;
		System.out.println(a[0]);
		System.out.println(a[1]);
		System.out.println(a[2]);
		//System.out.println(a[3]);
		System.out.println("배열의 길이: " + a.length);
		
		System.out.println();
		
		int[] arr = new int[3];
		arr[0] = 20;
		arr[1] = 21;
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		
		System.out.println();
		
		int[] arr2 = new int[] {30, 31, 32};
		System.out.println(arr2[0]);
		System.out.println(arr2[1]);
		System.out.println(arr2[2]);
		
		System.out.println();
		
		int[] arr3 = {40, 41, 42, 43};
		System.out.println(arr3[0]);
		System.out.println(arr3[1]);
		System.out.println(arr3[2]);
		System.out.println(arr3[3]);
		
		
	}

}

/*
문제 1.
정수형 변수 3개를 저장 할 수 있는 배열에 
인덱스 0번에 50, 인덱스 1번에 30, 인덱스 2번에 0을 저장하는 코드를 작성하세요.

문제 2.
문제 1에서 만든 배열의 인덱스 2번의 값을 출력하세요.

문제 3.
문제 1에서 만든 배열의 0번 인덱스와 1번 인덱스에 저장된 값 중 더 큰 값을 출력하세요.  
힌트) 삼항연산자를 사용하세요.
*/
