package com.lcomputerstudy.books.java.ch14;

public class Ex02IndexOf {

	public static void main(String[] args) {
		String s1 = "자바 기본문법 엘컴퓨터학원 자바 알고리즘 엘컴퓨터학원 자료구조";
		String target = "엘컴퓨터학원";
		System.out.println(s1.indexOf(target));
		System.out.println(s1.lastIndexOf(target));
		
		String s2 = "[엘컴퓨터학원] 자바 기본문법!! (자료구조 포함) ";
		String filter = "[]() ";
		String result = "";
		for (int i=0; i<s2.length(); i++) {
			char ch = s2.charAt(i);
			
			if (filter.indexOf(ch) == -1) {
				result += String.valueOf(ch);
			}
		}
		System.out.println(result);
		System.out.println();
		
		s2 = "엘,컴, 퓨, 터, 학, 원,  자바 기본, 문, 법,,";
		target = ",";
		int pos = 0;
		int count = 0;
		while ( (pos = s2.indexOf(target, pos)) != -1 ) {
			pos += target.length();
			count++;
		}
		System.out.println(count);
	}

}

/*
문제 1.
"안녕하세요, 엘컴#퓨터@@학원 입니다.!~%"
위 문자열에서 ,@!~%# 문자를 제거한 뒤 출력하는 프로그램을 코딩하세요.

문제 2.
위 문자열에서 공백의 수를 카운팅하여 출력하세요.
*/