/*
 * Copyright 2022. 이신만 <rngooqw@gmail.com> All rights reserved.
 */
package com.lcomputerstudy.books.java.ch21;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;

public class Ex01ByteStreams {

	public static void main(String[] args) {
		FileInputStream oldIn = null;
		FileOutputStream oldOut = null;
		try {
			oldIn = new FileInputStream("./src/com/lcomputerstudy/books/java/ch21/test.txt");
			oldOut = new FileOutputStream("./src/com/lcomputerstudy/books/java/ch21/out1-fileoutputstream1.txt");
			
			int c;
			while ((c = oldIn.read()) != -1) {
				oldOut.write(c);
			}
			System.out.println("< FileInputStream / FileOutputStream >");
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (oldIn != null) oldIn.close();
				if (oldOut != null) oldOut.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		System.out.println();
		
		try (
			FileInputStream in = new FileInputStream("src/com/lcomputerstudy/books/java/ch21/test.txt");
			FileOutputStream out = new FileOutputStream("src/com/lcomputerstudy/books/java/ch21/out1-fileoutputstream2.txt");
		) {
			int c;
			while ((c = in.read()) != -1) {
				out.write(c);
			}
			System.out.println("< FileInputStream / FileOutputStream > (try-with-resources)");
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println();
		
		try (
			BufferedInputStream in = new BufferedInputStream(new FileInputStream("src/com/lcomputerstudy/books/java/ch21/test.txt"));
			BufferedOutputStream out = new BufferedOutputStream(new FileOutputStream("src/com/lcomputerstudy/books/java/ch21/out1-bufferedoutputstream.txt"));
		) {
			int c;
			while ((c = in.read()) != -1) {
				out.write(c);
			}
			System.out.println("< File I/O Stream -> Buffered I/O Stream >");
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println();
		
		try (
			BufferedInputStream in = new BufferedInputStream(new FileInputStream("src/com/lcomputerstudy/books/java/ch21/test.txt"));
			PrintStream out = new PrintStream(new FileOutputStream("src/com/lcomputerstudy/books/java/ch21/out1-printstream.txt"));
		) {
			int c;
			while ((c = in.read()) != -1) {
				out.println((char)c);
			}
			System.out.println("< FileOutputStream -> PrintStream >");
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}

/*
문제 1.
임의의 내용이 입력된 hello.txt파일을 생성하세요.
hello.txt파일의 내용을 복사하는 코드를 작성하세요.
*/
