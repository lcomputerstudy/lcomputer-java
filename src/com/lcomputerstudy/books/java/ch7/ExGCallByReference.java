package com.lcomputerstudy.books.java.ch7;

public class ExGCallByReference {

	public static void main(String[] args) {
		ExCBook book = new ExCBook("자바문법", "엘컴퓨터학원");
		
		System.out.println("책 소유자: " + book.owner);
		
		ExFUser2 person2 = new ExFUser2("홍길동", 29);
		person2.sign(book);
		
		System.out.println("책 소유자: " + book.owner);
	}

}
