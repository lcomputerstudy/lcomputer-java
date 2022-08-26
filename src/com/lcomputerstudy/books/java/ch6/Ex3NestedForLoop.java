package com.lcomputerstudy.books.java.ch6;

// 중첩 for문
public class Ex3NestedForLoop {

	public static void main(String[] args) {
		for (int i=1; i<=6; i++) {
			for (int j=1; j<=3; j++) {
				System.out.printf("%d학년 %d반,", i, j);
			}
			System.out.println();
		}
	}

}
