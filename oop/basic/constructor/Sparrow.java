package oop.basic.constructor;

public class Sparrow {
	String name;
	int legs;
	int length;
	
	public Sparrow() {
		
	}
	
	public void fly() {
		System.out.println("참새("+name+")가 날아다닙니다.");
	}
	
	public void sing() {
		System.out.println("참새("+name+")가 소리내어 웁니다.");
	}
	public String toString() {
		String name = "";
		name = "참새의 이름은 "+this.name+" 입니다.";
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
}
