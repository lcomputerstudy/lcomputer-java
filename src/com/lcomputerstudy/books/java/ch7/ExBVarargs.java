package com.lcomputerstudy.books.java.ch7;

import java.util.Arrays;

// 가변인자
public class ExBVarargs {

	public static void main(String[] args) {
		Book12 book1 = new Book12();
		book1.title = "자바 문법";
		book1.author = "엘컴퓨터학원";
		book1.setTag("컴퓨터", "IT", "프로그램 언어", "자바");
		
		Book12.printInfo(book1);
		
		Book12 book2 = new Book12();
		book2.title = "C 문법";
		book2.author = "엘코딩";
		book2.setTag("IT", "프로그램 언어");
		
		Book12.printInfo(book2);
	}

}

class Book12 {
	String title;
	String author;
	String[] tag;
	
	void setTag(String... params) {
		tag = new String[params.length];
		for (int i=0; i<tag.length; i++) {
			tag[i] = params[i];
		}
	}
	
	static void printInfo(Book12 book) {
		System.out.printf("제목: %s%n저자: %s%n", book.title, book.author);
		System.out.printf("카테고리: %s%n%n", Arrays.toString(book.tag));
	}
}

/*
문제 1.
가변인자를 사용하여 책의 저자를 여러명 설정할 수 있는 코드를 작성하고 결과를 출력하세요.
*/
