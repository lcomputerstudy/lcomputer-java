package com.lcomputerstudy.books.java.ch12;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Ex09TryWithResources {

	public static void main(String[] args) {
		try1();
		
		System.out.println("\n\n----------\n");
		
		try2();
		
	}
	
	public static void try1() {
		try (
			FileReader fr = new FileReader("./src/com/lcomputerstudy/books/java/ch12/Ex01TryCatch.java");
			BufferedReader br = new BufferedReader(fr);
		) {
			int data;
			while ((data = fr.read()) != -1) {
				char ch = (char)data;
				System.out.print(ch);
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static void try2() {
		FileReader fr = null;
		BufferedReader br = null;
		
		try {
			fr = new FileReader("./src/com/lcomputerstudy/books/java/ch12/Ex01TryCatch.java");
			br = new BufferedReader(fr);
			
			int data;
			while ((data = fr.read()) != -1) {
				char ch = (char)data;
				System.out.print(ch);
			}
			
		} catch (IOException e) {
			e.printStackTrace();
			
		} finally {
			try {
				br.close();
				fr.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

}

/*
문제 1.
Scanner 의 nextLine 메소드를 이용하여 입력받은 문자열을 출력하는 코드를 작성하세요.
스캐너는 사용후 scanner.close() 와 같이 자원을 반납하여야 합니다.
반납하지 않으면 경고가 뜨게 됩니다.
try with resources 문법으로 스캐너의 자원을 자동 반납하도록 코딩하세요. 
*/