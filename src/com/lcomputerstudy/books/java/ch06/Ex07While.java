/*
 * Copyright 2022. 이신만 <rngooqw@gmail.com> All rights reserved.
 */
package com.lcomputerstudy.books.java.ch06;

import java.util.Scanner;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class Ex07While {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		boolean isConnected = true;
		int channel = 0;
		int code = 0;
		
		while (isConnected) {
			System.out.println("명령어를 입력해 주세요.\n(HELP -> 1:전원켬, 2:채널+1, 3:채널-1, -1:종료):");
			code = scanner.nextInt();
			
			if (code == -1) {
				System.out.println("프로그램을 종료합니다.");
				isConnected = false;
			} else if (code == 1) {
				System.out.println("티비를 켭니다.");
			} else if (code == 2) {
				channel++;
				System.out.println("채널을 1증가 시킵니다. 현재 채널은 " + channel + "입니다.");
			} else if (code == 3) {
				channel--;
				System.out.println("채널을 1감소 시킵니다. 현재 채널은 " + channel + "입니다.");
			} else {
				System.out.printf("잘못된 명령어를 입력하였습니다.%n", code);
			}
			
		}
	}

}

/*
문제 1.
while문을 사용해 자판기를 만드세요.
1: 콜라 (500원), 2: 사이다(300원), 3: 환타(200원)
잔액은 1000원으로 설정하고 잔액이 부족하면 음료수를 살 수 없어야 합니다.  
*/