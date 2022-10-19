package com.lcomputerstudy.books.java.ch06;

public class Ex03Max {

	public static void main(String[] args) {
		int[] arr = {3, 7, 2, 15, 9};
		
		int max = arr[0];
		for (int i=1; i<arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];
			}
		}
		
		System.out.println("최대값은 " + max + " 입니다.");
	}

}

/*
문제 1.
학생 5명의 점수를 저장하는 배열을 작성 한 뒤 
최저점수와 최고점수를 찾아 출력하세요. 
*/