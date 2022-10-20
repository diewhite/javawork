package oop.basic;

public class StaticDemoTest2 {

	public static void main(String[] args) {
		StaticDemoTest2 obj = new StaticDemoTest2();
		obj.display();
		StaticMethodDemo obj2 = new StaticMethodDemo();
		StaticMethodDemo obj3 = new StaticMethodDemo();
		StaticMethodDemo obj4 = new StaticMethodDemo();
	}
	public void display() {
		System.out.println("Display");
	}
}
