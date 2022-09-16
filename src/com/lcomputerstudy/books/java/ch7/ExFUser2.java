package com.lcomputerstudy.books.java.ch7;

public class ExFUser2 {
	String name;
	int age;
	
	ExFUser2(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	void sign(ExCBook book) {
		book.owner = name;
		System.out.println("소유자 싸인: " + book.owner);
	}
}
