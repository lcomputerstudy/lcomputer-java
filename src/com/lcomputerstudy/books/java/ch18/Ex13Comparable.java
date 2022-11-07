/*
 * Copyright 2022. 이신만 <rngooqw@gmail.com> All rights reserved.
 */
package com.lcomputerstudy.books.java.ch18;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Ex13Comparable {

	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		Collections.addAll(list, "Z", "b", "a", "g", "E");
		Collections.sort(list);
		System.out.println(list);
		
		List<Book3> books = new ArrayList<>();
		Collections.addAll(books, new Book3(1, "자바 문법"), new Book3(1, "파이썬 문법"), new Book3(3, "자바 컬렉션"));
		Collections.sort(books);
		System.out.println(books);
	}

}

class Book3 implements Comparable<Book3> {
	private int no;
	private String title;
	public Book3(int no, String title) {
		this.no = no;
		this.title = title;
	}
	public int getNo() {
		return no;
	}
	public String getTitle() {
		return title;
	}
	@Override
	public int compareTo(Book3 book) {
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
번호와 이름을 가진 학생 클래스를 만드세요.
학생의 번호를 오름차순으로 정렬하여 출력하세요.
번호가 같을 경우 이름을 내림차순으로 정렬하여 출력하세요.
*/
