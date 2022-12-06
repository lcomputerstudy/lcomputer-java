/*
 * Copyright 2022. 이신만 <rngooqw@gmail.com> All rights reserved.
 */
package com.lcomputerstudy.books.java.ch22;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Ex01Files {

	public static void main(String[] args) {
		//Path p3 = Paths.get(URI.create("file:///Users/rngooqw/Documents/workspace/lcomputer-java/src/com/lcomputerstudy/books/java/ch22/test22.txt"));
		//Path p3 = Paths.get(URI.create("File:/./src/com/lcomputerstudy/books/java/ch22/test22.txt"));
		//System.out.println(p3.toString());
		//Path p4 = Paths.get(System.getProperty("user.home"), "test", "test22.txt");
		//System.out.println(p4.toString());
		
		// 절대경로
		//System.getProperties().forEach((k,v)->System.out.println(k+"="+v));
		String projectDir = System.getProperty("user.dir");
		System.out.println(projectDir);
		Path p1 = Paths.get(projectDir + "/" + "test999");
		System.out.println(p1.getFileName());
		System.out.println(p1.getName(0));
		System.out.println(p1.getName(1));
		System.out.println(p1.getNameCount());
		System.out.println(p1.getName(p1.getNameCount()-1));
		System.out.println(p1.subpath(2, 6));
		System.out.println(p1.getParent());
		System.out.println(p1.getRoot());
		System.out.println(p1.toUri());		// 브라우저에서 사용 가능한 경로
		System.out.println(p1.toAbsolutePath());
		
		// 상대경로
		Path p2 = Paths.get("./src/com/");
		System.out.println(p2.toString());
		System.out.println(p2.toAbsolutePath());
		try {
			System.out.println(p2.toRealPath());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		Path p3 = Paths.get("./src/error/");
		try {
			System.out.println(p3.toRealPath());		// 실제 존재하는지 확인 (체크드 익셉션)
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		Path p4 = p2.resolve(Paths.get("lcomputerstudy"));
		System.out.println(p4.toAbsolutePath());
		System.out.println(Paths.get("lcomputerstudy").toAbsolutePath());
		
		Path p5 = Paths.get("a");
		Path p6 = Paths.get("b");
		System.out.println(p5.relativize(p6).toAbsolutePath());
		
		Path p7 = Paths.get("b");
		Path p8 = Paths.get("a/b/c");
		System.out.println(p7.relativize(p8).toAbsolutePath());
		
		// file
		// 	move
		//	Glob
		
		// 파일 접근성 확인
		System.out.println(Files.exists(p8));
		System.out.println(Files.exists(p2));
		System.out.println(Files.isReadable(p2));
		System.out.println(Files.isWritable(p2));
		System.out.println(Files.isExecutable(p2));
		System.out.println(Files.isExecutable(p8));
		
		String filename = "test777.txt";
		String packageDir = "src/com/lcomputerstudy/books/java/ch22";
		Path p9 = Paths.get(System.getProperty("user.dir")).resolve(packageDir).resolve(filename);
		System.out.println(p9);
		
		try {
			System.out.println(Files.size(p9));
		} catch (IOException e1) {
			e1.printStackTrace();
		}
		System.out.println(Files.isDirectory(p9));
		
		try (BufferedReader in = Files.newBufferedReader(p9, Charset.forName("UTF-8"))) {
		    String line = null;
		    int num = 0;
		    while ((line = in.readLine()) != null) {
		        System.out.println(++num + ": " + line);
		    }
		} catch (IOException e) {
		    e.printStackTrace();
		}
		
		String str = "Asfsadf 한글도 됩니다. asdfadsf";
		Path p10 = Paths.get(System.getProperty("user.dir")).resolve(packageDir).resolve("test222.txt");
		try (BufferedWriter out = Files.newBufferedWriter(p10, Charset.forName("UTF-8"))) {
		    out.write(str, 0, str.length());
		} catch (IOException e) {
		    e.printStackTrace();
		}
		
		Path p11 = Paths.get(System.getProperty("user.dir")).resolve(packageDir).resolve("test333.txt");
		try {
			Files.createFile(p11);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
	}

}
