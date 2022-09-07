package com.lcomputerstudy.books.java.ch7;

public class Ex3Method {

	public static void main(String[] args) {
		Book2 book = new Book2();
		book.title = "자바문법";
		book.author = "엘컴퓨터학원";
		book.price = 50000;
		
		book.printInfo();
		
		Book2 book2 = new Book2();
		book2.title = "C문법";
		book2.author = "엘컴퓨터학원";
		book2.price = 30000;
		
		book2.printInfo();
		
		book2.setPrice(20000);
		book2.printInfo();
		
		book2.setPrice(30000, 1.2f);
		book2.printInfo();
		
		float dollar = book2.getDollarPrice();
		System.out.println(dollar);
		
		book2.printInfoEng();
	}

}

class Book2 {
	String title;
	String author;
	int price;
	int stock;
	
	void printInfo() {
		System.out.println("---------------");
		System.out.println("도서명: " + title);
		System.out.println("저자: " + author);
		System.out.println("가격: \u20a9" + price + "원");
		System.out.println("---------------");
	}
	
	void setPrice(int parameterPrice) {
		price = (int)(parameterPrice * 1.1f);
	}
	
	void setPrice(int parameterPrice, float taxRate) {
		price = (int)(parameterPrice * taxRate);
	}
	
	float getDollarPrice() {
		float dollarPrice = price / 1000f;
		return dollarPrice;
	}
	
	void printInfoEng() {
		System.out.println("---------------");
		System.out.println("book name: " + title);
		System.out.println("author: " + author);
		System.out.println("price: $" + getDollarPrice());
		System.out.println("---------------");
	}
	
}

/*
문제 1.
계산기 클래스를 만들고 더하기, 빼기, 곱하기, 나누기 메소드를 작성한 뒤 메소드를 이용하여 결과를 출력하세요. 
*/