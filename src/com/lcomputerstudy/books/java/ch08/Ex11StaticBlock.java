/*
 * Copyright 2022. 이신만 <rngooqw@gmail.com> All rights reserved.
 */
package com.lcomputerstudy.books.java.ch08;

// 정적 초기화 블록
public class Ex11StaticBlock {

	public static void main(String[] args) {
		Cart2.print();
		
		Book9 b1 = new Book9();
		Book9 b2 = new Book9("자바 초기화 블럭");
		Book9 b3 = new Book9("자바 static에 대하여", "엘컴퓨터학원");
		
		Cart2.add(b1);
		Cart2.add(b2);
		Cart2.add(b3);
		
		Cart2.print();
	}

}

class Cart2 {
	public static Book9[] books = new Book9[5];
	private static int index = 0;
	
	static {
		Book9 book = new Book9();
		book.setTitle("비어있음");
		book.setAuthor("비어있음");
		
		for (int i=0; i<books.length; i++) {
			books[i] = book; 
		}
	}

	public static void print() {
		for (int i=0; i<books.length; i++) {
			books[i].print();
		}
		System.out.println();
	}
	
	public static void add(Book9 book) {
		books[index] = book;
		index++;
	}
}

class Book9 {
	private String title;
	private String author;
	private static int sequence = 0;
	private int bookNo;
	
	{
		bookNo = ++sequence;
	}
	
	Book9() {
		this("비어있음", "비어있음");
		//bookNo = ++sequence;
	}
	
	Book9(String title) {
		this(title, "작자미상");
		//bookNo = ++sequence;
	}
	
	Book9(String title, String author) {
		this.title = title;
		this.author = author;
		//bookNo = ++sequence;
	}
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public void print() {
		System.out.println(bookNo + ", " + title + ", " + author);
	}
}

/*
문제 1.
정적 초기화 블록과 인스턴스 초기화 블록을 사용한 예제를 작성하세요.

문제 2.
정적 초기화 블럭에서는 인스턴스 변수를 사용할 수 없습니다.
이유를 설명하세요.
*/