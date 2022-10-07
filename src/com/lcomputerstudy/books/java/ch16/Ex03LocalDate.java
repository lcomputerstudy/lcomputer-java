package com.lcomputerstudy.books.java.ch16;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalAdjusters;

import static java.time.temporal.ChronoUnit.YEARS;

import java.time.DayOfWeek;

import static java.time.temporal.ChronoUnit.MONTHS;
import static java.time.temporal.ChronoUnit.DAYS;
import static java.time.temporal.ChronoUnit.HOURS;
import static java.time.temporal.ChronoUnit.MINUTES;

public class Ex03LocalDate {

	public static void main(String[] args) {
		LocalDate date1 = LocalDate.of(2020, 5, 6);
		LocalDate date2 = LocalDate.now();
		System.out.println(date1.toString());
		System.out.println(date2);
		
		Period p = Period.between(date1, date2);
		System.out.println(p.getYears() + "년 " + p.getMonths() + "개월 " + p.getDays() + "일");
		System.out.println();
		
		Period p2 = date1.until(date2);
		System.out.println(p2.getYears() + "년 " + p2.getMonths() + "개월 " + p2.getDays() + "일");
		System.out.println();
		
		DateTimeFormatter df = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
		LocalDateTime datetime1 = LocalDateTime.of(2021, 8, 7, 19, 55, 22);
		LocalDateTime datetime2 = LocalDateTime.now();
		System.out.println(datetime1.format(df));
		System.out.println(datetime2.format(df));
		System.out.println(datetime1);
		System.out.println(datetime2);
		System.out.println();
		
		System.out.println(ChronoUnit.YEARS.between(datetime1, datetime2));
		System.out.println(MONTHS.between(datetime1, datetime2));
		System.out.println(DAYS.between(datetime1, datetime2));
		System.out.println(HOURS.between(datetime1, datetime2));
		System.out.println(MINUTES.between(datetime1, datetime2));
		System.out.println();
		
		System.out.println(datetime1.until(datetime2, YEARS));
		System.out.println(datetime1.until(datetime2, MONTHS));
		System.out.println(datetime1.until(datetime2, DAYS));
		System.out.println(datetime1.until(datetime2, HOURS));
		System.out.println(datetime1.until(datetime2, MINUTES));
		System.out.println();
		
		System.out.println(datetime1.plusYears(1));
		System.out.println(datetime1.minusDays(2));
		System.out.println(datetime1.withYear(2019));
		System.out.println(datetime1.with(TemporalAdjusters.firstDayOfMonth()));
		System.out.println(datetime1.with(TemporalAdjusters.lastDayOfMonth()));
		datetime1 = datetime1.with(TemporalAdjusters.lastInMonth(DayOfWeek.SUNDAY));
		System.out.println(datetime1);
		System.out.println(datetime1.with(TemporalAdjusters.next(DayOfWeek.FRIDAY)));
	}

}
