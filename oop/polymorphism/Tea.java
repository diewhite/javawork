package oop.polymorphism;

public class Tea extends Beverage{
	static int amount;

	public Tea() {

	}

	public Tea(String name) {
		super(name);
		amount++;
	}

	public void calcPrice() {
		if(getName().equals("lemonTea")) {
			setPrice(1500);
		}else if(getName().equals("ginsengTea")) {
			setPrice(2000);
		}else if(getName().equals("redginsengTea")) {
			setPrice(2500);
		}
	}
	
	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		Tea.amount = amount;
	}
	
	
	
}
