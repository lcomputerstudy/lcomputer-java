/*
 * Copyright 2022. 이신만 <rngooqw@gmail.com> All rights reserved.
 */
package com.lcomputerstudy.books.java.ch18;

import java.util.Iterator;
import java.util.Queue;
import java.util.Scanner;
import java.util.concurrent.ConcurrentLinkedQueue;

public class Ex05ConcurrentLinkedQueue {

	public static void main(String[] args) {
		Thread printService = new Thread(new PrintService());
		printService.start();
		
		Scanner s = new Scanner(System.in);
		while (true) {
			System.out.print("프린트할 내용을 입력하세요: ");
			Printer.print(new Paper(s.nextLine()));
		}
	}
}

class Printer {	
	public static void print(Paper p) {
		PrintService.q.offer(p);
	}	
}

class PrintService implements Runnable {
	//public static Queue<Paper> q = new LinkedList<>();	// 쓰레드로 인한 오류 발생
	public static Queue<Paper> q = new ConcurrentLinkedQueue<>();
	
	@Override
	public void run() {
		while (true) {
			System.out.println("\n프린트 대기 중입니다...");
			try {
				for (Iterator<Paper> it = q.iterator(); it.hasNext(); ) {
					Paper p = it.next();
					
					System.out.println("\n프린트 중입니다...\n---");
					Thread.sleep(3000);
					System.out.println(p.getContents());
					q.remove();
					System.out.println("프린트가 완료되었습니다!!!");
				}
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

class Paper {
	private String contents;
	public Paper(String contents) {
		this.contents = contents;
	}
	public String getContents() {
		return contents;
	}
}
