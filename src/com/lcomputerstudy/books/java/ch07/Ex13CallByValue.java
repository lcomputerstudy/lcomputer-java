package com.lcomputerstudy.books.java.ch07;

public class Ex13CallByValue {

	public static void main(String[] args) {
		Ex12Book book = new Ex12Book("자바문법", "엘컴퓨터학원");
		
		System.out.println("책 번호: " + book.bookNo);
		
		Ex12Book.generateBookNo(book.bookNo);
		
		System.out.println("책 번호: " + book.bookNo);
	}

}

/*
문제 1.
call by value 를 설명할 수 있는 책의 금액을 변경하는 메소드를 작성하세요.
*/