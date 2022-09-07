package com.lcomputerstudy.books.java.ch7;

// 지역변수, this, return
public class Ex4Method {

	public static void main(String[] args) {
		Book3 book = new Book3();
		int bookPrice = book.getPrice();
		System.out.println("세금 포함된 책의 가격: " + bookPrice);
		
		book.price = 50000;
		bookPrice = book.getPrice();
		System.out.println("세금 포함된 책의 가격: " + bookPrice);
		System.out.println();
		
		book.price = 30000;
		book.setPrice(35000);
		System.out.println();
		
		book.setTitle("자바");
		System.out.println("책이름: " + book.title);
		
		book.setTitle("자바문법");
		System.out.println("책이름: " + book.title);
	}

}

class Book3 {
	int price;
	String title;
	
	int getPrice() {
		if (price <= 0)
			return 0;
		
		float tax = 1.1f;
		price = (int)(price * tax);
		
		return price;
	}
	
	void setPrice(int price) {
		System.out.println("price -> " + price);
		System.out.println("this.price -> " + this.price);
		
		this.price = price;
		System.out.println("this.price = price 적용 후 this.price -> " + this.price);
	}
	
	void setTitle(String title) {
		String[] filter = {"자바", "C", "파이썬"};
		
		for (int i=0; i<filter.length; i++) {
			if (title.equals(filter[i])) {
				
				System.out.println("사용할 수 없는 책 이름입니다.");
				return;
			}
		}
		
		this.title = title;
		
	}
	
}

/*
문제 1.
BookTest 클래스를 작성하세요.
가격을 저장하는 인스턴스 변수를 선언하세요.
책의 가격을 설정하는 메소드를 작성하세요.
책의 가격은 10000원 이상 80000원 미만으로만 설정가능해야 하며 그 외의 금액은 "설정 가능하지 않은 가격입니다." 를 출력하세요.

문제 2.
BookTest 클래스의 인스턴스를 두 개 생성하여 메소드를 사용하여 각각 금액을 설정하고 설정된 금액을 출력하세요.

문제 3.
BookTest 클래스에 책의 저자를 최대 3명까지 저장할 수 있는 배열을 선언하세요.
저자를 설정할 수 있는 메소드를 작성하세요.
힌트1) 메소드 파라미터로 배열 사용이 가능합니다.
힌트2) for문과 배열간의 대입을 활용하세요.
*/