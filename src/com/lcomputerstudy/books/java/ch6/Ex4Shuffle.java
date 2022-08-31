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
