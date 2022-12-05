package com.lcomputerstudy.books.java.ch21;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Ex03ObjectStreams {

	public static void main(String[] args) {
		try (
			DataOutputStream out = new DataOutputStream(new BufferedOutputStream(
					new FileOutputStream("src/com/lcomputerstudy/books/java/ch21/out3-dataoutputstream.txt")));
		) {
			Book book = new Book("자바 I/O", 30000, 1.2);
			out.writeUTF(book.getTitle());
			out.writeInt(book.getPrice());
			out.writeDouble(book.getTax());
		} catch (IOException e) {
			e.printStackTrace();
		}
		
        try (
            DataInputStream in = new DataInputStream(new BufferedInputStream(
            		new FileInputStream("src/com/lcomputerstudy/books/java/ch21/out3-dataoutputstream.txt")));
        ) {
        	
        	String title = in.readUTF();
        	int price = in.readInt();
        	double tax = in.readDouble();
        	//int tmp = in.readInt();
        	Book book = new Book(title, price, tax);
        	
        	System.out.println(book);
		} catch (EOFException e) {
			System.out.println("읽는 순서가 잘못되었거나 더 이상 읽을 데이터가 없습니다.");
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
        
        try (
        	ObjectOutputStream out = new ObjectOutputStream(new BufferedOutputStream(
					new FileOutputStream("src/com/lcomputerstudy/books/java/ch21/out3-objectoutputstream.txt")));
        ) {
        	Book b1 = new Book("자바 I/O", 30000, 1.2);
        	Book b2 = new Book("자바 기본문법", 50000, 1.1);
        	Cart cart = new Cart();
        	cart.add(b1);
        	cart.add(b2);
        	out.writeObject(cart);
        	out.writeObject(BigDecimal.valueOf(3.14159265359));
        } catch (IOException e) {
        	e.printStackTrace();
        }
        
        try (
        	ObjectInputStream in = new ObjectInputStream(new BufferedInputStream(
					new FileInputStream("src/com/lcomputerstudy/books/java/ch21/out3-objectoutputstream.txt")));
        ) {
        	Cart cart = (Cart)in.readObject();
        	BigDecimal bd = (BigDecimal)in.readObject();
        	System.out.println(cart.getBooks());
        	System.out.println(bd.toString());
        	System.out.println(bd.add(BigDecimal.valueOf(0.1)).toString());
        } catch (IOException e) {
        	e.printStackTrace();
        } catch (ClassNotFoundException e) {
        	e.printStackTrace();
        }
	}

}

class Book implements Serializable {
	private static final long serialVersionUID = 1L;
	private String title;
	private int price;
	private double tax;
	public Book(String title, int price, double tax) {
		this.title = title;
		this.price = price;
		this.tax = tax;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public double getTax() {
		return tax;
	}
	public void setTax(double tax) {
		this.tax = tax;
	}
	@Override
	public String toString() {
		return "Book [title=" + title + ", price=" + price + ", tax=" + tax + "]";
	}
}

class Cart implements Serializable {
	private static final long serialVersionUID = 1L;
	private List<Book> books = new ArrayList<>();
	public void add(Book book) {
		books.add(book);
	}
	public void print() {
		System.out.println(books);
	}
	public List<Book> getBooks() {
		return books;
	}
}

/*
문제 1.
두 대의 차를 주차장에 주차하는 코드를 작성하세요.
주차장 인스턴스를 파일에 쓴 뒤 다시 읽어 와 주차장의 상태를 출력하세요.
*/