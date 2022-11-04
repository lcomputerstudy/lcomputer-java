package com.lcomputerstudy.books.java.ch18;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class Ex11Map {

	public static void main(String[] args) {
		Map<String, List<Employee>> company = new HashMap<>();
		List<Employee> empList = null;
		Employee empoyee = null;
		List<Skill> skills = null;
		
		empList = new ArrayList<>();
		
		empoyee = new Employee("A");
		skills = new ArrayList<>();
		skills.add(new Skill("자바", 3));
		skills.add(new Skill("DB", 2));
		empoyee.setSkills(skills);
		empList.add(empoyee);
		
		empoyee = new Employee("B");
		skills = new ArrayList<>();
		skills.add(new Skill("파이썬", 2));
		skills.add(new Skill("DB", 3));
		empoyee.setSkills(skills);
		empList.add(empoyee);
		
		empoyee = new Employee("C");
		skills = new ArrayList<>();
		skills.add(new Skill("JS", 2));
		skills.add(new Skill("AWS", 1));
		empoyee.setSkills(skills);
		empList.add(empoyee);
		
		company.put("A", empList);
		
		empList = new ArrayList<>();
		
		empoyee = new Employee("D");
		skills = new ArrayList<>();
		skills.add(new Skill("자바", 2));
		skills.add(new Skill("Linux", 3));
		empoyee.setSkills(skills);
		empList.add(empoyee);
		
		empoyee = new Employee("E");
		skills = new ArrayList<>();
		skills.add(new Skill("Vue", 3));
		empoyee.setSkills(skills);
		empList.add(empoyee);
		
		empoyee = new Employee("F");
		skills = new ArrayList<>();
		skills.add(new Skill("안드로이드", 2));
		skills.add(new Skill("IOS", 3));
		skills.add(new Skill("React", 1));
		empoyee.setSkills(skills);
		empList.add(empoyee);
		
		company.put("B", empList);
		
		
		for (Entry<String, List<Employee>> entry : company.entrySet()) {
			for (Employee emp : entry.getValue()) {
				System.out.println(emp.getName());
				for (Skill s : emp.getSkills()) {
					System.out.println(s.getName() + ", " + s.getLevel());
				}
				System.out.println("---");
			}
			
		}
		
		
		
	}

}

class EmployeeService {
	
}

class Employee {
	private String name;
	private List<Skill> skills;
	public Employee(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<Skill> getSkills() {
		return skills;
	}
	public void setSkills(List<Skill> skills) {
		this.skills = skills;
	}
}

class Skill {
	private String name;
	private int level;
	public Skill(String name, int level) {
		this.name = name;
		this.level = level;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getLevel() {
		return level;
	}
	public void setLevel(int level) {
		this.level = level;
	}
}