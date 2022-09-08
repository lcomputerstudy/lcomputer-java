package com.lcomputerstudy.books.java.ch7;

// class variable
public class Ex5ClassVariable {

	public static void main(String[] args) {
		Book4.tax = 1.2f;
		
		Book4 b1 = new Book4();
		b1.title = "자바문법";
		b1.price = 50000;
		
		Book4 b2 = new Book4();
		b2.title = "C문법";
		b2.price = 40000;
		
		b1.printInfo();
		b2.printInfo();
		System.out.println();
		
		Book4.tax = 1.4f;
		b1.printInfo();
		b2.printInfo();
		System.out.println();
		
		b1.tax = 1.5f;		// 경고
		b1.printInfo();
		b2.printInfo();
	}

}

class Book4 {
	String title;
	int price;
	static float tax;
	
	void printInfo() {
		String message = "책이름: " + title + ", 책가격: " + ((int)(price*tax)) + ", 세율: " + tax;
		System.out.println(message);
	}
}

/*
문제 1.
책 클래스에 카테고리를 저장할 수 있는 속성(변수)을 추가하세요.
카테고리를 "문화" 에서 "도서"로 변경해 주세요.
카테고리 변경 시 모든 인스턴스에 동일하게 적용되도록 코딩 후 적용된 결과를 출력하세요.
*/