package com.lcomputerstudy.books.java.ch6;

// 중첩 for문
public class Ex2NestedFor {

	public static void main(String[] args) {
		for (int i=1; i<=6; i++) {
			for (int j=1; j<=3; j++) {
				System.out.printf("%d학년 %d반,", i, j);
			}
			System.out.println();
		}
	}

}

/*
문제 1.
2단에서 9단까지의 구구단을 아래와 같이 출력하세요.
예) 
2x1=2 ... 2x9=18
3x1=3 ... 3x9=27
...
9x1=9 ... 9x9=81

문제 2.
구구단을 아래와 같이 출력하세요.
2x1=2  3x1=3 ... 9x1=9
2x2=4  3x2=6 ... 9x2=18
..
2x9=18 3x9=27 ... 9x9=81

문제 3.
3명의 회원은 모두 제품 2개씩 구매하였습니다.
3명의 회원이 구매한 제품들의 금액을 배열에 저장한 뒤 모든 금액을 합산하여 출력하세요.
힌트) 2차원 배열과 중첩 for문을 사용하세요. 
*/