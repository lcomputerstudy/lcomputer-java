package com.lcomputerstudy.books.java.ch04;

// 2차원 배열 (다차원 배열)
public class Ex02Array {

	public static void main(String[] args) {
		/*
		{
			{70, 80},
			{30, 90},
			{100, 20}
		}
		*/
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
		System.out.println();
		
		int[][] arr4 = {
				{1, 3, 5},
				{7, 9},
				{10, 11, 12, 13}
			};
		
		System.out.println("2차원 배열의 길이: " + arr4.length);
		System.out.println("1차원 배열의 길이: " + arr4[0].length);
		System.out.println("1차원 배열의 길이: " + arr4[1].length);
		System.out.println("1차원 배열의 길이: " + arr4[2].length);
		
	}

}

/*
문제 1.
총 3명의 학생이 있고 각각의 학생들은 국어, 영어, 수학, 과학 점수를 가지고 있습니다.
이를 2차원 배열로 만들고 모든 학생들의 국어 점수를 합하여 출력하세요.

문제 2.
둘리와 또치는 장바구니를 가지고 있습니다.
둘리는 2개의 상품을 담을 수 있는 장바구니이고 또치는 3개의 상품을 담을 수 있는 장바구니입니다.
이를 2차원 배열로 표현하세요.
힌트) 담는 상품은 "티비", "라디오" 처럼 임의의 문자열로 표현하면 됩니다. 배열의 타입에 주의하세요. 
*/