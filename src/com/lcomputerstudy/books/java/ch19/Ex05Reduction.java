/*
 * Copyright 2022. 이신만 <rngooqw@gmail.com> All rights reserved.
 */
package com.lcomputerstudy.books.java.ch19;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Ex05Reduction {

	public static void main(String[] args) {
		List<EBook> ebooks = new ArrayList<>();
		ebooks.add(new EBook("자바 기본문법", 50000, EBook.Category.LANG));
		ebooks.add(new EBook("자바 알고리즘", 30000, EBook.Category.APP));
		ebooks.add(new EBook("파이썬 기본문법", 35000, EBook.Category.LANG));
		ebooks.add(new EBook("파이썬 기본문법", 33000, EBook.Category.LANG));
		ebooks.add(new EBook("파이썬 기본문법", 33000, EBook.Category.LANG));
		ebooks.add(new EBook("리눅스", 40000, EBook.Category.APP));
		
		System.out.println("*** Reduction ***");
		System.out.println("< average >");
		double avgPrice =
			ebooks
				.stream()
				.filter(b -> b.getCategory().equals(EBook.Category.LANG))
				.mapToInt(EBook::getPrice)
				.average()
				.getAsDouble();
		System.out.printf("%,.0f원%n", avgPrice);
		System.out.println();
		
		System.out.println("< sum >");
		int sumPrice =
			ebooks
				.stream()
				.filter(b -> b.getCategory().equals(EBook.Category.LANG))
				.mapToInt(EBook::getPrice)
				.sum();
		System.out.println(sumPrice);
		System.out.println();
		
		System.out.println("< count >");
		long countPrice =
			ebooks
				.stream()
				.filter(b -> b.getCategory().equals(EBook.Category.LANG))
				.mapToInt(EBook::getPrice)
				.count();
		System.out.println(countPrice);
		System.out.println();
		
		System.out.println("< max >");
		long maxPrice =
			ebooks
				.stream()
				.filter(b -> b.getCategory().equals(EBook.Category.LANG))
				.mapToInt(EBook::getPrice)
				.max()
				.getAsInt();
		System.out.println(maxPrice);
		System.out.println();
		
		System.out.println("< reduce >");
		int sumPriceTax =
			ebooks
				.stream()
				.filter(b -> b.getCategory().equals(EBook.Category.LANG))
				.mapToInt(EBook::getPrice)
				.reduce(0, (a, b) -> a+(int)(b*1.1f));
		System.out.println(sumPriceTax);
		System.out.println();
		
		System.out.println("< reduce >");
		int minPrice =
			ebooks
				.stream()
				.filter(b -> b.getCategory().equals(EBook.Category.LANG))
				.mapToInt(EBook::getPrice)
				.reduce(Integer::min)
				.getAsInt();
		System.out.println(minPrice);
		System.out.println();
		
		System.out.println("< reduce >");
		EBook maxEBook =
			ebooks
				.stream()
				// 컬렉션 사용 시 accumulator(누산기) 실행 횟수 만큼 컬렉션을 생성하므로 성능이 좋지 않음.
				.reduce((a,b) -> a.getPrice() > b.getPrice() ? a : b)
				.get();
		System.out.println(maxEBook);
		System.out.println();
		
		System.out.println("< collect >");
		Set<Integer> priceSet =
			ebooks
				.stream()
				.map(EBook::getPrice)
				.collect(
					() -> new HashSet<Integer>(), 
					(set, i) -> set.add(i), 
					(set1, set2) -> set1.addAll(set2));
				//.collect(HashSet::new, HashSet::add, HashSet::addAll);
		System.out.println(priceSet);
		System.out.println();
		
		System.out.println("< ParallelStream collect >");
		Set<Integer> priceSet2 =
			ebooks
				.parallelStream()
				.map(EBook::getPrice)
				.collect(HashSet::new, HashSet::add, HashSet::addAll);
		System.out.println(priceSet2);
		System.out.println();
	}

}
