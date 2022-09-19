package com.lcomputerstudy.books.java.ch8;

public class Ex2HasARelationship {

	public static void main(String[] args) {
		Book2 b1 = new Book2();
		b1.title = "자바 문법";
		b1.author = "엘컴퓨터학원";
		b1.price = 50000;
		
		Book2 b2 = new Book2();
		b2.title = "C 문법";
		b2.author = "엘컴퓨터학원";
		b2.price = 45000;
		
		Cart cart = new Cart();
		cart.putBook(b1);
		
		Cart.print(b1);
		
		cart.putBooks(b1, b2);
		Cart.print(cart.books);
		
		User user = new User();
		user.name = "둘리";
		user.age = 20;
		
		cart.owner = user;
		
		Cart.printCartInfo(cart);
		
		
	}

}

class Cart {
	Book2 book;		// HAS-A Relationship
	Book2[] books;	// HAS-A Relationship
	User owner;		// HAS-A Relationship
	int count;
	
	void putBook(Book2 book) {
		this.book = book;
	}
	
	void putBooks(Book2... books) {
		this.books = books;
	}
	
	static void print(Book2 book) {
		System.out.println("- 소형 카트 -");
		System.out.println(book.print());
	}
	
	static void print(Book2[] books) {
		System.out.println("- 대형 카트 -");
		if (books != null) {
			for (int i=0; i<books.length; i++) {
				System.out.println(books[i].print());
			}
		}
	}
	
	static void printCartInfo(Cart cart) {
		System.out.println("카트의 주인은 " + cart.owner.name + "입니다.");
	}
}

class Book2 {
	String title;
	String author;
	int price;
	
	String print() {
		return "제목:"+title+", 저자:"+author+", 금액:"+price;
	}
}

class User {
	String name;
	int age;
}

/*
문제 1.
생각나는 개체를 이용하여 클래스들을 만들고 HAS-A 관계를 표현해주세요.
*/