package oop.inheritance;

public class Coffee extends Beverage{
	String name;
	public Coffee() {
		
	}
	public Coffee(String type, int price, String name) {
		this.type = type;
		this.price = price;
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void print() {
		System.out.println("타입:"+type+",가격:"+price+",이름:"+name);
	}
	
}
