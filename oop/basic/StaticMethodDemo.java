package oop.basic;

public class StaticMethodDemo {
	int num;
	static int staticNum;
	static {
		System.out.println("static블럭 - 클래스가 로딩될때 한 번 실행하는 코드를 정의할 목적으로 사용");
		System.out.println("static블럭 - 자원에 대한 정보를 한 번 인식시키거나 접근할 필요가 있는 경우 사용");
		System.out.println("static블럭 - 클래스가 로딩될때 한 번만 실행되므로 static변수의 값을 초기화할 목적으로 사용");
	}
	public StaticMethodDemo() {
		System.out.println("StaticMethodDemo의 기본생성자");
	}
	//클래스메소드
	//1. static메소드안에서 static메소드 호출하기 - 일반적인 방법으로 가능
	public static void test() {
		show();
		System.out.println("test:"+staticNum);
		//System.out.println("display:"+num);//- static메소드 안에서 인스턴트변수를 일반적인 방법으로 접근할 수 없다.
	}
	//인스턴스메소드
	//2. non-static메소드에 non-static메소드 호출 - 일반적인 방법으로 가능
	public void display() {
		System.out.println("test:"+num);
		change();
	}
	//클래스메소드
	public static void show() {
	//4. static메소드에서 non-static메소드를 호출 - 일반적인 방법으로 접근이 불가능
	//	-> 내 객체안에 정의된 메소드라고 하더라도 객체생성해서 접근해야 한다.
		StaticMethodDemo obj = new StaticMethodDemo();
		obj.examtest();
		System.out.println("show");
	}
	//인스턴스메소드
	public void change() {
	//3. non-static메소드에서 static메소드를 호출 - 일반적인 방법으로 가능
		show();
		//display();
		System.out.println("change");
	}
	public void examtest() {
		
	}
}
