package com.lcomputerstudy.books.java.ch13;

import java.util.Objects;

public class Ex03HashCode {

	public static void main(String[] args) {
		Book5 b1 = new Book5("자바 기본문법", "엘컴퓨터학원");
		Book5 b2 = new Book5("자바 기본문법", "엘컴퓨터학원");
		Book5 b3 = new Book5("자바 객체지향", "엘컴퓨터학원");
		
		System.out.println(b1.hashCode());
		System.out.println(b2.hashCode());
		System.out.println(b3.hashCode());
		System.out.println();
		
		Book6 b4 = new Book6("자바 기본문법", "엘컴퓨터학원");
		Book6 b5 = new Book6("자바 기본문법", "엘컴퓨터학원");
		Book6 b6 = new Book6("자바 객체지향", "엘컴퓨터학원");
		Book6 b7 = new Book6("자바 객체지향", "엘컴퓨터학원");
		
		System.out.println(b4.hashCode());
		System.out.println(b5.hashCode());
		System.out.println(b6.hashCode());
		System.out.println(b7.hashCode());
		System.out.println();
		
		String s1 = new String("자바 문법");
		String s2 = new String("자바 문법");
		String s3 = new String("자바 알고리즘");
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		System.out.println(s3.hashCode());
		System.out.println();
		
		System.out.println(System.identityHashCode(s1));
		System.out.println(System.identityHashCode(s2));
		System.out.println(System.identityHashCode(s3));
		System.out.println();
		
		System.out.println(System.identityHashCode(b1));
		System.out.println(b1.hashCode());
		System.out.println(System.identityHashCode(b2));
		System.out.println(b2.hashCode());
		System.out.println(System.identityHashCode(b3));
		System.out.println(b3.hashCode());
	}
}

class Book5 {
	private String title;
	private String author;
	
	public Book5(String title, String author) {
		this.title = title;
		this.author = author;
	}	
}

class Book6 {
	private String title;
	private String author;
	
	public Book6(String title, String author) {
		this.title = title;
		this.author = author;
	}

	@Override
	public int hashCode() {
		return Objects.hash(author, title);
	}
}

/*
문제 1.
원하는 클래스를 만드세요.
인스턴스 두 개를 생성하세요.
hashCode 메소드를 오버라이딩하여 인스턴스 변수들의 값이 모두 같을 시 같은 해시코드를 반환하도록 코딩하세요. 
*/