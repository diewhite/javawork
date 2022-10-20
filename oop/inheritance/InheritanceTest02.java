package oop.inheritance;
/*
 * <<상속관계에서 메소드가 갖는 특징>>
 * 1. 상위클래스에서 정의된 메소드를 하위ㅏ클래스에서 호출할 수 있다.
 * 	  => 하위클래스의 참조변수를 통해서도 상위클래스의 메소드를 접근할 수 있다.
 * 2. 상위클래스에 정의된 메소드와 동일한 메소드를 하위클래스에 정의하면
 * 	  하위클래스의 메소드가 호출된다.
 * 	  => 상위클래스에 정의된 메소드와 동일하게 메소드를 정의하는 것을 메소드의 재정의라 한다.
 * 		즉, 메소드 오버라이딩이라 한다.
 * 			-----------
 * 				오버라이딩하는 경우 반드시 메소드의 선언부(리턴타입, 매개변수갯수, 매개변수타입, 메소드명)가 상위클래스와 동일해야 한다.
 * 3. 상위클래스의 메소드를 호출하려면 super를 이용한다.
 */

class Parent{
	public void display() {
		System.out.println("부모클래스의 display()");
	}
}
class Child extends Parent{
	public void display() {
		System.out.println("자식클래스의 display()");
	}
	public void test() {
		System.out.println("자식클래스의 test()");
		display(); // 부모 클래스의 메소드
		super.display();
	}
}
public class InheritanceTest02 {

	public static void main(String[] args) {
		Child obj = new Child();
		obj.test();
		obj.display(); // 하위클래스의 참조변수를 통해 접근
	}

}
