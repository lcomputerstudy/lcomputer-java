/*
 * Copyright 2022. 이신만 <rngooqw@gmail.com> All rights reserved.
 */
package com.lcomputerstudy.books.java.ch19;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.Random;
import java.util.function.IntConsumer;
import java.util.stream.IntStream;
import java.util.stream.Stream;

// 스트림
public class Ex04Stream {

	public static void main(String[] args) {
		System.out.println("< of >");
		Stream<String> stream = Stream.of("hi", "hello", "안녕하세요");
		stream.forEach(str -> System.out.print(str + ", "));
		System.out.println("\n");
		
		System.out.println("< generate >");
		Stream<Integer> lottoStream = Stream.generate(() -> (int)(Math.random()*45)+1).limit(6);
		lottoStream.forEach(System.out::println);
		System.out.println();
		
		System.out.println("< iterate >");
		Stream
			.iterate(1, i -> i+1)
			.limit(45)
			.forEach(i -> System.out.print(i + ","));
		System.out.println("\n");
		
		System.out.println("< IntStream >");
		IntStream intStream = new Random()
			.ints(1, 45)
			.limit(6);
		intStream.forEach(System.out::println);
		System.out.println();
		
		List<EBook> ebooks = new ArrayList<>();
		ebooks.add(new EBook("자바 기본문법", 50000, EBook.Category.LANG));
		ebooks.add(new EBook("자바 알고리즘", 30000, EBook.Category.APP));
		ebooks.add(new EBook("파이썬 기본문법", 35000, EBook.Category.LANG));
		ebooks.add(new EBook("파이썬 기본문법", 33000, EBook.Category.LANG));
		ebooks.add(new EBook("파이썬 기본문법", 33000, EBook.Category.LANG));
		ebooks.add(new EBook("리눅스", 40000, EBook.Category.APP));
		//ebooks.add(new EBook("데이터베이스", 50000, EBook.Category.APP));
		
		System.out.println("< forEach >");
		ebooks
			.stream()
			.forEach(System.out::println);
		System.out.println();
		
		System.out.println("< filter >");
		// 파이프라인으로 시퀀스를 정하고 최종연산 시 필터링 및 출력됩니다. 
		ebooks
			.stream()
			.filter(b -> b.getCategory().equals(EBook.Category.LANG))	// 중간연산 (intermediate operation)
			.forEach(System.out::println);		// 최종연산 (terminal operation)
		System.out.println();
		
		System.out.println("< findFirst >");
		Optional<EBook> findFirstEB =
			ebooks
				.stream()
				.filter(eb -> eb.getTitle().startsWith("자바"))
				.findFirst();
		System.out.println(findFirstEB);
		System.out.println(findFirstEB.get());
		System.out.println();
		
		System.out.println("< findAny >");
		Optional<EBook> findAnyEB =
			ebooks
				.stream()
				.filter(eb -> eb.getTitle().startsWith("자바"))
				.findAny();
		System.out.println(findAnyEB.get());
		System.out.println();
		
		System.out.println("< anyMatch >");
		boolean isMatched =
			ebooks
				.stream()
				.anyMatch(eb -> eb.getTitle().startsWith("자바"));
		System.out.println(isMatched);
		System.out.println();
		
		System.out.println("< allMatch >");
		boolean isMatched2 =
			ebooks
				.stream()
				.allMatch(eb -> eb.getPrice() > 0);
		System.out.println(isMatched2);
		System.out.println();
		
		System.out.println("< noneMatch >");
		boolean isMatched3 =
			ebooks
				.stream()
				.noneMatch(eb -> eb.getTitle().startsWith("데"));
		System.out.println(isMatched3);
		System.out.println();
		
		System.out.println("< limit >");
		// 파이프라인으로 시퀀스를 정하고 최종연산 시 필터링 및 출력됩니다. 
		ebooks
			.stream()
			.filter(b -> b.getCategory().equals(EBook.Category.LANG))
			.limit(2)
			.forEach(System.out::println);
		System.out.println();
		
		System.out.println("< distinct >");
		ebooks
			.stream()
			.filter(b -> b.getCategory().equals(EBook.Category.LANG))
			.distinct()
			.forEach(System.out::println);
		System.out.println();
		
		System.out.println("< map >");
		ebooks
			.stream()
			.filter(b -> b.getCategory().equals(EBook.Category.LANG))
			.map(EBook::getTitle)		// b -> b.getTitle()
			.forEach(System.out::println);
		System.out.println();
		
		System.out.println("< peek >");
		ebooks
			.stream()
			.filter(b -> b.getCategory().equals(EBook.Category.LANG))
			.peek(b -> System.out.println("peek1 -> " + b))
			.map(EBook::getTitle)		// b -> b.getTitle()
			.peek(s -> System.out.println("peek2 -> " + s))
			.forEach(System.out::println);
		System.out.println();
		
		System.out.println("< flatMap >");
		Stream<String> stream2 = Stream.of("A:90", "B:80", "C:100");
		stream2
			.flatMap(s -> Arrays.asList(s.split(":")).stream())
			.forEach(System.out::println);
		System.out.println();
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
	@Override
	public int hashCode() {
		return Objects.hash(title, price, category);
	}
	@Override
	public boolean equals(Object o) {
		if (!(o instanceof EBook))
			return false;
		EBook eb = (EBook)o;
		return title.equals(eb.getTitle()) && (price == eb.price) && category.equals(eb.getCategory());
	}
}

/*
문제 1.
스트림에 '가', '나', '다' 를 추가하는 코드를 작성하세요.

문제 2.
스트림을 사용하여 1~100 사이의 숫자 중 난수 10개를 출력하세요.

문제 3.
자동차 인스턴스 5개를 가진 배열을 만들고 스트림으로 변환하세요.
500원 보다 비싼 차량들을 출력하세요.

문제 4.
자동차 이름을 중복 제거 후 출력하세요.

문제 5.
자동차 인스턴스로 이뤄진 스트림을 자동차 금액들로만 이뤈진 스트림으로 변환 후 3개만 출력하세요.

문제 6.
스트림에 저장된 자동차명의 모든 글자를 나누어 한 글자씩 출력하되 오름차순으로 정렬하여 출력하세요.
힌트) flatMap, sorted 를 사용하세요.

문제 7.
스트림에서 특정 차량이름을 검색하여 출력하세요.
*/
