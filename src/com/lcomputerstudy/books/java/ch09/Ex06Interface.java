package com.lcomputerstudy.books.java.ch09;

public class Ex06Interface {

	public static void main(String[] args) {
		Book6 book1 = new Book6();
		book1.setTitle("자바 알고리즘");
		book1.setAuthor("엘컴퓨터학원");
		book1.setPrice(50000);
		
		EBook5 eb = new EBook5();
		eb.setTitle("자바 기본문법");
		eb.setAuthor("엘컴퓨터학원");
		eb.setPrice(30000);
		eb.setFontColor("블루");
		
		Car car = new Car();
		car.setModelName("소나타");
		car.setDoor(2);
		car.setTotalPrice(40000000);
		
		Cart2 cart = new Cart2();
		cart.add(book1);
		cart.add(eb);
		cart.add(car);
		
		OrderService orderService = new OrderService();
		orderService.order(cart);
		
		PrintService printService;
		printService = eb;
		printService.printInfo();
		
		printService = car;
		printService.printInfo();
		//printService.setting();
		PrintServiceForPrinter pfp = (PrintServiceForPrinter)printService;
		pfp.setting();
		PrintServiceForPrinter.getPrinterType();
		pfp.setPrinter();
		pfp.printInfo();
		
		//printService = book1;
		//printService.printInfo();
		
		
	}

}

class Cart2 {
	OrderItem[] items;
	int index;
	
	public Cart2() {
		items = new OrderItem[10];
		index = 0;
	}
	
	public void add(OrderItem item) {
		items[index] = item;
		index++;
	}
	
	public OrderItem[] get() {
		return items;
	}
}

interface OrderItem {
	public abstract String getOrderName();
	public abstract int getOrderPrice(); 
}

class Book6 implements OrderItem {
	String title;
	String author;
	int price;
	
	
	
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public int getPrice() {
		return (int)(price * 1.1f);
	}

	public void setPrice(int price) {
		if (!(price >= 0 && price <= 50000))
			return;
		this.price = price;
	}

	@Override
	public String getOrderName() {
		return getTitle();
	}

	@Override
	public int getOrderPrice() {
		return getPrice();
	}
	
}

class EBook5 extends Book6 implements OrderItem, PrintService {
	private String fontColor;
	
	public String getFontColor() {
		return fontColor;
	}

	public void setFontColor(String fontColor) {
		this.fontColor = fontColor;
	}
	
	@Override
	public void setTitle(String title) {
		super.setTitle("[e북]" + title);
	}
	
	@Override
	public int getPrice() {
		return (int)(price * 1.2f);
	}

	@Override
	public String getOrderName() {
		String title = getTitle() + ", 폰트: " + getFontColor(); 
		return title;
	}

	@Override
	public int getOrderPrice() {
		return getPrice();
	}
	
	@Override
	public void printInfo() {
		System.out.println("--- e북 ---");
		System.out.println("책이름: " + getTitle());
		System.out.println("저자: " + getAuthor());
		System.out.println("가격: " + getPrice());
		System.out.println("폰트색상: " + getFontColor());
		System.out.println("감사합니다.");
		System.out.println();
	}

}

class Car implements OrderItem, PrintServiceForPrinter {
	private String modelName;
	private int totalPrice;
	private int door;	
	
	public String getModelName() {
		return modelName;
	}

	public void setModelName(String modelName) {
		this.modelName = modelName;
	}

	public int getTotalPrice() {
		return totalPrice;
	}

	public void setTotalPrice(int totalPrice) {
		this.totalPrice = totalPrice;
	}

	public int getDoor() {
		return door;
	}

	public void setDoor(int door) {
		this.door = door;
	}

	@Override
	public String getOrderName() {
		return getModelName() + "[" + getDoor() + "도어]";
	}

	@Override
	public int getOrderPrice() {
		return getTotalPrice();
	}

	@Override
	public void printInfo() {
		System.out.println("- 차량정보 -");
		System.out.println("모델명: " + getModelName());
		System.out.println("가격: " + getTotalPrice());
		System.out.println("Door: " + getDoor());
		System.out.println("프린터로 해당 정보가 전송되었습니다.");
		System.out.println();
	}

	@Override
	public void setting() {
		System.out.println("- 프린터 설정 -");
		System.out.println("폰트 사이즈 9pt");
		System.out.println("5매 출력");
	}
	
	/*
	@Override
	public void setPrinter() {
		System.out.println("3번 프린터로 설정");
	}
	*/

}

class OrderService {
	public void order(Cart2 cart) {
		OrderItem[] items = cart.get();
		for (int i=0; i<items.length; i++) {
			if (items[i] == null)
				break;
			System.out.println("상품명: " + items[i].getOrderName() + "\n가격: " + items[i].getOrderPrice() + "\n주문 데이터베이스에 저장되었습니다.\n");
		}
	}
}

interface PrintService {
	public abstract void printInfo();
}

interface PrintServiceForPrinter extends PrintService {
	public abstract void setting();
	
	default public void setPrinter() {
		System.out.println("기본값: 1번 프린터");
	}
	
	public static void getPrinterType() {
		System.out.println("- 프린터 타입 -");
		System.out.println("레이저 프린터입니다.");
	}
}

/*
문제 1.
상품들을 창고에 저장하고 창고에 저장된 상품들을 출력하세요.
모든 상품을 창고에 저장할 수는 없습니다.
창고에 저장될 재고의 정보는 상품명, 가격, 입고일자(String), 출고일자(String)
힌트) 창고 클래스, 재고 인터페이스, 재고 인터페이스가 적용된 상품 클래스들, 재고들이 저장될 배열, instanceof 연산자를 통해 창고에 저장가능한 상품인지 아닌지를 구분할 수 있습니다. 

문제 2.
출고 기능을 코딩하세요.
출고 메소드는 배열에 담겨 있는 해당 재고를 제거하는 방식으로 작성하세요.
출고후 창고에 남아있는 재고의 정보를 출력하세요.
*/
