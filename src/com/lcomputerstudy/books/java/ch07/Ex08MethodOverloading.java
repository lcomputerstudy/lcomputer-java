/*
 * Copyright 2022. 이신만 <rngooqw@gmail.com> All rights reserved.
 */
package com.lcomputerstudy.books.java.ch07;

// 메소드 오버로딩 (다형성)
public class Ex08MethodOverloading {

	public static void main(String[] args) {
		Book7 book = new Book7();
		book.setInfo("자바8.0문법");
		System.out.println(book.getInfo());
		
		book.setInfo("C문법", 35000);
		System.out.println(book.getInfo());
		
		book.setInfo("파이썬문법", 30000, "엘컴퓨터학원");
		System.out.println(book.getInfo());
		
		System.out.println(book.setInfo());
		System.out.println(book.getInfo());
	}

}

class Book7 {
	String title;	
	int price;
	String author;
	
	void setInfo(String title) {
		this.title = title;
	}
	
	void setInfo(String title, int price) {
		this.title = title;
		this.price = price;
	}
	
	void setInfo(String title, int price, String author) {
		this.title = title;
		this.price = price;
		this.author = author;
	}
	
	String setInfo() {
		this.title = "";
		this.price = 0;
		this.author = "";
		
		return "책의 정보가 초기화 되었습니다.";
	}
	
	String getInfo() {
		return "제목: " + title + "\n가격: " + price + "\n저자: " + author + "\n";
	}
	
}

/*
문제 1.
자동차 정보 자동차이름(문자열), 최대속도(정수), 자동차회사(문자열) 를 저장하는 클래스를 만들고
각각의 속성을 설정하는 메소드를 작성 후 출력하세요.

문제 2.
속성을 설정하는 메소드를 오버로딩을 사용하여 작성 후 출력하세요. 
*/


