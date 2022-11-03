/*
 * Copyright 2022. 이신만 <rngooqw@gmail.com> All rights reserved.
 */
package com.lcomputerstudy.books.java.ch18;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

public class Ex07Deque {

	public static void main(String[] args) {
		Book2 book = new Book2("자바 컬렉션");
		book.addPage(new Page2(0, "표지"));
		book.addPage(new Page2(1, "목차"));
		book.addPage(new Page2(2, "ArrayList"));
		book.addPage(new Page2(3, "LinkedList"));
		book.addPage(new Page2(4, "Queue"));
		book.addPage(new Page2(5, "Stack"));
		
		book.nextPage();
		book.view();
		book.nextPage();
		book.view();
		book.nextPage();
		book.view();
		
		System.out.println();
		
		book.prevPage();
		book.view();
		book.prevPage();
		book.view();
		book.prevPage();
		book.view();
	}

}
class Book2 {
	private String title;
	private Deque<Page2> pageStack;
	private List<Page2> pageList;
	private int currentPageNo;
	
	public Book2(String title) {
		this.title = title;
		this.pageStack = new ArrayDeque<>();
		this.pageList = new LinkedList<>();
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public List<Page2> getPageList() {
		return pageList;
	}
	public void setPageList(List<Page2> pageList) {
		this.pageList = pageList;
	}
	public void addPage(Page2 page) {
		pageList.add(page);
	}
	public void nextPage() {
		pageStack.push(pageList.get(currentPageNo++));		
	}
	public void prevPage() {
		Page2 page = pageStack.pop();
		currentPageNo = page.getNo();
	}
	public void view() {
		System.out.println(pageList.get(currentPageNo));
	}
	
	public void setCurrentPageNo(int currentPageNo) {
		this.currentPageNo = currentPageNo;
	}
}

class Page2 {
	private int no;
	private String contents;
	
	public Page2(int no, String contents) {
		this.no = no;
		this.contents = contents;
	}
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public String getContents() {
		return contents;
	}
	public void setContents(String contents) {
		this.contents = contents;
	}
	@Override
	public String toString() {
		return no + "페이지 - " + contents;
	}
}

/* 
문제 1.
스마트폰의 알림기능은 마지막 알림부터 확인할 수 있습니다.
알림 등록, 확인, 확인 시 제거 기능을 구현하세요.
*/