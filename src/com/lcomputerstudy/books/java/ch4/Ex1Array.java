package com.lcomputerstudy.books.java.ch4;

// 배열
public class Ex1Array {

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
