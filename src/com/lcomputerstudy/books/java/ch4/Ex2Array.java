package com.lcomputerstudy.books.java.ch4;

// 2차원 배열 (다차원 배열)
public class Ex2Array {

	public static void main(String[] args) {
		int arr[][] = new int[3][2];
		arr[0][0] = 70;
		arr[0][1] = 80;
		arr[1][0] = 30;
		arr[1][1] = 90;
		arr[2][0] = 100;
		arr[2][1] = 20;
		
		System.out.println("학생별 국어, 영어 점수");
		System.out.print("영희: " + arr[0][0] + "," + arr[0][1] + "\n");
		System.out.print("철수: " + arr[1][0] + "," + arr[1][1] + "\n");
		System.out.print("둘리: " + arr[2][0] + "," + arr[2][1] + "\n");
		
		System.out.println();
		
		int[][] arr2 = {
				{80, 95, 90},
				{70, 95, 97}
			};
		System.out.printf("이름 국어 영어 수학%n");
		System.out.printf("영희 %d, %d, %d%n", arr2[0][0], arr2[0][1], arr2[0][2]);
		System.out.printf("철수 %d, %d, %d%n", arr2[1][0], arr2[1][1], arr2[1][2]);
		
		System.out.println();
		
		int[][][] arr3 = {
				{
					{90, 95},
					{80, 97}
				},
				{
					{88, 75},
					{85, 100}
				}
			};
		System.out.println("반별 학생별 국어, 영어 점수");
		System.out.print("1반 영희: " + arr3[0][0][0] + "," + arr3[0][0][1] + "\n");
		System.out.print("1반 철수: " + arr3[0][1][0] + "," + arr3[0][1][1] + "\n");
		System.out.print("2반 둘리: " + arr3[1][0][0] + "," + arr3[0][0][1] + "\n");
		System.out.print("2반 길동: " + arr3[1][1][0] + "," + arr3[1][1][1] + "\n");
	}

}
