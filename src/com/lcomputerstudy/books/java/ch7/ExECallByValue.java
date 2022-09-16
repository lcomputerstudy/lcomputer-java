package com.lcomputerstudy.books.java.ch7;

public class ExECallByValue {

	public static void main(String[] args) {
		ExCBook book = new ExCBook("자바문법", "엘컴퓨터학원");
		
		System.out.println("책 소유자: " + book.owner);
		
		ExDUser person = new ExDUser("홍길동", 29);
		person.sign(book.owner);
		
		System.out.println("책 소유자: " + book.owner);
	}

}
