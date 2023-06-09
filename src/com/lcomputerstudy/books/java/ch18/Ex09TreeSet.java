/*
 * Copyright 2022. 이신만 <rngooqw@gmail.com> All rights reserved.
 */
package com.lcomputerstudy.books.java.ch18;

import java.util.Iterator;
import java.util.NavigableSet;
import java.util.SortedSet;
import java.util.TreeSet;

public class Ex09TreeSet {

	public static void main(String[] args) {
		//SortedSet<Integer> set = new TreeSet<>();
		NavigableSet<Integer> tvSet = new TreeSet<>();
		tvSet.add(300);
		tvSet.add(700);
		tvSet.add(100);
		tvSet.add(200);
		tvSet.add(200);
		tvSet.add(900);
		tvSet.add(870);
		
		System.out.println("< TV 최저가순 >");
		for (Iterator<Integer> it = tvSet.iterator(); it.hasNext(); )
			System.out.println(it.next() + "원");
		
		System.out.println("< TV 최고가순 >");
		for (Iterator<Integer> it = tvSet.descendingIterator(); it.hasNext(); )
			System.out.println(it.next() + "원");
		
		System.out.println("< TV 최고가순 >");
		NavigableSet<Integer> reverseSet = tvSet.descendingSet();
		for (Iterator<Integer> it = reverseSet.iterator(); it.hasNext(); )
			System.out.println(it.next() + "원");
		
		int money = 300;
		
		System.out.println("< 구매 가능 TV 가격 >");
		SortedSet<Integer> availableSet = tvSet.headSet(money);
		System.out.println(availableSet);
		
		System.out.println("< 구매 가능 TV 가격 >");
		NavigableSet<Integer> availableSet2 = tvSet.headSet(money, true);
		System.out.println(availableSet2);
		
		System.out.println("< 구매 불가능 TV 가격 >");
		NavigableSet<Integer> notAvailableSet = tvSet.tailSet(money, false);
		System.out.println(notAvailableSet);

		System.out.println("< 200원 이상 900원 미만인 TV 검색 >");
		NavigableSet<Integer> searchSet = tvSet.subSet(200, true, 900, false);
		System.out.println(searchSet);
		
		System.out.println("< 750원이거나 조금 더 비싼 TV를 검색 >");
		System.out.println(tvSet.ceiling(750));
		System.out.println("< 300원이거나 조금 더 비싼 TV를 검색 >");
		System.out.println(tvSet.ceiling(300));
		System.out.println();
		
		System.out.println("< 750원이거나 조금 더 싼 TV를 검색 >");
		System.out.println(tvSet.floor(750));
		System.out.println("< 300원이거나 조금 더 싼 TV를 검색 >");
		System.out.println(tvSet.floor(300));
		System.out.println();
		
		System.out.println("< 750원 보다 조금 더 비싼 TV를 검색 >");
		System.out.println(tvSet.higher(750));
		System.out.println("< 750원 보다 조금 더 싼 TV를 검색 >");
		System.out.println(tvSet.lower(750));
		System.out.println();
		
		System.out.println("< 제일 비싼 TV와 싼 TV 판매 >");
		System.out.println(tvSet.pollFirst());	
		System.out.println(tvSet.pollLast());
		
		System.out.println("< 870원 TV 판매>");
		System.out.println(tvSet.remove(870));
		System.out.println("< 550원 TV 재고 없음>");
		System.out.println(tvSet.remove(550));
		
		System.out.println("< 판매중인 TV >");
		for (Iterator<Integer> it = tvSet.iterator(); it.hasNext(); )
			System.out.println(it.next() + "원");
		
	}

}

/*
문제 1.
60점 이상인 학생들의 점수를 출력하세요. 60점을 포함합니다.

문제 2.
학생들의 시험 점수 중 가장 높은 학생의 점수를 출력하세요.

문제 3.
80점 보다 가장 근접하게 높은 점수를 출력하세요.

문제 4.
75점을 찾아 출력하세요. 없다면 75점 보다 가장 근접하게 낮은 점수를 출력하세요.
*/
