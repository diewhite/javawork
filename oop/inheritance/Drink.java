package oop.inheritance;

public class Drink {
	String name;
	int price;
	int count;
	
	public Drink() {
		
	}

	public Drink(String name, int price, int count) {
		this.name = name;
		this.price = price;
		this.count = count;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}
	
	public int getTotalPrice() {
		int total = 0;
		total = price * count;
		return total;
	}
	public static void printTitle() {
		System.out.println("상품명\t단가\t수량\t금액");
	}
	public void printData() {
		System.out.println(name+"\t"+price+"\t"+count+"\t"+getTotalPrice());
	}
	
}
