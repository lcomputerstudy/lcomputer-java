/*
 * Copyright 2022. 이신만 <rngooqw@gmail.com> All rights reserved.
 */
package com.lcomputerstudy.books.java.ch08;

public class Ex03Super {

	public static void main(String[] args) {
		EBook2 eb = new EBook2();
		System.out.println("책의 제목은 [" + eb.title + "]이고 글자의 색은 [" + eb.fontColor + "]입니다.");
	}

}

class Book3 {
	String title;
	String author;
	int price;
	
	Book3(String title, String author) {
		this.title = title;
		this.author = author;
	}
	
	/*
	Book3() {
		
	}
	*/
}

class EBook2 extends Book3 {
	String fontColor;

	EBook2() {
		super("언어 문법", "엘컴퓨터학");
		this.fontColor = "블랙";
	}

}

/*
문제 1.
이전 문제에서 작성한 부모 클래스에 기본 생성자를 없애면 컴파일 에러가 발생합니다. 
super를 사용하여 컴파일 에러가 나지 않도록 수정하세요. 
*/