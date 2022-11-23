/*
 * Copyright 2022. 이신만 <rngooqw@gmail.com> All rights reserved.
 */
package com.lcomputerstudy.books.java.ch19;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentMap;
import java.util.stream.Collectors;

// 병렬 스트림
public class Ex07ParallelStream {

	public static void main(String[] args) {
		List<EBook2> ebooks = new ArrayList<>();
		ebooks.add(new EBook2("자바 기본문법", 50000, EBook2.Category.LANG));
		ebooks.add(new EBook2("자바 알고리즘", 30000, EBook2.Category.APP));
		ebooks.add(new EBook2("파이썬 기본문법", 35000, EBook2.Category.LANG));
		ebooks.add(new EBook2("파이썬 기본문법", 33000, EBook2.Category.LANG));
		ebooks.add(new EBook2("리눅스", 40000, EBook2.Category.APP));
		
		System.out.println("< parallel stream >");
		int sum =
			ebooks
				.parallelStream()
				.filter(b -> b.getPrice() < 50000)
				.mapToInt(EBook2::getPrice)
				.sum();
		System.out.println(sum);
		System.out.println();
		
		System.out.println("< groupingByConcurrent >");
		ConcurrentMap<EBook2.Category, List<EBook2>> ebMap =
			ebooks
				.parallelStream()
				.collect(Collectors.groupingByConcurrent(EBook2::getCategory));
		for (Map.Entry<EBook2.Category, List<EBook2>> entry : ebMap.entrySet()) {
			System.out.println("- " + entry.getKey() + " -");
			for (EBook2 eb : entry.getValue()) {
				System.out.println(eb);
			}
			System.out.println();
		}
		
		System.out.println("< sorted >");
		ebooks
			.stream()
			.sorted()
			.forEach(System.out::println);
		System.out.println();
		
		System.out.println("< parallelStream sorted forEach (정렬 안됨) >");
		ebooks
			.parallelStream()
			.sorted()
			.forEach(System.out::println);
		System.out.println();
		
		System.out.println("< parallelStream sorted forEachOrdered >");
		ebooks
			.parallelStream()
			.sorted()
			.forEachOrdered(System.out::println);
		System.out.println();
	}

}

class EBook2 implements Comparable<EBook2> {
	public enum Category {
		LANG, APP
	}
	private String title;
	private int price;
	private Category category;
	
	public EBook2(String title, int price, Category category) {
		this.title = title;
		this.price = price;
		this.category = category;
	}
	public String getTitle() {
		return title;
	}
	public int getPrice() {
		return price;
	}
	public Category getCategory() {
		return category;
	}
	@Override
	public String toString() {
		return "[title=" + title + ", price=" + price + ", category=" + category + "]";
	}
	@Override
	public int compareTo(EBook2 b) {
		return title.compareTo(b.title);
	}
}

/*
문제 1. 
모든 책들의 정보를 책가격 기준 내림차순 정렬하여 출력하세요.
패러렐 스트림을 이용해야 합니다.
힌트) sorted와 Comparator를 사용하세요.
*/
