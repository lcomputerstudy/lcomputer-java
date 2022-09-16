package com.lcomputerstudy.books.java.ch7;

public class ExDUser {
	String name;
	int age;
	
	ExDUser(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	void sign(String owner) {
		owner = name;
		System.out.println("소유자 싸인: " + owner);
	}
}
