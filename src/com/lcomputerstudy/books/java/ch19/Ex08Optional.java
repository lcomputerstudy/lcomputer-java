/*
 * Copyright 2022. 이신만 <rngooqw@gmail.com> All rights reserved.
 */
package com.lcomputerstudy.books.java.ch19;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;
import java.util.OptionalInt;

public class Ex08Optional {
	public static void main(String[] args) {
		List<EBook> ebooks = new ArrayList<>();
		ebooks.add(new EBook("자바 기본문법", 50000, EBook.Category.LANG));
		ebooks.add(new EBook("자바 알고리즘", 30000, EBook.Category.APP));
		ebooks.add(new EBook("파이썬 기본문법", 35000, EBook.Category.LANG));
		ebooks.add(new EBook("파이썬 기본문법", 33000, EBook.Category.LANG));
		ebooks.add(new EBook("파이썬 기본문법", 33000, EBook.Category.LANG));
		ebooks.add(new EBook("리눅스", 40000, EBook.Category.APP));
		
		System.out.println("< of(instance) >");
		EBook eb = new EBook("AWS", 40000, EBook.Category.APP);
		Optional<EBook> opt = Optional.of(eb);
		System.out.println(opt.get());
		System.out.println();
		
		System.out.println("< of(null) >");
		EBook eb2 = null;
		try {
			Optional<EBook> opt2 = Optional.of(eb2);
		} catch (NullPointerException e) {
			System.out.println("NullPointerException 발생");
		}
		System.out.println();
		
		System.out.println("< ofNullable >");
		Optional<EBook> opt3 = Optional.ofNullable(eb2);
		try {
			opt3.get();
		} catch (NoSuchElementException e) {
			System.out.println("get메소드 호출 시 " + e.getMessage());
		}
		System.out.println();
		
		System.out.println("< isPresent >");
		if (opt3.isPresent())
			System.out.println(opt3.get());
		else
			System.out.println("opt3는 null입니다.");
		EBook eb3 = opt3.isPresent() ? opt3.get() : new EBook("옵셔널", 30000, EBook.Category.LANG);
		System.out.println(eb3);
		System.out.println();
		
		System.out.println("< orElse >");
		EBook eb4 = opt3.orElse(new EBook("옵셔널", 30000, EBook.Category.LANG));
		System.out.println(eb4);
		System.out.println();
		
		System.out.println("< orElseGet >");
		EBook eb5 = opt3.orElseGet(() -> new EBook("옵셔널", 30000, EBook.Category.LANG));
		System.out.println(eb5);
		System.out.println();
		
		System.out.println("< orElseThrow >");
		try {
			opt3.orElseThrow(() -> new NullPointerException());
		} catch (NullPointerException e) {
			System.out.println("NullPointerException 발생");
		}
		System.out.println();
		
		System.out.println("< empty >");
		Optional<EBook> opt4 = Optional.empty();
		Optional<EBook> opt5 = null;
		System.out.println(opt4.orElse(new EBook("옵셔널", 30000, EBook.Category.LANG)));
		//System.out.println(opt5.orElse(new EBook("옵셔널", 30000, EBook.Category.LANG)));	// NullPointerException
		System.out.println();
		
		System.out.println("< OptionalInt >");
		OptionalInt optInt =
			ebooks
				.stream()
				.mapToInt(EBook::getPrice)
				.max();
		System.out.println(optInt.getAsInt());
		System.out.println();
		
		System.out.println("< flatMap, map >");
		Panel p = new Panel();
		p.setType("IPS");
		Optional<Panel> panel = Optional.of(p);
	
		Screen s = new Screen();
		s.setPanel(panel);
		Optional<Screen> screen = Optional.of(s);
		
		Monitor monitor = new Monitor();
		monitor.setScreen(screen);
		
		String panelType = 
			Optional
				.ofNullable(monitor)
				.flatMap(Monitor::getScreen)
				.flatMap(Screen::getPanel)
				.map(Panel::getType)
				.orElse("TN");
		System.out.println(panelType);
		System.out.println();
		
		System.out.println("< ifPresent >");
		Optional<String> optPanelType = 
			Optional
				.ofNullable(monitor)
				.flatMap(Monitor::getScreen)
				.flatMap(Screen::getPanel)
				.map(Panel::getType);
		optPanelType.ifPresent(System.out::println);
	}
}

class Monitor {
	private Optional<Screen> screen;

	public Optional<Screen> getScreen() {
		return screen;
	}
	public void setScreen(Optional<Screen> screen) {
		this.screen = screen;
	}	
}

class Screen {
	private Optional<Panel> panel;

	public Optional<Panel> getPanel() {
		return panel;
	}

	public void setPanel(Optional<Panel> panel) {
		this.panel = panel;
	}
}

class Panel {
	private String type;

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
}

/*
문제 1.
입력 받은 자동차 정보를 이용해 인스턴스를 생성하세요.
인스턴스의 toString을 이용해 자동차의 정보를 출력하세요.
정보가 미입력 될 경우 참조변수에 null이 저장되어야 합니다.
옵셔널을 사용해 미입력된 자동차일 경우 '미입력차량'을 출력하세요.

문제 2.
옵셔널과 맵을 사용해 자동차의 금액을 출력하되 자동차의 금액이 없을 경우 1이 출력되도록 코딩하세요. 
*/