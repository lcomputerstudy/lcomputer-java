/*
 * Copyright 2022. 이신만 <rngooqw@gmail.com> All rights reserved.
 */
package com.lcomputerstudy.books.java.ch18;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;

public class Ex08Deque {


	public static void main(String[] args) {
		QueueTicketDispenser2.takeNum();
		QueueTicketDispenser2.takeNum();
		QueueTicketDispenser2.takeNum();
		QueueTicketDispenser2.takeNum();
		QueueTicketDispenser2.takeNum();
		
		System.out.println("첫 번째 손님은 " + Restaurant2.firstGuest() + "번 손님입니다.");
		System.out.println();
		
		Restaurant2.printQueue();
				
		while (Restaurant2.q.size() > 0) {
			Restaurant2.serving();
		}
		System.out.println();
		
		Restaurant2.printQueue();
		
		System.out.println("< deque는 양방향으로 추가 및 삭제가 가능하므로 스택과 큐 모두 구현이 가능합니다. >");
		QueueTicketDispenser2.takeNum();
		QueueTicketDispenser2.takeNum();
		QueueTicketDispenser2.takeNum();
		Restaurant2.printQueue();
		
		Restaurant2.q.offerFirst(100);
		Restaurant2.printQueue();
		
		Restaurant2.q.offerLast(200);
		Restaurant2.printQueue();
		
		Restaurant2.q.pollFirst();
		Restaurant2.printQueue();
		
		Restaurant2.q.pollLast();
		Restaurant2.printQueue();
	}
}

class QueueTicketDispenser2 {
	private static int num = 1;
	
	public static int takeNum() {
		Restaurant2.q.offer(num);
		return num++;
	}
}

class Restaurant2 {
	public static Deque<Integer> q = new ArrayDeque<>();
	
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
	
	public static int firstGuest() {
		return q.peek();
	}
}

/*
문제 1.
반복문을 이용해 사용자가 입력한 메세지들을 저장하세요. 
마지막으로 입력한 메세지 세개만 화면에 출력되도록 코딩하세요.
quit가 입력되면 반복문은 종료되어야 합니다.
*/