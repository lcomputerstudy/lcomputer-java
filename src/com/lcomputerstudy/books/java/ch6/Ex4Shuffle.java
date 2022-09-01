package com.lcomputerstudy.books.java.ch6;

import java.util.Arrays;

public class Ex4Shuffle {

	public static void main(String[] args) {
		int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		System.out.println(Arrays.toString(arr));
		
		for (int i=0; i<arr.length; i++) {
			int n = (int)(Math.random()*arr.length);
			int tmp = arr[i];
			arr[i] = arr[n];
			arr[n] = tmp;
		}
		System.out.println(Arrays.toString(arr));
	}

}

/*
문제 1.
로또번호를 저장하는 배열에 for문을 사용하여 1~45까지의 숫자를 저장한 뒤
shuffle 알고리즘을 사용해 배열에 저장돼 있는 값들의 위치를 모두 섞고 
6개의 번호만 출력하는 코드를 작성하세요.
*/