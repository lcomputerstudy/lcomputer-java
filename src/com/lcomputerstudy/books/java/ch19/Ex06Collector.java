/*
 * Copyright 2022. 이신만 <rngooqw@gmail.com> All rights reserved.
 */
package com.lcomputerstudy.books.java.ch19;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

public class Ex06Collector {

	public static void main(String[] args) {
		List<EBook> ebooks = new ArrayList<>();
		ebooks.add(new EBook("자바 기본문법", 50000, EBook.Category.LANG));
		ebooks.add(new EBook("자바 알고리즘", 30000, EBook.Category.APP));
		ebooks.add(new EBook("파이썬 기본문법", 35000, EBook.Category.LANG));
		ebooks.add(new EBook("파이썬 기본문법", 33000, EBook.Category.LANG));
		ebooks.add(new EBook("파이썬 기본문법", 33000, EBook.Category.LANG));
		ebooks.add(new EBook("리눅스", 40000, EBook.Category.APP));
		
		System.out.println("*** Collector ***");
		// Collectors는 Collector를 반환하는 메소드들로 이루어진 클래스
		System.out.println("< toList >");
		List<String> ebTitleList =
			ebooks
				.stream()
				.filter(b -> b.getPrice() < 50000)
				.map(EBook::getTitle)
				.collect(Collectors.toList());		// 캡슐화 (supplier, accumulator, combiner)
		System.out.println(ebTitleList);
		System.out.println();
		
		System.out.println("< toSet >");
		Set<String> ebTitleSet =
			ebooks
				.stream()
				.filter(b -> b.getPrice() < 50000)
				.map(EBook::getTitle)
				.collect(Collectors.toSet());
		System.out.println(ebTitleSet);
		System.out.println();
		
		System.out.println("< groupingBy >");
		Map<EBook.Category, List<EBook>> ebMap =
			ebooks
				.stream()
				.collect(Collectors.groupingBy(EBook::getCategory));
		
		ebMap.forEach((k, v) -> System.out.println(k + "\n" + v));
		System.out.println();
		
		System.out.println("< maxBy >");
		Map<EBook.Category, Optional<EBook>> ebMaxBy =
			ebooks
				.stream()
				.collect(
					Collectors
						.groupingBy(
							EBook::getCategory, 
							Collectors.maxBy(Comparator.comparingInt(EBook::getPrice))));
		
		ebMaxBy.forEach((k, v) -> System.out.println(k + "\n" + v.get()));
		System.out.println();
		
		System.out.println("< collectingAndThen >");
		Map<EBook.Category, EBook> ebMaxBy2 =
			ebooks
				.stream()
				.collect(
					Collectors
						.groupingBy(
							EBook::getCategory,
							Collectors
								.collectingAndThen(
									Collectors.maxBy(Comparator.comparingInt(EBook::getPrice)),
									Optional::get)));
		
		ebMaxBy2.forEach((k, v) -> System.out.println(k + "\n" + v));
		System.out.println();
		
		System.out.println("< mapping >");
		Set<String> ebSet = 
			ebooks
				.stream()
				.collect(Collectors.mapping(EBook::getTitle, Collectors.toSet()));
		System.out.println(ebSet);
		System.out.println();
		
		System.out.println("< Downstream (multi-level reduction) >");
		Map<EBook.Category, List<String>> ebMap2 = 
			ebooks
				.stream()
				.collect(
					Collectors.groupingBy(
						EBook::getCategory,
						Collectors.mapping(
							EBook::getTitle, 
							Collectors.toList())));	
		
		ebMap2.forEach((k, v) -> System.out.println(k + "\n" + v));
		System.out.println();
		
		System.out.println("< reducing >");
		Map<EBook.Category, Integer> ebMap3 =
			ebooks
				.stream()
				.collect(
					Collectors.groupingBy(
						EBook::getCategory,
						Collectors.reducing(		// identity, mapper, operation
							0,
							EBook::getPrice,
							Integer::sum)));
		System.out.println(ebMap3);
		System.out.println();
	}

}
