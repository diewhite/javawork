package oop.basic;

public class StaticMethodDemoTest {

	public static void main(String[] args) {
		StaticMethodDemo obj = new StaticMethodDemo();
		obj.display();
		//obj.test();//-----X
		StaticMethodDemo.test();//----O
		//Integer i = new Integer();//----X
		//i.parseInt("일이삼사");//----X
		Integer.parseInt("일이삼사");//----O
	}

}
