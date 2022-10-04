package com.lcomputerstudy.books.java.ch12;

import java.util.InputMismatchException;
import java.util.Scanner;

// 다중 캐치 블록
public class Ex02MultipleCatchBlock {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int[] arr = {3, 5, 7};
		
		try {
			
			System.out.print("0~2 숫자를 입력하세요: ");
			int i = scanner.nextInt();
			
			System.out.print("0 이외의 숫자를 입력하세요: ");
			int num = scanner.nextInt();
			
			System.out.println(arr[i] / num);
			
		} catch (InputMismatchException e) {
			System.out.println("숫자만 입력 가능 합니다.");
			
		} catch (ArithmeticException e) {
			System.out.println("산술 예외가 발생되었습니다.");
			
		} catch (Exception e) {
			System.out.println("예외 발생!!!");
			e.printStackTrace();
			
		}
		
		System.out.println("프로그램이 종료됩니다.");
	}

}

/*
문제 1.
i에 0~2 이외의 숫자를 입력하여 예외를 발생 시키세요.

문제 2.
문자열을 입력하여 예외를 발생 시키세요.

문제 3.
num에 0을 입력하여 예외를 발생 시키세요.

문제 4.
예외가 발생되지 않도록 값을 입력한 뒤 실행하세요.
*/