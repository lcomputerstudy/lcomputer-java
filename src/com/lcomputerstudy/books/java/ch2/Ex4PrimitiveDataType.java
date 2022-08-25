package com.lcomputerstudy.books.java.ch2;

// 기본 데이터 타입 (기본형)
public class Ex4PrimitiveDataType {

	public static void main(String[] args) {
		System.out.println("정수형\n---");
		
		byte b = -128;
		//b = -129;
		System.out.printf("byte type 최솟값 = \t%d%n", b);
		b = 127;
		System.out.printf("byte type 최댓값 = \t%d%n", b);
		
		short s = -32768;
		System.out.printf("short type 최솟값 = \t%d%n", s);
		s = 32767;
		System.out.printf("short type 최댓값 = \t%d%n", s);
		
		int i = -2147483648;
		System.out.printf("int type 최솟값 = \t%d%n", i);
		i = 2_147_483_647;
		System.out.printf("int type 최댓값 = \t%d%n", i);
		
		long l = -9223372036854775808L;
		System.out.printf("long type 최솟값 = \t%d%n", l);
		l = 9_223_372_036_854_775_807L;
		System.out.printf("long type 최댓값 = \t%d%n", l);
		
		System.out.println("\n실수형\n---");
		
		float f = -31.999998f;
		System.out.printf("float type 최솟값 = \t%f%n", f);
		f = 31.999998f;
		System.out.printf("float type 최댓값 = \t%f%n", f);
		
		double d = -127.99999999999999;
		System.out.printf("double type 최솟값 = \t%19.14f%n", d);
		d = 127.99999999999999;
		System.out.printf("double type 최댓값 = \t%19.14f%n", d);
		
		System.out.println("\n문자형\n---");
		
		char c = 0;
		System.out.printf("char type 최솟값 = %c%n", c);
		c = 65535;
		System.out.printf("char type 최댓값 = %c%n", c);
		c = 65;
		System.out.printf("char type 65 = %c%n", c);
		c = 97;
		System.out.printf("char type 97 = %c%n", c);
		c = 49;
		System.out.printf("char type 49 = %c%n", c);
		c = 'b';
		System.out.printf("char type 'b' = %c%n", c);
		//c = '';
		
		
		System.out.println("\n논리형\n---");
		boolean bool = true;
		System.out.printf("boolean type 참 = \t%b%n", bool);
		bool = false;
		System.out.printf("boolean type 거짓 = \t%b%n", bool);
		System.out.printf("3은 5보다 큰가? = \t%b%n", 3 > 5);
		System.out.printf("5는 7보다 작은가? = \t%b%n", 5 < 7);
		System.out.printf("8은 8보다 크거나 같은가? = \t%b%n", 8 >= 8);
		System.out.printf("5는 10보다 작거나 같은가? = \t%b%n", 5 <= 10);
		System.out.printf("7은 8과 같은가? = \t%b%n", 7 == 8);
		System.out.printf("7은 8과 다른가? = \t%b%n", 7 != 8);
		
		System.out.println("\n이상 기본형 데이터였습니다.");
		
		System.out.println("\n문자열형\n---");
		String str = "엘컴퓨터학원";
		System.out.println(str);
		str = "";
		System.out.println(str);
		str = "1~0, a~z, A-Z, !@#$%^";
		System.out.println(str);
		
	}

}

/* 

문제 1. 500원짜리 TV

*/ 