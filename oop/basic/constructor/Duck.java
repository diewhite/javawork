package oop.basic.constructor;

public class Duck {
	String name;
	int legs;
	int length;
	
	public Duck() {
		
	}
	public void fly() {
		System.out.println("오리("+name+")는 날지 않습니다.");
	}
	
	public void sing() {
		System.out.println("오리("+name+")가 소리내어 웁니다.");
	}

	public String toString() {
		String name = "";
		name = "오리의 이름은 "+this.name+" 입니다.";
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
}
