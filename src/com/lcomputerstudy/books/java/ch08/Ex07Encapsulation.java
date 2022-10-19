package com.lcomputerstudy.books.java.ch08;

// 캡슐화
public class Ex07Encapsulation {

	public static void main(String[] args) {
		Book6 book = new Book6();
		book.setTitle("자바 기본문법");
		book.setAuthor("엘컴퓨터학원");
		book.setPrice(120000);
		Book6.printInfo(book);
		
		Book6 book2 = new Book6();
		book2.setTitle("자바 자료구조");
		book2.setAuthor("엘컴퓨터학원");
		book2.setPrice(30000);
		Book6.printInfo(book2);
	}

}

class Book6 {
	private String title;
	private String author;
	private int price;
	
	// setter
	public void setTitle(String title) {
		this.title = "[종이책]" + title;
	}
	// getter
	public String getTitle() {
		return title;
	}
	
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getAuthor() {
		return author;
	}
	
	public void setPrice(int price) {
		if (price < 0 || price > 60000)
			return;
		
		this.price = price;
	}
	public int getPrice() {
		return price;
	}
	
	public static void printInfo(Book6 book) {
		System.out.println(book.title + ", " + book.author + ", " + book.price + "원");
	}
	
}

/*
문제 1.
특정 개체에 대한 클래스를 만들고 getter/setter 를 이용하여 캡슐화된 클래스를 작성한 뒤 출력하세요. 
*/