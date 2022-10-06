package com.lcomputerstudy.books.java.ch15;

import java.util.Scanner;

public class Ex01WrapperClass {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.print("숫자 7을 입력하세요:");
		//int i = s.nextLine();
		String str = s.nextLine();
		String str2 = str + 10;
		System.out.println(str2);
		
		int i = Integer.parseInt(str);
		int i2 = i+10;
		System.out.println(i2);
		System.out.println();
		
		Integer intg1 = Integer.valueOf(i);
		System.out.println(intg1.intValue());
		System.out.println( intg1.compareTo(Integer.valueOf(5)) );
		System.out.println( intg1.compareTo(Integer.valueOf(20)) );
		System.out.println( intg1.compareTo(Integer.valueOf(7)) );
		System.out.println();
		
		Integer intg2 = Integer.valueOf(22);
		System.out.println(intg1.intValue());
		System.out.println(intg1.hashCode());
		System.out.println(System.identityHashCode(intg1));
		System.out.println(intg2.intValue());
		System.out.println(intg2.hashCode());
		System.out.println(System.identityHashCode(intg2));
		System.out.println();
		
		System.out.println(intg1.equals(intg2));
		System.out.println(intg1.equals(Integer.valueOf(7)));
		System.out.println();
		
		System.out.println(Integer.max(intg1, intg2));
		System.out.println(Integer.min(intg1, intg2));
		System.out.println(Integer.sum(intg1, intg2));
		System.out.println();
		
		//int i3 = intg1.toString();
		System.out.println(intg2.intValue() + 777);
		System.out.println(intg2.toString() + 777);
		System.out.println();
		
		String str3 = "3.14";
		System.out.println(str3 + 0.01);
		System.out.println(Double.parseDouble(str3) + 0.01);
		Double objPi = Double.valueOf(3.14);
		double pi = objPi.doubleValue();
		System.out.println(pi);
		System.out.println();
	}

}
