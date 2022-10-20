package com.lcomputerstudy.books.java.ch18;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

public class Ex02Set {

	public static void main(String[] args) {
		String[] subject = {"자바", "파이선", "알고리즘", "자료구조", "자바스크립트", "데이터베이스", "스프링"};
		
		Student s1 = new Student("A", new ArrayList<>());
		s1.addBook(subject[0]);
		s1.addBook(subject[1]);
		Student s2 = new Student("B", new HashSet<>());
		s2.addBook(subject[0]);
		s2.addBook(subject[2]);
		Student s3 = new Student("C", new HashSet<>());
		s2.addBook(subject[0]);
		s3.addBook(subject[3]);
		s3.addBook(subject[4]);
		
		// 학생들이 대출중인 책 모두 출력
		Collection<String> books = new HashSet<>();
		books.addAll(s1.getBooks());
		books.addAll(s2.getBooks());
		books.addAll(s3.getBooks());
		System.out.println(books);
		
		// 아무도 수강중이지 않은 과목
		Collection<String> duplList = new ArrayList<>();
		Collections.addAll(duplList, subject);
		Collection<String> duplSet = new HashSet<>(duplList);
		duplSet.removeAll(books);
		System.out.println(duplSet);
		
		// 모든 학생이 수강중인 과목들 retainAll
		
	}

}

class Student {
	private String name;
	private Collection<String> books;
	
	public Student(String name, Collection<String> books) {
		this.name = name;
		this.books = books;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Collection<String> getBooks() {
		return books;
	}
	public void setBooks(Collection<String> books) {
		this.books = books;
	}
	public void addBook(String book) {
		books.add(book);
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", books=" + books + "]";
	}
}

