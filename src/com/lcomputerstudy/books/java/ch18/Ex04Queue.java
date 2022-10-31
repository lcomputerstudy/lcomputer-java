/*
 * Copyright 2022. 이신만 <rngooqw@gmail.com> All rights reserved.
 */
package com.lcomputerstudy.books.java.ch18;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class Ex04Queue {

	public static void main(String[] args) {
		QueueTicketDispenser.getTakeNum();
		QueueTicketDispenser.getTakeNum();
		QueueTicketDispenser.getTakeNum();
		QueueTicketDispenser.getTakeNum();
		QueueTicketDispenser.getTakeNum();
		
		Restaurant.printQueue();
		
		while (Restaurant.q.size() > 0) {
			Restaurant.serving();
		}
		System.out.println();
		
		Restaurant.printQueue();
	}
}

class QueueTicketDispenser {
	private static int num = 1;
	
	public static int getTakeNum() {
		Restaurant.q.offer(num);
		return num++;
	}
}

class Restaurant {
	public static Queue<Integer> q = new LinkedList<>();
	
	public static void serving() {
		int num = q.poll();
		System.out.println(num + "번 손님에게 서빙되었습니다.");
	}
	
	public static void printQueue() {
		System.out.println("대기열\n-----");
		for (Iterator<Integer> it = q.iterator(); it.hasNext(); ) {
			int num = it.next();
			
			System.out.println(num + "번 손님");
		}
		System.out.println();
	}
}

/*
문제 1.
공지사항 등록, 목록, 삭제 기능을 코딩하세요.
삭제 시 제일 오래된 공지사항을 삭제하세요.
공지사항의 등록, 목록, 삭제 상수는 enum을 사용하세요.
*/