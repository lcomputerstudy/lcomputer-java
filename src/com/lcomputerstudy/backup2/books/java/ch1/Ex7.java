package com.lcomputerstudy.backup2.books.java.ch1;

// 리터럴과 형변환
public class Ex7 {

	public static void main(String[] args) {
		int i = 3;
		i = 7 + 10;
		System.out.println(i);
		
		int i2 = 1000000 * 1000000;
		System.out.println(i2);
		
		//int d = 1000000 * 1000000L;
		long l = 1_000_000 * 1_000_000L;
		System.out.println(l);
		
		int i3 = (int)(1_000_000 * 1_000_000L);
		System.out.println(i3);
		
		System.out.println(1_000_000L * 1_000_000);
		
		//float f = 3.1415926535;
		float f = 3.1415926535F;
		System.out.println(f);
		
		double d = 3.1415926535;
		System.out.println(d);
		
		//f = f2;
		float f2 = (float)d;
		System.out.println(f2);
		
		//f2 = f;
		double d2 = f;
		System.out.println(d2);
		
		//int i4 = f;
		int i4 = (int)f;
		System.out.println(i4);
		
		int i5 = (int)d;
		System.out.println(i5);
		
		int i6 = 37;
		float f3 = i6;
		double d3 = i6;
		System.out.println(f3);
		System.out.println(d3);
		
		char ch = 'a';
		char ch2 = 97;
		System.out.println(ch);
		System.out.println(ch2);
		System.out.println(ch+1);
		System.out.println((char)(ch+1));
		
		int i7 = ch;
		System.out.println(i7);
		System.out.println((char)i7);
		
		int i8 = 68;
		//char ch3 = i8;
		char ch3 = (char)i8;
		System.out.println(ch3);
		
		char ch4 = '\u0061';
		System.out.println(ch4);
	}

}
