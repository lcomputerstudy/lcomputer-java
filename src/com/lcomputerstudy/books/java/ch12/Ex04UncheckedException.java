/*
 * Copyright 2022. 이신만 <rngooqw@gmail.com> All rights reserved.
 */
package com.lcomputerstudy.books.java.ch12;

import java.io.File;

public class Ex04UncheckedException {

	public static void main(String[] args) {
		
		File f = new File("./src/com/lcomputerstudy/books/java/ch12/hello.txt");
		
		//f.createNewFile();	// Checked Exception (복구 가능)
		
		int[] arr = {3, 7, 5};
		System.out.println(arr[5]);		// Unchecked Exception (rollback)

	}

}

/*
문제 1.
f.createNewFile 의 주석을 제거합니다.
발생된 예외를 try catch 를 이용하여 처리하세요.
*/