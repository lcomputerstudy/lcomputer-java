package com.lcomputerstudy.books.java.ch7;

public class ExFPerson2 {
	String name;
	int age;
	
	ExFPerson2(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	void sign(ExCBook book) {
		book.owner = name;
		System.out.println("소유자 싸인: " + book.owner);
	}
}
