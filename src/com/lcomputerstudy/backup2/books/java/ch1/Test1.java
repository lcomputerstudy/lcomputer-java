package com.lcomputerstudy.backup2.books.java.ch1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List list = new ArrayList();
		list.add(new Student());
		list.add(new Student());
		list.add(new Student());
		list.add(new Student());
		list.add(new Student());
		list.add(new Student());
		Collections.sort(list, new AscTest());

	}

}

class AscTest implements Comparator {

	@Override
	public int compare(Object o1, Object o2) {
		System.out.println("compare");
		Student s1 = (Student)o1;
		Student s2 = (Student)o2;
		s1.compareTo(s2);
		return 0;
	}
	
}

class Student implements Comparable {

	@Override
	public int compareTo(Object arg0) {
		System.out.println("Comparable");
		return 0;
	}
	
}
