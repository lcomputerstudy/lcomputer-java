package com.lcomputerstudy.books.java.ch16;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Ex02Date {

	public static void main(String[] args) {
		Date today = new Date(); 
		System.out.println(today);
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String strToday = sdf.format(today);
		System.out.println(strToday);
		
		SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy년MM월dd일");
		SimpleDateFormat sdf3 = new SimpleDateFormat("yyyy-MM-dd");
		Scanner scan = new Scanner(System.in);
		Date inputDate = null;
		
		System.out.print("yyyy년MM월dd일 패턴으로 날짜를 입력해 주세요: ");
		String strDate = scan.nextLine();		
		try {
			inputDate = sdf2.parse(strDate);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		System.out.println(sdf3.format(inputDate));
		System.out.println();
		
		Calendar cal1 = Calendar.getInstance();
		cal1.setTime(inputDate);
		cal1.add(Calendar.YEAR, 1);
		Date inputDate2 = cal1.getTime();
		System.out.println(inputDate2);
		System.out.println(sdf3.format(inputDate2));
		System.out.println();
		
		SimpleDateFormat sdf4 = new SimpleDateFormat("'input date - 'yyyy-MM-dd", Locale.ENGLISH);
		System.out.println(sdf4.format(inputDate2));
		
	}

}
/*
문제1.
yyyy년MM월dd 패턴으로 입력 받아 1개월 뒤의 날짜를 yyyy/MM/dd 패턴으로 출력하세요.
*/