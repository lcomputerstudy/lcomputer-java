package com.lcomputerstudy.books.java.ch08;

import com.lcomputerstudy.books.java.ch08.ex06.Book;

public class Ex10Package {

	public static void main(String[] args) {
		Book book = new Book();
		book.title = "엘컴퓨터학원";
		System.out.println(book.getTitle());
	}

}

/*
문제 1.
com.test.book 패지키를 생성하세요.
위 패키지에 Book 클래스를 생성한 뒤 속성과 메소드를 추가하세요.
com.test.main 패키지를 생성하세요.
위 패키지에 BookTest 클래스를 생성한 뒤 main 메소드를 생성하세요.
main 메소드에서 Book클래스의 메소드를 호출하여 반환된 값을 출력하는 코드를 작성하세요.
*/