package com.lcomputerstudy.books.java.ch08;

// 오버라이딩 (다형성)
public class Ex05Overriding {

	public static void main(String[] args) {
		EBook4 eb = new EBook4();
		eb.setPrice(30000);
		eb.printPrice();
		
		eb.printAllPrice();
	}

}

class Book5 {
	String title;
	String author;
	int price;
	
	void setPrice(int price) {
		this.price = price;
	}
	
	void printPrice() {
		System.out.println("paperbook price: " + price);
	}
	
	void setPrice() {
		
	}
	
}

class EBook4 extends Book5 {
	int price;
	String fontColor;
	
	void setPrice(int price) {
		super.setPrice(price + 10000);
		this.price = price;
	}
	
	void printPrice() {
		System.out.println("ebook price: " + price);
	}
	
	void printAllPrice() {
		super.printPrice();
		printPrice();		// this.printPrice();
	}
	
	/*
	@Override
	void setprice() {
		
	}
	*/
	
}

/*
문제 1.
제목 설정 메소드를 부모클래스와 자식클래스에 모두 작성하고 자식클래스의 제목 설정 메소드는 제목에 [이북]이 추가되도록 작성하세요.
부모의 타이틀과 자식의 타이틀 모두 출력하세요. 
*/