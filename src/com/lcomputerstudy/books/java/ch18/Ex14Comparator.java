/*
 * Copyright 2022. 이신만 <rngooqw@gmail.com> All rights reserved.
 */
package com.lcomputerstudy.books.java.ch18;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Ex14Comparator {

	public static void main(String[] args) {
		List<Book4> books = new ArrayList<>();
		Collections.addAll(books, new Book4(1, "자바 문법"), new Book4(1, "파이썬 문법"), new Book4(3, "자바 컬렉션"));
		
		System.out.println("< 번호 오름차순 정렬, 제목 오름차순 정렬 >");
		Collections.sort(books, new AscendingNo());
		System.out.println(books);
		System.out.println();
		
		System.out.println("< 번호 내림차순 정렬, 제목 내림차순 정렬 >");
		Collections.sort(books, new Comparator<Book4>() {
			@Override
			public int compare(Book4 b1, Book4 b2) {
				int result = Integer.valueOf(b1.getNo()).compareTo(b2.getNo()) * -1;
				if (result == 0)
					result = b1.getTitle().compareTo(b2.getTitle()) * -1;
				return result;
			}
		});
		System.out.println(books);
		System.out.println();
		
		System.out.println("< Comparator.reverseOrder >");
		Collections.sort(books, Comparator.reverseOrder());
		System.out.println(books);
		System.out.println();
		
		List<String> list = new ArrayList<>();
		Collections.addAll(list, "Z", "e", "a", "c", "b", "D");
		
		System.out.println("< 알파뱃 내림차순 정렬 >");
		Collections.sort(list, Comparator.reverseOrder());
		System.out.println(list);
		System.out.println();
		
		System.out.println("< 대소문자 상관없이 알파뱃 오름차순 정렬 >");
		Collections.sort(list, String.CASE_INSENSITIVE_ORDER);
		System.out.println(list);
	}

}

class AscendingNo implements Comparator<Book4> {
	@Override
	public int compare(Book4 b1, Book4 b2) {
		int result = Integer.valueOf(b1.getNo()).compareTo(b2.getNo());
		if (result == 0)
			result = b1.getTitle().compareTo(b2.getTitle());
		return result;
	}
}

class DescendingTitle implements Comparator<Book4> {
	@Override
	public int compare(Book4 b1, Book4 b2) {
		int result = Integer.valueOf(b1.getNo()).compareTo(b2.getNo());
		if (result == 0)
			result = b1.getTitle().compareTo(b2.getTitle());
		return result;
	}
}

class Book4 implements Comparable<Book4> {
	private int no;
	private String title;
	public Book4(int no, String title) {
		this.no = no;
		this.title = title;
	}
	public int getNo() {
		return no;
	}
	public String getTitle() {
		return title;
	}
	
	// 번호 내림차순 정렬, 제목 오름차순 정렬
	@Override
	public int compareTo(Book4 book) {
		int result = Integer.valueOf(no).compareTo(book.getNo()) * -1;
		if (result == 0)
			result = title.compareTo(book.title);
		return result;
	}
	@Override
	public String toString() {
		return "(" + no + ", " + title + ")";
	}
}

/*
문제 1.
학생들을 Comparator 를 이용해 정렬하여 출력하세요.
번호 내림차순, 이름 오름차순으로 정렬하여 출력하세요.

문제 2.
번호 내림차순, 이름 내림차순으로 정렬하는 Comparator 를 이용해 출력하세요.
Comparator 는 익명클래스로 작성하세요.

문제 3.
PriorityQueue에 책들을 입력하세요.
Queue에서 책의 가격이 높은 책 부터 제거되도록 코딩하세요.
Comparable을 이용해 가격이 높은 책부터 제거되도록 작성하세요. 
Comparator를 이용해 가격이 낮은 책부터 제거되도록 코딩하세요.
*/
