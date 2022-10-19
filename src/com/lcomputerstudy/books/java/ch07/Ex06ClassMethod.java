package com.lcomputerstudy.books.java.ch07;

public class Ex06ClassMethod {

	public static void main(String[] args) {
		Book5 b1 = new Book5();
		b1.bookNo = Book5.generateBookNo();
		System.out.println(b1.bookNo);
		
		System.out.println();
		
		Book5 b2 = new Book5();
		b2.bookNo = Book5.generateBookNo();
		System.out.println(b2.bookNo);
		
	}

}

class Book5 {
	String title;
	int bookNo;
	
	static int generateBookNo() {
		return (int)(Math.random()*9000)+1000;
	}
	
	/*static int genBookNo() {
		bookNo = (int)(Math.random()*9000)+1000;
		return bookNo;
	}*/
}

/*
문제 1.
	주석처리된 코드의 오류를 수정하세요.

문제 2.
책의 가격을 달러로 변환하여 리턴하는 클래스 메소드를 작성하세요.
1달러=1000원으로 가정합니다. 
*/