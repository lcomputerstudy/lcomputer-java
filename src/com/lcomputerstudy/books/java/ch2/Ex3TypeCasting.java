package com.lcomputerstudy.books.java.ch2;

// 기본형 변수 형변환(캐스팅)
public class Ex3TypeCasting {

	public static void main(String[] args) {
		double d = 3.14;
		System.out.println("double d = " + d);
		
		// float f = 3.14;	// 에러
		float f = 3.14f;
		System.out.println("float f = " + f);
		
		double d2 = 7.12f;
		System.out.println("double d2 = " + d2);
		
		int i = 5;
		int i2 = 2;
		System.out.println(i + "/" + i2 + "=" + i/i2);
		System.out.println(i + "/" + i2 + "=" + i/(float)i2);
		System.out.println(i + "/" + i2 + "=" + i/(double)i2);
		
		int i3 = 7;
		long l = i3;
		System.out.println("long은 int를 저장할 수 있습니다: l=" + l);
		// i3 = l;	// 에러
		System.out.println("int는 long을 저장할 수 없습니다.");
		
		// int i4 = 100000000000L;
		// long l2 = 100000000000;	// 에러
		long l2 = 100000000000L;
		System.out.println("long l2 = " + l2);
		
		float f2 = l2;
		System.out.printf("float f2 = %f%n", f2);
		double d3 = l2;
		System.out.printf("double d3 = %f%n", d3);
		
		String name = "둘리";
		int age = 20;
		char bloodType = 'A';
		float height = 203.7f;
		System.out.println(name + "의 나이는 " + age + "살 이고 혈액형은 " + bloodType + "형이며 키는 " + height + "cm입니다.");
		
	}

}
