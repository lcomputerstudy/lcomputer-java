/*
 * Copyright 2022. 이신만 <rngooqw@gmail.com> All rights reserved.
 */
package com.lcomputerstudy.books.java.ch18;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Ex02Set {

	public static void main(String[] args) {
		// 사용자로 부터 입력 받은 과목들이라고 가정합니다.
		String[] arrSubjects = { "자바", "파이선", "자바", "알고리즘", "스프링", "자료구조", "자바스크립트", "데이터베이스", "스프링", "스프링", "C", "람다" };
		System.out.println(Arrays.toString(arrSubjects));
		System.out.println();
		
		Student s1 = new Student("A");
		s1.addSubject("자바");
		s1.addSubject("알고리즘");
		s1.addSubject("파이썬");
		s1.addSubject("스프링");
		Student s2 = new Student("B");
		s2.addSubject("자바");
		s2.addSubject("데이터베이스");
		s2.addSubject("스프링");
		Student s3 = new Student("C");
		s3.addSubject("자바");
		s3.addSubject("스프링");
		s3.addSubject("자바스크립트");
		
		Course course = new Course();
		course.setStudents(s1, s2, s3);
		
		System.out.println("- 모든 과목 -");
		course.setSubjects(arrSubjects);
		Set<String> subjects = course.getSubjects();
		Course.print(subjects);
		
		System.out.println("- 정렬된 과목 -");
		List<String> oSubjects = course.getOrderedSubjects();
		Course.print(oSubjects);
		
		System.out.println("- 학생들이 수강 중인 모든 과목 (합집합) -");
		Set<String> rSubjects = course.getRegisteredSubjects();
		Course.print(rSubjects);
		
		System.out.println("- 모든 학생들이 수강 중인 과목 (교집합)");
		Set<String> bSubjects = course.getBasicSubjects();
		Course.print(bSubjects);
		
		System.out.println("- 모든 학생들이 수강 중이지 않은 과목 (여집합)");
		Set<String> cSubjects = course.getCanceledSubjects();
		Course.print(cSubjects);
	}

}

class Course {
	private Set<String> subjects;
	private List<Student> students;
	
	public void setStudents(Student... arrStudent) {
		students = new ArrayList<>();
		Collections.addAll(students, arrStudent);
	}
	
	public List<Student> getStudents() {
		return students;
	}
	
	public void setSubjects(String[] arrSubjects) {
		List<String> list = new ArrayList<>();
		Collections.addAll(list, arrSubjects);
		subjects = new HashSet<>(list);
	}
	
	public Set<String> getSubjects() {
		return subjects;
	}
	
	public List<String> getOrderedSubjects() {
		List<String> oSubjects = new ArrayList<>(subjects);
		Collections.sort(oSubjects);
		return oSubjects;
	}
	
	public Set<String> getRegisteredSubjects() {
		Set<String> rSubjects = new HashSet<>();
		for (Student student : students) {
			rSubjects.addAll(student.getSubjects());
		}
		return rSubjects;
	}
	
	public Set<String> getBasicSubjects() {		
		Set<String> sbj1 = null;
		Set<String> sbj2 = null;
		
		for (int i=0; i<students.size()-1; i++) {
			sbj1 = new HashSet<>(students.get(i).getSubjects());
			sbj2 = new HashSet<>(students.get(i+1).getSubjects());
			
			sbj1.retainAll(sbj2);
		}
		
		return sbj1;
	}
	
	public Set<String> getCanceledSubjects() {
		Set<String> allSubjects = new HashSet<>(subjects);
		Set<String> rSubjects = getRegisteredSubjects();
		
		allSubjects.removeAll(rSubjects);
		
		return allSubjects;
	}
	
	public static void print(Collection<String> subjects) {
		for (String subject : subjects) {
			System.out.print(subject + ", ");
		}
		System.out.println("\n");
	}
}

class Student {
	private String name;
	private Set<String> subjects;
	
	public Student(String name) {
		this.name = name;
		subjects = new HashSet<>();
	}
	
	public String getName() {
		return name;
	}
	
	public void addSubject(String subject) {
		subjects.add(subject);
	}
	
	public Set<String> getSubjects() {
		return subjects;
	}
}

