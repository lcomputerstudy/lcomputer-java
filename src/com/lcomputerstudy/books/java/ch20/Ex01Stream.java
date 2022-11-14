package com.lcomputerstudy.books.java.ch20;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.IntConsumer;
import java.util.stream.Collectors;

public class Ex01Stream {

	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("abcd");
		list.add("bc");
		list.add("cde");
		
		// intermediate operation
		// terminal operation
		
		// stream
		// called stream operation or aggregate operations
		list
			.stream()
			.forEach(System.out::println);
		System.out.println();
		
		// pipeline
		list
			.stream()
			.filter(s -> s.length() > 2)
			.forEach(System.out::println);
		System.out.println();
		
		list
			.stream()
			.filter(s -> s.length() > 2)
			.map(s -> s.length())
			.forEach(System.out::println);
		System.out.println();
		
		// 터미널 작업(예: 평균, 합계, 최소값, 최대값 및 개수)
		double d1 = list
			.stream()
			.filter(s -> s.length() > 2)
			.mapToInt(s -> s.length())
			.average()		// reduction
			.getAsDouble();
		System.out.println(d1);
		System.out.println();
		
		int i1 = list
			.stream()
			.filter(s -> s.length() > 2)
			.mapToInt(String::length)
			.sum();
		System.out.println(i1);
		System.out.println();
		
		int i2 = list
			.stream()
			.filter(s -> s.length() > 2)
			.map(String::length)
			.reduce(0, (a, b) -> a+b);		// 컬렉션 사용시 매번 컬렉션 새롭게 생성하므로 성능이 좋지 못함 (요소 처리 시 항상 새 값을 생성)
		System.out.println(i2);
		System.out.println();
		
		List<Book> books = new ArrayList<>();
		books.add(new Book("자바 기본문법", 50000, Book.Category.LANG));
		books.add(new Book("자바 알고리즘", 30000, Book.Category.APP));
		books.add(new Book("파이썬 기본문법", 35000, Book.Category.LANG));
		books.add(new Book("파이썬 기본문법", 33000, Book.Category.LANG));
		books.add(new Book("리눅스", 40000, Book.Category.APP));
		
		Combiner comb = books
			.stream()
			.filter(b -> b.getPrice() < 50000)
			.map(Book::getPrice)
			.collect(Combiner::new, Combiner::accept, Combiner::combine);		// 매번 컬렉션을 새롭게 생성하지 않음
		System.out.println(comb.price);		// parallelism
		System.out.println();
		
		List<String> books2 = books
			.stream()
			.filter(b -> b.getPrice() < 50000)
			.map(Book::getTitle)
			.collect(Collectors.toList());
		System.out.println(books2);
		System.out.println();
		
		Set<String> books3 = books
			.stream()
			.filter(b -> b.getPrice() < 50000)
			.map(Book::getTitle)
			.collect(Collectors.toSet());	// encapsulates three arguments (supplier, accumulator, and combiner functions).
		System.out.println(books3);
		System.out.println();
		
		// 결과를 하나로 축소하는 것이 리덕션
		// Collectors 는 컬렉션에 요소를 축적 및 조건에 따른 요소를 요약 메소드들을 포함 
		
		Map<Book.Category, List<Book>> books4 = 
			books
				.stream()
				.collect(
					Collectors.groupingBy(Book::getCategory));
		System.out.println(books4);
		System.out.println();
		
		Map<Book.Category, List<String>> books5 = 
			books
				.stream()
				.collect(
					Collectors.groupingBy(
						Book::getCategory,
						Collectors.mapping(				// The Collector parameter is called a downstream collector (1개 이상의 다운 스트림 콜렉터가 있을 경우 멀티 레벨 리덕션이라고 한다.)
							Book::getTitle, 
							Collectors.toList())));
		System.out.println(books5);
		System.out.println();
		
		Map<Book.Category, Integer> books6 =
			books
				.stream()
				.collect(
					Collectors.groupingBy(
						Book::getCategory,
						Collectors.reducing(		// identity, mapper, operation
							0,
							Book::getPrice,
							Integer::sum)));
		System.out.println(books6);
		System.out.println();
		
		Map<Book.Category, Double> books7 =
			books
				.stream()
				.collect(
					Collectors.groupingBy(
						Book::getCategory,
						Collectors.averagingInt(Book::getPrice)));
		System.out.println(books7);
		System.out.println();
	}

}

class Combiner implements IntConsumer {
	int price;
	int count;
	@Override
	public void accept(int price) {
		this.price += price;
		count++;
		System.out.println("accept: " + this.price + ": " + price + ": " + count);
	}
	public void combine(Combiner c) {
		count += c.count;
		System.out.println("???");
//		this.price += c.price;
//		System.out.println("combine: " + this.price + ", " + c.price);
	}
}

class Book {
	public enum Category {
		LANG, APP
	}
	
	private String title;
	private int price;
	private Category category;
	
	public Book(String title, int price, Category category) {
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
		return "Book [title=" + title + ", price=" + price + ", category=" + category + "]";
	}
	
}


