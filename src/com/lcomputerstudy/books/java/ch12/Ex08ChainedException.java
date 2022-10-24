/*
 * Copyright 2022. 이신만 <rngooqw@gmail.com> All rights reserved.
 */
package com.lcomputerstudy.books.java.ch12;

import java.util.Scanner;

public class Ex08ChainedException {

	public static void main(String[] args) {
		while (true) {
			User4 user = null;
			
			user = LoginService4.form();
			
			try {
				LoginService4.login(user);
				
			} catch (LoginException e) {
				System.out.println("문의사항은 000-1234-5678 로 연락주세요.\n");
				e.printStackTrace();
			}
			
			if (user.isLogin()) {
				LoginService4.success(user);
				break;
			}
			
			System.out.println("로그인에 실패하였습니다.\n");
		}
		
		System.out.println("1. 회원정보");
		System.out.println("2. 커뮤니티");
		System.out.println("3. 쇼핑");
		System.out.println("4. 로그아웃");
	}
	
}

class LoginService4 {
	private static final String DB_ID = "admin";
	private static final String DB_PW = "1234";
	private static int count = 0;
	
	public static void login(User4 user) throws LoginException {
		try {
			if (!DB_ID.equals(user.getId())) {
				throw new IDMismatchException4("잘못된 아이디를 입력하였습니다.");
				
			} else if (!DB_PW.equals(user.getPassword())) {
				throw new PasswordMismatchException4("잘못된 패스워드를 입력하였습니다.");
				
			} else {
				user.setLogin(true);
			}
		} catch (IDMismatchException4 e) {
			System.out.println("아이디 찾기를 원하시면 클릭해 주세요.");
			throw new LoginException("로그인 예외가 발생하였습니다.", e);
			
		} catch (PasswordMismatchException4 e) {
			System.out.println("비밀번호 찾기를 원하시면 클릭해 주세요.");
			throw new LoginException("로그인 예외가 발생하였습니다.", e);
			
		} finally {
			increaseCount();
		}
	}
	
	public static User4 form() {
		Scanner scanner = new Scanner(System.in);
		User4 user = new User4();
		
		System.out.println("- 로그인 화면 -");
		System.out.print("아이디를 입력하세요: ");
		user.setId(scanner.nextLine());
		System.out.print("패스워드를 입력하세요: ");
		user.setPassword(scanner.nextLine());
		
		return user;
	}
	
	public static void success(User4 user) {
		System.out.println(user.getId() + " 님 환영합니다.\n");
	}
	
	public static void increaseCount() {
		count++;
		System.out.println("로그인 시도 " + count + "회");
	}
}

class User4 {
	private String id;
	private String password;
	private boolean login;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public boolean isLogin() {
		return login;
	}
	public void setLogin(boolean login) {
		this.login = login;
	}
	
}

class LoginException extends Exception {
	public LoginException(String message, Exception e) {
		super(message, e);
	}
}

class IDMismatchException4 extends Exception {
	public IDMismatchException4(String message) {
		super(message);
	}
}

class PasswordMismatchException4 extends Exception {
	public PasswordMismatchException4(String message) {
		super(message);
	}
}

/*
문제 1.
자판기 프로그램에 연결 예외를 적용해 주세요.
*/