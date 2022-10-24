/*
 * Copyright 2022. 이신만 <rngooqw@gmail.com> All rights reserved.
 */
package com.lcomputerstudy.books.java.ch17;

import java.util.ArrayList;
import java.util.List;

public class Ex05MultipleBound {

	public static void main(String[] args) {
		Book3 b1 = new Book3();
		b1.setTitle("자바 제네릭스");
		b1.setAuthor("엘컴퓨터학원");
		b1.setPrice(50000);
		
		Book3 b2 = new Book3();
		b2.setTitle("자바 컬렉션 프레임워크");
		b2.setAuthor("엘컴퓨터학원");
		b2.setPrice(40000);
		
		Store<Book3> bookStore = new Store<>();		// <> 다이아몬드 연산자
		bookStore.add(b1);
		bookStore.add(b2);
		
		bookStore.printProducts();
		
		Car2 c1 = new Car2();
		c1.setModelName("소나타");
		c1.setDoor(4);
		
		Car2 c2 = new Car2();
		c2.setModelName("아반떼");
		c2.setDoor(2);
		
		/* (1)
		Store<Car2> carStore = new Store<>();	// error
		
		Rank<Book3, Car2> rank = new Rank<>();
		rank.setProducts(bookStore.getProducts(), carStore.getProducts());
		*/
	}

}

abstract class Product {
	String modelNo;
}

interface OrderItem {
	public abstract void setPrice(int price);
	public abstract int getPrice();
}

//class Store<T extends OrderItem & Product> {	// error
class Store<T extends Product & OrderItem> {
	private List<T> products;
	
	public Store() {
		products = new ArrayList<>();
	}
	
	public void add(T product) {
		products.add(product);
	}
	
	public List<T> getProducts() {
		return products;
	}
	
	public void printProducts() {
		System.out.println("- 상품목록 -");
		for (T product : products) {
			System.out.println(product);
		}
		System.out.println();
	}
}

class Book3 extends Product implements OrderItem {
	private String title;
	private String author;
	private int price;
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	@Override
	public String toString() {
		return "Book3 [title=" + title + ", author=" + author + ", price=" + price + "]";
	}
	
	@Override
	public void setPrice(int price) {
		this.price = price;
	}
	@Override
	public int getPrice() {
		return price;
	}
}

class Car2 extends Product {
	private String modelName;
	private int door;
	
	public String getModelName() {
		return modelName;
	}
	public void setModelName(String modelName) {
		this.modelName = modelName;
	}
	public int getDoor() {
		return door;
	}
	public void setDoor(int door) {
		this.door = door;
	}
	@Override
	public String toString() {
		return "Car2 [modelName=" + modelName + ", door=" + door + "]";
	}
}

class Rank<T, U> {
	List<T> fList;
	List<U> sList;
	
	public void setProducts(List<T> fList, List<U> sList) {
		this.fList = fList;
		this.sList = sList;
		
		System.out.println("- 1st -");
		for (T first : fList) {
			System.out.println(first);
		}
		System.out.println("- 2nd -");
		for (U second : sList) {
			System.out.println(second);
		}
	}
}

/*
문제 1.
(1) 의 오류를 수정하세요.

문제 2.
Rank 클래스의 fList와 sList를 출력하는 메소드를 작성하세요.
*/

