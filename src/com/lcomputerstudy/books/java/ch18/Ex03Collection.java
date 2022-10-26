/*
 * Copyright 2022. 이신만 <rngooqw@gmail.com> All rights reserved.
 */
package com.lcomputerstudy.books.java.ch18;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class Ex03Collection {

	public static void main(String[] args) {
		List<Integer> arrayList = new ArrayList<>();
		List<Integer> linkedList = new LinkedList<>();
		Set<Integer> hashSet = new HashSet<>();
		Set<Integer> linkedHashSet = new LinkedHashSet<>();
		Set<Integer> treeSet = new TreeSet<>();
		Map<Integer, Integer> hashMap = new HashMap<>();
		Map<Integer, Integer> linkedHashMap = new LinkedHashMap<>();
		
		System.out.println("- 순차적 요소 추가 -");
		Box.addBooksLast(arrayList);
		Box.addBooksLast(linkedList);
		Box.addBooksLast(hashSet);
		Box.addBooksLast(linkedHashSet);
		Box.addBooksLast(treeSet);
		Box.addBooksLast(hashMap);
		Box.addBooksLast(linkedHashMap);
		System.out.println();
		
		System.out.println("- index 0에 요소 추가 -");
		Box.addBooksStart(arrayList);
		Box.addBooksStart(linkedList);
		System.out.println();
		
		System.out.println("- 수정 -");
		Box.updateBooks(arrayList);
		//Box.updateBooks(linkedList);		// 매우느림
		System.out.printf("%-15s:%8s%n", "LinkedList", "매우느림");
		Box.updateBooks(hashSet);
		Box.updateBooks(linkedHashSet);
		Box.updateBooks(treeSet);
		Box.updateBooks(hashMap);
		Box.updateBooks(linkedHashMap);
		System.out.println();
		
		System.out.println("- 검색 iterator -");
		Box.getBooksIterator(arrayList);
		Box.getBooksIterator(linkedList);
		Box.getBooksIterator(hashSet);
		Box.getBooksIterator(linkedHashSet);
		Box.getBooksIterator(treeSet);
		Box.getBooksIterator(hashMap);
		Box.getBooksIterator(linkedHashMap);
		System.out.println();
		
		System.out.println("- 검색 foreach -");
		Box.getBooksForEach(arrayList);
		Box.getBooksForEach(linkedList);
		Box.getBooksForEach(hashSet);
		Box.getBooksForEach(linkedHashSet);
		Box.getBooksForEach(treeSet);
		Box.getBooksForEach(hashMap);
		Box.getBooksForEach(linkedHashMap);
		System.out.println();
		
		System.out.println("- 뒤에서부터 삭제 -");
		Box.removeBooksLast(arrayList);
		Box.removeBooksLast(linkedList);
		System.out.println();
		
		// 삭제를 위해 데이터 다시 입력
		Box.init(arrayList);
		Box.init(linkedList);
		
		System.out.println("- 앞에서부터 삭제 -");
		Box.removeBooksStart(arrayList);
		Box.removeBooksStart(linkedList);
		System.out.println();
		
		// 삭제를 위해 데이터 다시 입력
		Box.init(arrayList);
		Box.init(linkedList);
		
		System.out.println("- 뒤에서부터 삭제 ListIterator -");
		Box.removeBooksIteratorLast(arrayList);
		Box.removeBooksIteratorLast(linkedList);
		System.out.println();
		
		// 삭제를 위해 데이터 다시 입력
		Box.init(arrayList);
		Box.init(linkedList);
		
		System.out.println("- 앞에서부터 삭제 Iterator -");
		Box.removeBooksIterator(arrayList);
		Box.removeBooksIterator(linkedList);
		Box.removeBooksIterator(hashSet);
		Box.removeBooksIterator(linkedHashSet);
		Box.removeBooksIterator(treeSet);
		Box.removeBooksIterator(hashMap);
		Box.removeBooksIterator(linkedHashMap);
		System.out.println();
	}

}

class Box {
	private final static int num = 500000;	// 실행 속도가 느릴 경우 숫자를 줄이세요.
	
	public static void init(Collection<Integer> books) {
		for (int i=0; i<num; i++)
			books.add(Integer.valueOf(i));
	}
	
	// 순차적 요소 추가
	public static long addBooksLast(Collection<Integer> books) {
		long startTime = System.currentTimeMillis();
		for (int i=0; i<num; i++) {
			books.add(Integer.valueOf(i));
		}
		long endTime = System.currentTimeMillis();
		long time = endTime - startTime;
		printTime(books, time);
		return time;
	}
	
	public static long addBooksLast(Map<Integer, Integer> books) {
		long startTime = System.currentTimeMillis();
		for (int i=0; i<num; i++) {
			books.put(Integer.valueOf(i), Integer.valueOf(i));
		}
		long endTime = System.currentTimeMillis();
		long time = endTime - startTime;
		printTime(books, time);
		return time;
	}
	
	// index 0에 요소 추가
	public static long addBooksStart(List<Integer> books) {
		long startTime = System.currentTimeMillis();
		for (int i=0; i<num/5; i++) {
			books.add(0, Integer.valueOf(i));
		}
		long endTime = System.currentTimeMillis();
		long time = endTime - startTime;
		printTime(books, time);
		return time;
	}
	
	// 수정
	public static long updateBooks(List<Integer> books) {
		long startTime = System.currentTimeMillis();
		for (int i=0; i<books.size(); i++) {
			books.set(i, Integer.valueOf(i));
		}
		long endTime = System.currentTimeMillis();
		long time = endTime - startTime;
		printTime(books, time);
		return time;
	}
	
	public static long updateBooks(Set<Integer> books) {
		long startTime = System.currentTimeMillis();
		for (Iterator<Integer> it = books.iterator(); it.hasNext(); ) {
			books.add(it.next());
			
		}
		long endTime = System.currentTimeMillis();
		long time = endTime - startTime;
		printTime(books, time);
		return time;
	}
	
	public static long updateBooks(Map<Integer, Integer> books) {
		long startTime = System.currentTimeMillis();
		for (int i=0; i<books.size(); i++) {
			books.put(Integer.valueOf(i), Integer.valueOf(i));
		}
		long endTime = System.currentTimeMillis();
		long time = endTime - startTime;
		printTime(books, time);
		return time;
	}
	
	// 검색 Iterator
	public static long getBooksIterator(Collection<Integer> books) {
		long startTime = System.currentTimeMillis();
		for (Iterator<Integer> it = books.iterator(); it.hasNext(); ) {
			it.next();
		}
		long endTime = System.currentTimeMillis();
		long time = endTime - startTime;
		printTime(books, time);
		return time;
	}
	public static long getBooksIterator(Map<Integer, Integer> books) {
		long startTime = System.currentTimeMillis();
		for (Iterator<Map.Entry<Integer, Integer>> it = books.entrySet().iterator(); it.hasNext(); ) {
			Map.Entry<Integer, Integer> entry = it.next();
			entry.getKey();
			entry.getValue();
		}
		long endTime = System.currentTimeMillis();
		long time = endTime - startTime;
		printTime(books, time);
		return time;
	}
	// 검색 foreach
	public static long getBooksForEach(Collection<Integer> books) {
		long startTime = System.currentTimeMillis();
		for (Integer book : books) {
			
		}
		long endTime = System.currentTimeMillis();
		long time = endTime - startTime;
		printTime(books, time);
		return time;
	}
	public static long getBooksForEach(Map<Integer, Integer> books) {
		long startTime = System.currentTimeMillis();
		for (Map.Entry<Integer, Integer> entry : books.entrySet()) {
			entry.getKey();
			entry.getValue();
		}
		long endTime = System.currentTimeMillis();
		long time = endTime - startTime;
		printTime(books, time);
		return time;
	}
	
	// 끝에서 부터 삭제
	public static long removeBooksLast(List<Integer> books) {
		long startTime = System.currentTimeMillis();
		for (int i=books.size()-1; i>=0; i--) {
			books.remove(i);
		}
		long endTime = System.currentTimeMillis();
		long time = endTime - startTime;
		printTime(books, time);
		return time;
	}
	
	// 처음 부터 삭제
	public static long removeBooksStart(List<Integer> books) {
		long startTime = System.currentTimeMillis();
		for (int i=0; i<books.size(); i++) {
			books.remove(0);
		}
		long endTime = System.currentTimeMillis();
		long time = endTime - startTime;
		printTime(books, time);
		return time;
	}
	
	// 뒤에서부터 삭제 Iterator
	public static long removeBooksIteratorLast(List<Integer> books) {
		long startTime = System.currentTimeMillis();
		for (ListIterator<Integer> it = books.listIterator(books.size()); it.hasPrevious(); ) {
			it.previous();
			it.remove();
		}
		long endTime = System.currentTimeMillis();
		long time = endTime - startTime;
		printTime(books, time);
		return time;
	}
	
	// 삭제 Iterator
	public static long removeBooksIterator(Collection<Integer> books) {
		long startTime = System.currentTimeMillis();
		for (Iterator<Integer> it = books.iterator(); it.hasNext(); ) {
			it.next();
			it.remove();
		}
		long endTime = System.currentTimeMillis();
		long time = endTime - startTime;
		printTime(books, time);
		return time;
	}
	public static long removeBooksIterator(Map<Integer, Integer> books) {
		long startTime = System.currentTimeMillis();
		for (Iterator<Map.Entry<Integer, Integer>> it = books.entrySet().iterator(); it.hasNext(); ) {
			it.next();
			it.remove();
		}
		long endTime = System.currentTimeMillis();
		long time = endTime - startTime;
		printTime(books, time);
		return time;
	}
	
	
	public static void printTime(Collection<Integer> books, long time) {
		System.out.printf("%-15s:%10d%n", books.getClass().getSimpleName(), time);
	}
	
	public static void printTime(Map<Integer, Integer> books, long time) {
		System.out.printf("%-15s:%10d%n", books.getClass().getSimpleName(), time);
	}
}

/*
문제 1.
실행 결과와 구글링을 통해 각 컬렉션의 특징을 정리하세요.

문제 2.
중첩 리스트를 작성하고 임의의 값을 입력 및 출력하는 코드를 작성하세요.

문제 3.
리스트의 중복되는 값을 Set을 이용해 중복처리 후 결과를 출력하세요. 
*/