/*
 * Copyright 2022. 이신만 <rngooqw@gmail.com> All rights reserved.
 */
package com.lcomputerstudy.books.java.ch18;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

public class Ex12Collections {

	public static void main(String[] args) {
		System.out.println("< addAll >");
		List<String> list = new ArrayList<>();
		Collections.addAll(list, "A", "D", "B", "C", "E");
		System.out.println(list);
		System.out.println();
		
		System.out.println("< binarySearch 정렬 전 >");
		System.out.println(Collections.binarySearch(list, "D"));
		System.out.println();
		
		System.out.println("< sort >");
		Collections.sort(list);
		System.out.println(list);
		System.out.println();
		
		System.out.println("< binarySearch 정렬 후 >");
		System.out.println(Collections.binarySearch(list, "D"));
		System.out.println();
		
		System.out.println("< max, min >");
		System.out.println(Collections.max(list));
		System.out.println(Collections.min(list));
		System.out.println();
		
		System.out.println("< replaceAll >");
		Collections.replaceAll(list, "A", "A2");
		System.out.println(list);
		System.out.println();
		
		System.out.println("< reverse >");
		Collections.reverse(list);
		System.out.println(list);
		System.out.println();
		
		System.out.println("< rotate >");
		Collections.rotate(list, 2);
		System.out.println(list);
		System.out.println();
		
		System.out.println("< shuffle >");
		Collections.shuffle(list);
		System.out.println(list);
		System.out.println();
		
		System.out.println("< singleton >");
		Set<String> set = Collections.singleton("A");
		System.out.println(set);
		//set.add("B");		// error
		System.out.println();
		
		System.out.println("< singletonList >");
		List<String> list2 = Collections.singletonList("B");
		System.out.println(list2);
		//list2.add("C");	// error
		System.out.println();
		
		System.out.println("< reverseOrder >");
		Collections.sort(list, Collections.reverseOrder());
		System.out.println(list);
		System.out.println();
		
		System.out.println("< swap >");
		Collections.swap(list, 0, 1);
		System.out.println(list);
		System.out.println();
		
		System.out.println("< fill >");
		Collections.fill(list, "Z");
		System.out.println(list);
		System.out.println();
	}

}

/*
문제 1.
addAll 을 이용해 리스트에 임의의 값들을 입력 후
binarySearch 를 이용해 검색하세요.
오름차순과 내림차순을 적용 후 출력하세요.

문제 2.
Arrays.asList를 이용해 리스트 생성 후 해당 리스트에 임의의 값을 추가하세요.

문제 3.
Arrays.equals 와 Arrays.deepEquals 를 사용하여 1차원 배열과 2차원 배열의 값을 비교하는 코드를 작성하세요.
*/
