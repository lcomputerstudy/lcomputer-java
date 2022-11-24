/*
 * Copyright 2022. 이신만 <rngooqw@gmail.com> All rights reserved.
 */
package com.lcomputerstudy.books.java.ch20;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Repeatable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

@Settings(version=1.1, author={"A", "B"})
public class Ex01Annotation {

	public static void main(String[] args) {
		Settings settings = Ex01Annotation.class.getAnnotation(Settings.class);
		System.out.println(settings.version());
		System.out.println(Arrays.toString(settings.author()));
		System.out.println();
		
		Role[] arrRole = Car.class.getAnnotationsByType(Role.class);
		for (Role role : arrRole) {
			System.out.println(role.value());
		}
		System.out.println();
		
		Scanner scanner = new Scanner(System.in);
		Map<String, Method> handlerMapping = new HashMap<>();
		
		for (Method method : Car.class.getDeclaredMethods()) {
			RequestMapping requestMapping = method.getAnnotation(RequestMapping.class);
			if (requestMapping != null)
				handlerMapping.put(requestMapping.value(), method);			
		}
		handlerMapping.forEach((k, v) -> System.out.println("command: " + k + ", method: " + v.getName()));
		System.out.println();
		
		while (true) {
			System.out.println("명령어를 입력하세요(engine, name, quit): ");
			String command = scanner.nextLine();
			try {
				if (handlerMapping.get(command) != null) {
					String returnStr = (String)handlerMapping.get(command).invoke(Car.class.newInstance());
					System.out.println(returnStr);
				} else {
					System.out.println("잘못된 명령어를 입력하였습니다.");
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
		// @Documented -> Javadoc
		// @Inherited	
		
		
		
	}

}

@Role("Manager")
@Role("User")
class Car {
	@SuppressWarnings("rawtypes") 
	private List tires = new ArrayList();
	
	@RequestMapping("name")
	public String getName() {
		return "자동차의 이름은 소나타입니다.";
	}
	@RequestMapping("engine")
	public String runEngine() {
		return "엔진이 가동됩니다.";
	}
	@RequestMapping("quit")
	public String quit() {
		System.out.println("프로그램이 종료됩니다.");
		System.exit(0);
		return null;
	}
	
	@SuppressWarnings({"unchecked", "unused", "deprecation"})
	public void addTire(String tire) {
		tires.add(tire);					// unchecked
		String tireName = "Abc Tire";		// unused
		Date date = new Date();
		date.getYear();						// deprecation
	}
	@Deprecated
	public static void printVersion() {
		System.out.println("v1.0");
	}
	
}

class NewCar extends Car {
	@Override
	public String getName() {
		return "[New]" + super.getName();
	}
}

@Deprecated
class OldCar {
	
}

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@interface RequestMapping {
    String value();
}

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@Documented
@interface Settings {
   String lang() default "kor";
   double version() default 1.0;
   String[] author();
}

@Repeatable(value = Roles.class)
@Retention(RetentionPolicy.RUNTIME)
@interface Role {
	String value();
}

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@interface Roles {
    Role[] value();
}

/*
 * <메타 어노테이션>
 * @Retention
 * 		RetentionPolicy.SOURCE
 * 		RetentionPolicy.CLASS
 * 		RetentionPolicy.RUNTIME
 *
 * @Target
 * 		ElementType.ANNOTATION_TYPE
 * 		ElementType.CONSTRUCTOR
 * 		ElementType.FIELD
 * 		ElementType.LOCAL_VARIABLE
 * 		ElementType.METHOD
 * 		ElementType.PACKAGE
 * 		ElementType.PARAMETER
 * 		ElementType.TYPE
 * 
 * @Inherited
 * @Repeatable
 * @Documented
 */

/*
문제 1.

*/