package oop.basic;
public class StaticDemoTest {
	public static void main(String[] args) {
		StaticDemo obj1 = new StaticDemo();
		obj1.display();
		//num변수는 인스턴스 변수이므로 obj1같은 참조변수를 통해서 접근 가능
		//staticNum은 객체가 생성될때마다 객체안에 만들어지는 변수가 아니라
		//클래스가 처음 메모리에 로딩될때 한번만 메모리에 로딩되는 변수이다.
		//객체의 소유가 아니므로 객체참조변수명으로 접근하지 않고 클래스명.변수로 접근한다.
		System.out.println("main: "+obj1.num +","+ StaticDemo.staticNum);
		System.out.println();
		
		StaticDemo obj2 = new StaticDemo();
		obj2.display();
		System.out.println("main: "+obj2.num +","+ obj2.staticNum);
		System.out.println();
		
		StaticDemo obj3 = new StaticDemo();
		obj3.display();
		System.out.println("main: "+obj3.num +","+ obj3.staticNum);
		System.out.println();
		
	}
}
