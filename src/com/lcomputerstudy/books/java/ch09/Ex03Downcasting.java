package com.lcomputerstudy.books.java.ch09;

// 다운캐스팅 (다형성)
public class Ex03Downcasting {

	public static void main(String[] args) {
		Book3 book = null;
		EBook3 ebook = null;
		
		book = new Book3();
		book.setTitle("자바 기본문법");
		System.out.println(book.getTitle());
		
		book = new EBook3();
		book.setTitle("자바 알고리즘");
		System.out.println(book.getTitle());
		//book.setFontColor("블랙");
		ebook = (EBook3)book;		// 다운캐스팅
		ebook.setFontColor("블랙");
		System.out.println(ebook.getFontColor());
	}

}

class Book3 {
	private String title;
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	
}

class EBook3 extends Book3{
	private String fontColor;

	public String getFontColor() {
		return fontColor;
	}
	public void setFontColor(String fontColor) {
		this.fontColor = fontColor;
	}
	
}

/*
문제 1.
오디오북 클래스를 추가하세요.
볼륨을 저장하는 정수타입의 속성을 추가하세요.
main 메소드에서 다운캐스팅을 사용하여 오디오북의 볼륨을 출력하는 코드를 작성하세요.
*/