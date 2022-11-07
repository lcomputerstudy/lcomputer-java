/*
 * Copyright 2022. 이신만 <rngooqw@gmail.com> All rights reserved.
 */
package com.lcomputerstudy.books.java.ch18;

import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Ex10Map {
	public static void main(String[] args) {
		System.out.println("< 팀A >");
		Map<String, String> teamA = new HashMap<>();
		teamA.put("A", "자바");
		teamA.put("B", "C");
		teamA.put("C", "파이썬");
		teamA.put("D", "자바");
		teamA.put("E", "자바");
		teamA.put("E", "DB");		// 키 중복 불가
		for (Map.Entry<String, String> e : teamA.entrySet()) {
			System.out.println("이름: " + e.getKey() + "\t스킬: " + e.getValue());
		}
		System.out.println();
		
		System.out.println("< 팀B >");
		Map<String, String> teamB = new HashMap<>();
		teamB.put("A", "자바");
		teamB.put("C", "파이썬");
		teamB.put("F", "자바");
		teamB.put("G", "안드로이드");
		teamB.put("H", "IOS");
		teamB.put("I", "안드로이드");
		for (Iterator<String> it = teamB.keySet().iterator(); it.hasNext(); ) {
			String key = it.next();
			System.out.println("이름: " + key + "\t스킬: " + teamB.get(key));
		}
		System.out.println();
		
		System.out.println("< A + B 통합 팀 >");
		Map<String, String> employee = new HashMap<>();
		employee.putAll(teamA);
		employee.putAll(teamB);
		for (Map.Entry<String, String> e : employee.entrySet()) {
			System.out.println("이름: " + e.getKey() + "\t스킬: " + e.getValue());
		}
		System.out.println();
		
		System.out.println("< 안드로이드 개발자 부서 이동 후 팀원 목록 >");
		Set<String> skill = Collections.singleton("안드로이드");		// 수정 불가능 
		employee.values().removeAll(skill);
		System.out.println(employee.keySet());
		
		System.out.println("< C, F PL이 소속돼 있는 지 확인 >");
		Map<String, String> pl = new HashMap<>();
		pl.put("C", "파이썬");
		pl.put("F", "자바");
		System.out.println( employee.entrySet().containsAll(pl.entrySet()) );
		System.out.println();
		
		System.out.println("< 팀A와 B의 팀원이 모두 같은 지 확인 >");
		System.out.println(teamA.keySet().equals(teamB.keySet()));
		System.out.println();
		
		System.out.println("< 통합팀 자바, 자바스크립트 스킬 보유 여부 >");
		System.out.println(employee.containsValue("자바"));
		System.out.println(employee.containsValue("자바스크립트"));
		
		//LinkedHashMap, TreeMap
	}
}

/*
문제 1.
1반 학생들의 이름, 점수가 저장된 맵과 2반 학생들의 이름, 점수가 저장된 맵을 만드세요.
두 반의 모든 학생들을 중복 없이 출력하세요.

문제 2.
점수가 90점 이상인 학생들을 맵에서 삭제 후 출력하세요.

문제 3.
55점인 학생 모두 맵에서 삭제하세요.

문제 4.
100점인 학생이 존재하는 지 출력하세요.
*/




