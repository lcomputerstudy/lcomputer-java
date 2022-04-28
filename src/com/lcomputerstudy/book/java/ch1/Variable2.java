package com.lcomputerstudy.book.java.ch1;

public class Variable2 {

	public static void main(String[] args) {
		byte b = 1;			// 정수형 (메모리 크기: 1바이트, 표현 범위: -128 ~ 127)
		short s = 2;		// 정수형 (메모리 크기: 2바이트, 표현 범위: -32,768 ~ 32,767)
		int i = 3;			// 정수형 (메모리 크기: 4바이트, 표현 범위: -2,147,483,648 ~ 2,147,483,647)
		long l = 4;			// 정수형 (메모리 크기: 8바이트, 표현 범위: -9,223,372,036,854,775,808 ~ 9,223,372,036,854,775,807)
		
		System.out.println(s);
		s = 32767;
		System.out.println(s);
		// s = 32768;		// 표현 범위를 벗어났기 때문에 컴파일 에러가 발생한다.
		s = -32768;
		System.out.println(s);
		// s = -32769;		// 표현 범위를 벗어났기 때문에 컴파일 에러가 발생한다.
		
		float f = 5.0f;		
		double d = 6;
	}

}
