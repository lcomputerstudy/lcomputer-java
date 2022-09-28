package com.lcomputerstudy.books.java.ch10;

// 로컬 클래스 (지역 클래스)
public class Ex03LocalClass {

	public static void main(String[] args) {
		System.out.println(EBook3.validatePrice(45000));
	
		System.out.println();
		
		EBook3 eb = new EBook3();
		eb.setPrice(50000);
		System.out.println(eb.getPrice());
	}

}


class EBook3 {
	private String title;
	private String author;
	private int price;
	public final static float tax = 1.1f;
	
	public static boolean validatePrice(int price) {
		float dollar = 1100f;
		
		class Price {
			int taxPrice;
			
			Price(int price) {
				taxPrice = (int)(price * EBook3.tax);
				//dollar = 1200f;	// error
			}
			
			int getTaxPrice() {
				return taxPrice;
			}
			
			float getDollarPrice() {
				return taxPrice / dollar;
			}
		}
		
		Price p = new Price(price);
		int taxPrice = p.getTaxPrice();
		System.out.println(taxPrice);
		
		float dollarPrice = p.getDollarPrice();
		System.out.println(dollarPrice);
		
		if (!(taxPrice >= 0 && taxPrice <= 50000))
			return false;
		else if (!(dollarPrice >= 0 && dollarPrice <= 50))
			return false;
		
		return true;
	}
	
	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		if (!EBook3.validatePrice(price))
			return;
		this.price = price;
	}
	
}

/*
문제 1.
로컬 클래스를 사용하여 저자 이름 유효성 검사 메소드를 코딩하세요.
저자 이름은 영문 대문자, 공백만 가능합니다.
*/
