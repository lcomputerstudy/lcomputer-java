package com.lcomputerstudy.books.java.ch17;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Ex02Generics {

	public static void main(String[] args) {
		Book2 b1 = new Book2("자바 기본문법", "엘컴퓨터학원");
		Book2 b2 = new Book2("자바 자료구조", "엘컴퓨터학원");
		Book2 b3 = new Book2("자바 알고리즘", "엘코딩연구소");
		
		Cart2<Book2> cart = new Cart2<Book2>();		// 타입 아규먼트
		cart.add(b1);
		cart.add(b2);
		cart.add(b3);
		cart.printAllItems();
		System.out.println();
		
		Car[] cars = {
				new Car("소나타", 2),
				new Car("K5", 4),
				new Car("아반떼", 5)
			};
		Cart2<Car> cart2 = new Cart2<Car>(cars);
		cart2.printAllItems();
		System.out.println();
		
		System.out.println(cart2.get(1));
	}

}

class Book2 {
	private String title;
	private String author;
	
	public Book2(String title, String author) {
		this.title = title;
		this.author = author;
	}
	public String getTitle() {
		return title;
	}
	public String getAuthor() {
		return author;
	}
	@Override
	public String toString() {
		return "Book [title=" + title + ", author=" + author + "]";
	}
}

class Car {
	private String modelName;
	private int door;
	
	public Car(String modelName, int door) {
		this.modelName = modelName;
		this.door = door;
	}
	public String getModelName() {
		return modelName;
	}
	public int getDoor() {
		return door;
	}
	@Override
	public String toString() {
		return "Car [modelName=" + modelName + ", door=" + door + "]";
	}
}

class Cart2<T> {	// <T> 타입 파라미터
	private List<T> items;
	
	public Cart2() {
		items = new ArrayList<T>();
	}
	public Cart2(T[] arr) {
		items = new ArrayList<T>(Arrays.asList(arr));
	}
	
	public void add(T item) {
		items.add(item);
	}
	
	public T get(int index) {
		return items.get(index);
	}
	
	public void printAllItems() {
		for (T item : items) {		// 바이트 코드 변환 시 보일러 플레이트 최소화
			System.out.println(item);
		}
	}
}

/*
문제 1.
상자에 연필과 티비를 담는 프로그램을 코딩하세요.
상자에는 연필, 티비 외에 어떠한 타입도 받을 수 있도록 타입 파라미터를 사용하세요. 
*/