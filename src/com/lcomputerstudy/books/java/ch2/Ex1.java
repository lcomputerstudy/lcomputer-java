package com.lcomputerstudy.books.java.ch2;

// 연산자
public class Ex1 {

	public static void main(String[] args) {
		int i1, i2, i3, i4, iResult;
		float f1, f2, fResult;
		String s;
		boolean b;
		
		i1 = 10;
		i2 = 5;
		iResult = i1 + i2;
		System.out.printf("%d + %d = %d%n", i1, i2, iResult);
		
		i1 = 10;
		i2 = 5;
		iResult = i1 - i2;
		System.out.printf("%d - %d = %d%n", i1, i2, iResult);
		
		i1 = 10;
		i2 = 5;
		iResult = i1 * i2;
		System.out.printf("%d * %d = %d%n", i1, i2, iResult);
		
		i1 = 10;
		i2 = 3;
		iResult = i1 / i2;
		System.out.printf("%d / %d = %d%n", i1, i2, iResult);
		
		i1 = 10;
		i2 = 3;
		//float fResult = i1 / (float)i2;
		fResult = i1 / (float)i2;
		System.out.printf("%d / %d = %f%n", i1, i2, fResult);
		
		f1 = 10;
		f2 = 3;
		fResult = f1 / f2;
		System.out.printf("%f / %f = %f%n", f1, f2, fResult);
		
		System.out.printf("%d / %df = %f%n", 10, 3, 10/3f);
		
		System.out.printf("%d %% %d = %d%n%n", 10, 4, 10%4);
		
		i1 = 10;
		i2 = 5;
		i1 += i2;
		System.out.printf("i1 += i2 (i1=%d)%n", i1);
		
		i1 = 10;
		i2 = 5;
		i1 -= i2;
		System.out.printf("i1 -= i2 (i1=%d)%n", i1);
		
		i1 = 10;
		i2 = 5;
		i1 /= i2;
		System.out.printf("i1 /= i2 (i1=%d)%n", i1);
		
		i1 = 10;
		i2 = 5;
		i1 *= i2;
		System.out.printf("i1 *= i2 (i1=%d)%n", i1);
		
		i1 = 10;
		i2 = 4;
		i1 %= i2;
		System.out.printf("i1 %%= i2 (i1=%d)%n%n", i1);
		
		i1 = 5;
		System.out.printf("i1++ (i1=%d)%n", i1++);
		System.out.printf("i1   (i1=%d)%n", i1);
		System.out.printf("++i1 (i1=%d)%n", ++i1);
		System.out.printf("i1-- (i1=%d)%n", i1--);
		System.out.printf("i1   (i1=%d)%n", i1);
		System.out.printf("--i1 (i1=%d)%n%n", --i1);
		
		b = false;
		System.out.printf("b = %b%n", b);
		System.out.printf("!b = %b%n", !b);
		System.out.printf("!!b = %b%n", !!b);
		System.out.printf("!!!b = %b%n%n", !!!b);
		
		i1 = 3;
		i2 = 5;
		System.out.printf("%d == %d (%b)%n", i1, i2, i1 == i2);
		System.out.printf("!(%d == %d) (%b)%n", i1, i2, !(i1 == i2));
		System.out.printf("%d != %d (%b)%n", i1, i2, i1 != i2);
		System.out.printf("%d > %d (%b)%n", i1, i2, i1 > i2);
		System.out.printf("%d < %d (%b)%n", i1, i2, i1 < i2);
		
		i1 = 3;
		i2 = 7;
		i3 = 2;
		i4 = 5;
		System.out.printf("(%d < %d) && (%d < %d) (%b)%n", i1, i2, i3, i4, (i1 < i2) && (i3 < i4));
		
		// 예제를 간단하게 하고 문제를 길게 해야 말하는 시간이 쭐어들고 영상도 짧아짐
		
	}

}
