package oop.polymorphism;

public class Coffee extends Beverage{
	static int amount;

	public Coffee() {

	}

	public Coffee(String name) {
		super(name);
		amount++;
	}
	
	public void calcPrice() {
		if(getName().equals("Americano")) {
			setPrice(1500);
		}else if(getName().equals("CafeLatte")) {
			setPrice(2500);
		}else if(getName().equals("Cappuccino")) {
			setPrice(3000);
		}
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		Coffee.amount = amount;
	}
	
	
}
