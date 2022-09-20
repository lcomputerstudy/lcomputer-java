package com.lcomputerstudy.books.java.ch8;

import com.lcomputerstudy.books.java.ch8.ex6.Book;

// 접근 제한자
public class Ex6AccessModifiers {

	public static void main(String[] args) {
		Book b1 = new Book();
		//b1.setTitle("자바기본문법");
		b1.title = "자바기본문법";
		System.out.println(b1.getTitle());
		
		//b1.author = "엘컴퓨터학원";
		b1.setAuthor("엘컴퓨터학원");
		//System.out.println(b1.author);
		System.out.println(b1.getAuthor());
		
		b1.setPrice(50000);
		//b1.setDollarPrice(50000);
		System.out.println(b1.getPrice());
		System.out.println(b1.getDollarPrice());
		
		//b1.edition = 3;
		
		//b1.tax = 1.1f;
		//b1.setTax(1.1f);
		
		EBook5 eb1 = new EBook5();
		eb1.setPrice(30000);
		//eb1.tax = 1.1f;
		eb1.setTax(1.1f);
		System.out.println("세금 적용된 가격: " + eb1.getPrice() * eb1.getTax());
	}

}

class EBook5 extends Book {
	String fontColor;
	
	/*
	void setEdition(int edition) {
		this.edition = edition;
	}
	*/
	
	@Override
	protected void setTax(float tax) {
		this.tax = tax+0.1f;
	}
	
	@Override
	protected float getTax() {
		return tax;
	}
}

/*
문제1.
setEdition 메소드의 오류를 수정하세요.

문제2.
Book클래스의 title 변수를 private로 수정 후 발생되는 main메소드의 오류를 수정하세요. 

문제3.
EBook5 클래스의 setPrice 메소드를 오버라이딩 하세요.
e북은 입력된 가격보다 5000원 낮은 금액으로 price가 설정되어야 합니다.
setPrice 메소드 내에서 setDollarPrice 메소드를 호출하여 dollarPrice를 설정하세요.
setDollarPrice 메소드는 상속관계가 아닌 클래스에서 접근할 수 없어야 합니다.
힌트) setDollarPrice메소드와 dollarPrice 변수의 접근 제한자를 수정하세요.

*/