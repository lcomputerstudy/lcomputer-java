package com.lcomputerstudy.books.java.ch13;

public class Ex01ObjectClass {

	public static void main(String[] args) {
		Object o = null;
		o = new Object();
		System.out.println(o.toString());
		
		System.out.println("---");
		
		Book b1 = new Book();
		System.out.println(b1.toString());
		
		System.out.println("---");
		
		System.out.println(b1);
		
		System.out.println("---");
		
		Book2 b2 = new Book2("자바 기본문법", "엘컴퓨터학원");
		System.out.println(b2);
		
		System.out.println("---");
		
		o = b2;
		System.out.println(o);
	}

}

class Book {
	private String title;
	private String author;
}

class Book2 {
	private String title;
	private String author;
	
	public Book2(String title, String author) {
		this.title = title;
		this.author = author;
	}
	
	@Override
	public String toString() {
		return "제목: " + title + ", 저자: " + author;
	}
}
