/*
 * Copyright 2022. 이신만 <rngooqw@gmail.com> All rights reserved.
 */
package com.lcomputerstudy.books.java.ch19;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.IntConsumer;
import java.util.stream.Collectors;

// 스트림
public class Ex04Stream {

	public static void main(String[] args) {
		List<EBook> ebooks = new ArrayList<>();
		ebooks.add(new EBook("자바 기본문법", 50000, EBook.Category.LANG));
		ebooks.add(new EBook("자바 알고리즘", 30000, EBook.Category.APP));
		ebooks.add(new EBook("파이썬 기본문법", 35000, EBook.Category.LANG));
		ebooks.add(new EBook("파이썬 기본문법", 33000, EBook.Category.LANG));
		ebooks.add(new EBook("리눅스", 40000, EBook.Category.APP));
		
		System.out.println("< 컬렉션 요소 출력 >");
		ebooks
			.stream()
			.forEach(System.out::println);
		System.out.println();
		
		System.out.println("< 필터링 >");
		// 파이프라인으로 시퀀스를 정하고 최종연산 시 필터링 및 출력됩니다. 
		ebooks
			.stream()
			.filter(b -> b.getCategory().equals(EBook.Category.LANG))	// 중간연산 (intermediate operation)
			.forEach(System.out::println);		// 최종연산 (terminal operation)
		System.out.println();
		
		System.out.println("< 컬렉션 매핑 >");
		ebooks
			.stream()
			.filter(b -> b.getCategory().equals(EBook.Category.LANG))
			.map(EBook::getTitle)		// b -> b.getTitle()
			.forEach(System.out::println);
		System.out.println();
		
		// Reduction: 결과를 한 개로 축소하는 함수들
		System.out.println("< Reduction (average) >");
		double avgPrice =
			ebooks
				.stream()
				.filter(b -> b.getCategory().equals(EBook.Category.LANG))
				.mapToInt(EBook::getPrice)
				.average()
				.getAsDouble();
		System.out.printf("%,.0f원%n", avgPrice);
		System.out.println();
		
		System.out.println("< Reduction (sum) >");
		int sumPrice =
			ebooks
				.stream()
				.filter(b -> b.getCategory().equals(EBook.Category.LANG))
				.mapToInt(EBook::getPrice)
				.sum();
		System.out.println(sumPrice);
		System.out.println();
		
		System.out.println("< Reduction (count) >");
		long countPrice =
			ebooks
				.stream()
				.filter(b -> b.getCategory().equals(EBook.Category.LANG))
				.mapToInt(EBook::getPrice)
				.count();
		System.out.println(countPrice);
		System.out.println();
		
		System.out.println("< Reduction (max) >");
		long maxPrice =
			ebooks
				.stream()
				.filter(b -> b.getCategory().equals(EBook.Category.LANG))
				.mapToInt(EBook::getPrice)
				.max()
				.getAsInt();
		System.out.println(maxPrice);
		System.out.println();
		
		System.out.println("< Reduction (reduce) >");
		int sumPriceTax =
			ebooks
				.stream()
				.filter(b -> b.getCategory().equals(EBook.Category.LANG))
				.mapToInt(EBook::getPrice)
				.reduce(0, (a, b) -> a+(int)(b*1.1f));
		System.out.println(sumPriceTax);
		System.out.println();
		
		System.out.println("< Reduction (reduce) >");
		int minPrice =
			ebooks
				.stream()
				.filter(b -> b.getCategory().equals(EBook.Category.LANG))
				.mapToInt(EBook::getPrice)
				.reduce(Integer::min)
				.getAsInt();
		System.out.println(minPrice);
		System.out.println();
		
		System.out.println("< Reduction (reduce) >");
		EBook maxEBook =
			ebooks
				.stream()
				// 컬렉션 사용 시 accumulator(누산기) 실행 횟수 만큼 컬렉션을 생성하므로 성능이 좋지 않음.
				.reduce((a,b) -> a.getPrice() > b.getPrice() ? a : b)
				.get();
		System.out.println(maxEBook);
		System.out.println();
		
		System.out.println("< Reduction (collect) >");
		EBookCollector ebCollector =
			ebooks
				.parallelStream()
				.map(EBook::getPrice)
				.collect(EBookCollector::new, EBookCollector::accept, EBookCollector::combiner);
		System.out.println(ebCollector);
		System.out.println();
		
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

		for (Map.Entry<EBook.Category, List<EBook>> entry : ebMap.entrySet()) {
			System.out.println("- " + entry.getKey() + " -");
			for (EBook eb : entry.getValue()) {
				System.out.println(eb);
			}
			System.out.println();
		}
		
		System.out.println("< mapping >");
		Map<EBook.Category, List<String>> ebMap2 = 
			ebooks
				.stream()
				.collect(
					Collectors.groupingBy(
						EBook::getCategory,
						Collectors.mapping(
							EBook::getTitle, 
							Collectors.toList())));		// Downstream (multi-level reduction)
		
		for (Map.Entry<EBook.Category, List<String>> entry : ebMap2.entrySet()) {
			System.out.println("- " + entry.getKey() + " -");
			for (String eb : entry.getValue()) {
				System.out.println(eb);
			}
			System.out.println();
		}
		
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
	}

}

class EBookCollector implements IntConsumer {
	private int price;
	private int count;
	
	@Override
	public void accept(int price) {		// accumulator
		this.price += price;
		count++;
	}
	public void combiner(EBookCollector eb) {
		price += eb.price;
		count += eb.count;
	}
	@Override
	public String toString() {
		return "EBookCollector [price=" + price + ", count=" + count + "]";
	}
}

class EBook implements Comparable<EBook> {
	public enum Category {
		LANG, APP
	}
	private String title;
	private int price;
	private Category category;
	
	public EBook(String title, int price, Category category) {
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
	public int compareTo(EBook b) {
		return title.compareTo(b.title);
	}
}

/*
문제 1.

*/
