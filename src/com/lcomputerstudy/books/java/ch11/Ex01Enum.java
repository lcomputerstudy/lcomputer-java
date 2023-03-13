/*
 * Copyright 2022. 이신만 <rngooqw@gmail.com> All rights reserved.
 */
package com.lcomputerstudy.books.java.ch11;

import java.util.Scanner;

public class Ex01Enum {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.println("- static final int 사용 -");
		
		System.out.print("월급날의 요일을 숫자로 입력해 주세요 (일:1 ~ 토:7): ");
		int payDay1 = s.nextInt();
		System.out.print("보너스 받는 달을 숫자로 입력해 주세요: ");
		int bonusMonth1 = s.nextInt();
		
		if (payDay1 > bonusMonth1)
			System.out.println("달과 월은 비교할 수 없으므로 잘못된 코드입니다.");
		
		switch (payDay1) {
		case Day1.SUN:
			System.out.println("일요일은 오후 2시에 입금됩니다.");
			break;
		case Day1.MON:
			System.out.println("월요일은 오후 3시에 입금됩니다.");
			break;
		}
		
		System.out.println();
		System.out.println("- static final 참조변수 사용");
		
		System.out.print("월급날의 요일을 숫자로 입력해 주세요 (일:1 ~ 토:7): ");
		Day2 payDay2 = Day2.valueOf(s.nextInt());
		System.out.print("보너스 받는 달을 숫자로 입력해 주세요: ");
		Month2 bonusMonth2 = Month2.valueOf(s.nextInt());
		
		/*
		if (payDay2 > bonusDay2)
			System.out.println("달과 월은 비교할 수 없으므로 잘못된 코드입니다.");
		*/
		
		/*
		switch (payDay2) {
		case 1:
			System.out.println("1일은 오후 2시에 입금됩니다.");
			break;
		case 2:
			System.out.println("2일은 오후 3시에 입금됩니다.");
			break;
		}
		*/
		
		switch (payDay2.getOrdinal()) {
		case Day1.SUN:
			System.out.println("일요일은 오후 2시에 입금됩니다.");
			break;
		case Day1.MON:
			System.out.println("월요일은 오후 3시에 입금됩니다.");
			break;
		}
		
		System.out.println("\n메소드 사용");
		System.out.println(bonusMonth2.plus(3).getOrdinal() + "월");		// 코드를 간결하게 만들 수 있다.
		
		System.out.println();
		System.out.println("- enum 사용");
		
		System.out.print("월급날의 요일을 숫자로 입력해 주세요 (일:1 ~ 토:7): ");
		Day3 payDay3 = Day3.values()[s.nextInt()];
		System.out.print("보너스 받는 달을 숫자로 입력해 주세요: ");
		Month3 bonusMonth3 = Month3.values()[s.nextInt()];
		
		/*
		if (payDay3 > bonusDay3)
			System.out.println("달과 월은 비교할 수 없으므로 잘못된 코드입니다.");
		*/
		
		switch (payDay3) {
		case SUN:
			System.out.println("일요일은 오후 2시에 입금됩니다.");
			break;
		case MON:
			System.out.println("월요일은 오후 3시에 입금됩니다.");
			break;
		default:
			System.out.println("오후 1시에 입금됩니다.");
			break;
		}
	}

}

class Day1 {
	public static final int SUN = 1;
	public static final int MON = 2;
	public static final int TUE = 3;
	public static final int WED = 4;
	public static final int THU = 5;
	public static final int FRI = 6;
	public static final int SAT = 7;
}

class Month1 {
	public static final int JAN = 1;
	public static final int FEB = 2;
	public static final int MAR = 3;
	public static final int APR = 4;
	public static final int MAY = 5;
	public static final int JUN = 6;
	public static final int JUL = 7;
	public static final int AUG = 8;
	public static final int SEP = 9;
	public static final int OCT = 10;
	public static final int NOV = 11;
	public static final int DEC = 12;
}

class Day2 {
	public static final Day2 SUN = new Day2(1);
	public static final Day2 MON = new Day2(2);
	public static final Day2 TUE = new Day2(3);
	public static final Day2 WED = new Day2(4);
	public static final Day2 THU = new Day2(5);
	public static final Day2 FRI = new Day2(6);
	public static final Day2 SAT = new Day2(7);
	
	private static final Day2[] values = {SUN, MON, TUE, WED, THU, FRI, SAT};
	private final int ordinal;
	
	private Day2(int ordinal) {
		this.ordinal = ordinal;
	}
	
	public static Day2 valueOf(int ordinal) {
		return values[ordinal-1];
	}
	
	public int getOrdinal() {
		return ordinal;
	}
}

class Month2 {
	public static final Month2 JAN = new Month2(1);
	public static final Month2 FEB = new Month2(2);
	public static final Month2 MAR = new Month2(3);
	public static final Month2 APR = new Month2(4);
	public static final Month2 MAY = new Month2(5);
	public static final Month2 JUN = new Month2(6);
	public static final Month2 JUL = new Month2(7);
	public static final Month2 AUG = new Month2(8);
	public static final Month2 SEP = new Month2(9);
	public static final Month2 OCT = new Month2(10);
	public static final Month2 NOV = new Month2(11);
	public static final Month2 DEC = new Month2(12);
	
	private static final Month2[] values = {JAN, FEB, MAR, APR, MAY, JUN, JUL, AUG, SEP, OCT, NOV, DEC};
	private final int ordinal;
	
	private Month2(int ordinal) {
		this.ordinal = ordinal;
	}
	
	public static Month2 valueOf(int ordinal) {
		return values[ordinal-1];
	}
	
	public int getOrdinal() {
		return ordinal;
	}
	
	public Month2 plus(int n) {
		int ordinal = this.ordinal + n;
		int tmp = ordinal % 12;
		ordinal = tmp <= 0 ? ordinal : tmp;
		
		return values[ordinal-1];
	}
}

enum Day3 {
	SUN, MON, TUE, WED, THU, FRI, SAT;
}

enum Month3 {
	JAN, FEB, MAR, APR, MAY, JUN, JUL, AUG, SEP, OCT, NOV, DEC;
}

/*
문제 1.
enum 과 switch 문을 사용한 예제를 작성하세요.
*/