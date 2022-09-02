package com.lcomputerstudy.books.java.ch7;

public class Ex2Class {

	public static void main(String[] args) {
		Book book1 = new Book();
		book1.title = "자바문법책";
		book1.author = "엘컴퓨터학원";
		book1.price = 50000;
		System.out.println(book1.title);
		System.out.println(book1.author);
		System.out.println(book1.price);
		
		System.out.println();
		
		Book book2 = new Book();
		book2.title = "C문법책";
		book2.author = "엘컴퓨터학원";
		book2.price = 35000;
		System.out.println(book2.title);
		System.out.println(book2.author);
		System.out.println(book2.price);
		
		System.out.println();
		
		Book[] arrBook = new Book[2];
		arrBook[0] = book1;
		arrBook[1] = book2;
		
		for (int i=0; i<arrBook.length; i++) {
			System.out.printf("제목: %s, 저자: %s, 가격: %d%n", arrBook[i].title, arrBook[i].author, arrBook[i].price);
		}
	}

}

class Book {
	String title;
	String author;
	int price;
}

/*
문제 1.
클래스를 이용하여 도서관리 프로그램 등록과 목록 기능을 개발하세요.
*/