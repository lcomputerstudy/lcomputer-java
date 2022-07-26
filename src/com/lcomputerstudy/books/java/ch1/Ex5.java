package com.lcomputerstudy.books.java.ch1;

import java.util.Scanner;

// 정수와 실수
public class Ex5 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int productPrice;
		double tax;
		double price;
		
		System.out.println("티비의 가격을 입력해 주세요.");
		productPrice = scan.nextInt();
		
		System.out.println("티비의 세율을 입력해 주세요. ex)10%일 경우 0.1");
		tax = scan.nextDouble();
		
		price = productPrice + (productPrice * tax);
		
		System.out.printf("티비의 가격은 %d원 이고 부가세가 포함된 티비의 가격은 %10.1f원 입니다.", productPrice, price);
		
		scan.close();
		
	}

}