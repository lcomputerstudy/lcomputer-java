package com.lcomputerstudy.books.java.ch7;

public class ExDCallByValue {

	public static void main(String[] args) {
		ExCBook book = new ExCBook("자바문법", "엘컴퓨터학원");
		
		System.out.println("책 번호: " + book.bookNo);
		
		ExCBook.generateBookNo(book.bookNo);
		
		System.out.println("책 번호: " + book.bookNo);
	}

}

/*
문제 1.
call by value 를 설명할 수 있는 책의 금액을 변경하는 메소드를 작성하세요.
*/