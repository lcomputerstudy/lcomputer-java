package com.lcomputerstudy.books.java.ch7;

public class ExCBook {
	String title;
	String author;
	int bookNo;

	ExCBook(String title, String author) {
		this.title = title;
		this.author = author;
	}
	
	static void generateBookNo(int bookNo) {
		bookNo = (int)(Math.random()*9000)+1000;
	}
	
	static void generateBookNo(ExCBook book) {
		book.bookNo = (int)(Math.random()*9000)+1000;
	}
	
}
