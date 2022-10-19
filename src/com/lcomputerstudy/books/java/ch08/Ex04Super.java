package com.lcomputerstudy.books.java.ch08;

public class Ex04Super {

	public static void main(String[] args) {
		EBook3 eb = new EBook3();
		eb.setPrice(30000);
		
		System.out.println("e북 가격: " + eb.price);
		
		eb.title = "자바 기본 문법";
		System.out.println(eb.getTitle());
		
		eb.author = "엘컴퓨터학원";
		System.out.println(eb.getAuthor());
		
	}

}

class Book4 {
	String title;
	String author;
	int price;
	
}

class EBook3 extends Book4 {
	int price;
	String fontColor;
	
	void setPrice(int price) {
		this.price = price;
		super.price = price + 10000;
		System.out.println("종이책 가격: " + super.price);
		System.out.println("e북 가격: " + this.price);
	}
	
	String getTitle() {
		return title;
	}
	
	String getAuthor() {
		return this.author;
	}
}

/*
문제 1.
이전 문제에서 만든 클래스에 this와 super를 적용한 뒤 각각의 값을 출력하세요. 
*/