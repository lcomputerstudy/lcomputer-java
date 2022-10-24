/*
 * Copyright 2022. 이신만 <rngooqw@gmail.com> All rights reserved.
 */
package com.lcomputerstudy.books.java.ch08;

import java.util.Calendar;
//import java.util.*;

import static java.lang.Math.PI;
import static java.lang.Math.random;
import static java.lang.Math.round;
//import static java.lang.Math.*;

//import java.lang.*;

public class Ex08Import {

	public static void main(String[] args) {
		java.util.Date d = new java.util.Date();
		System.out.println(d.toString());
		
		Calendar c = Calendar.getInstance();
		System.out.println(c.get(Calendar.DATE));
		
		System.out.println(PI);
		System.out.println(random());
		System.out.println(round(3.14));
	}

}

/*
문제 1.
Math.floor() 메소드를 사용하여 PI의 정수값만 출력하세요.
Math.floor() 메소드에 import static 을 적용하세요. 
*/
