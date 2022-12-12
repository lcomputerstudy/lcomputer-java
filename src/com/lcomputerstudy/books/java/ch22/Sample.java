package com.lcomputerstudy.books.java.ch22;

import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Sample {

	public static void main(String[] args) throws Exception {
		String filename = "test222.txt";
		String packageDir = "src/com/lcomputerstudy/books/java/ch22";
		Path txtPath = Paths.get(System.getProperty("user.dir")).resolve(packageDir).resolve(filename);
		System.out.println(txtPath.toString());
		RandomAccessFile randomFile = new RandomAccessFile(txtPath.toString(), "rw");
	    FileChannel fileChannel = randomFile.getChannel();

	    ByteBuffer buf = ByteBuffer.allocate(48);

	    int data = fileChannel.read(buf);
	    while (data != -1) {

	      System.out.println("Read " + data);
	      buf.flip();

	      while(buf.hasRemaining()){
	          System.out.print((char) buf.get());
	      }

	      buf.clear();
	      data = fileChannel.read(buf);
	    }
	    randomFile.close();
	}

}
