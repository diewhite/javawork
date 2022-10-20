package oop.polymorphism;
/*
 * 추상클래스
 * => 객체를 생성할 수 없는 클래스 즉, 모두 구현되어 있지 않은 클래스(미완성된 클래스)
 * 	  내용이 구현되어 있지 않은 메소드를 포함하고 있는 클래스를 추상클래스라 한다.
 * 	  ----------------------
 * 			추상메소드(body가 없는 메소드)
 * 
 * 	1) 추상메소드를 선언하는 방법
 * 	   접근제어자 abstract 리턴타입 메소드명(매개변수list...) ;
 * 	   왜?????? 추상메소드를 만들까????
 * 
 * 	2) 추상클래스의 특징
 * 		- 일반메소드와 추상메소드를 모두 정의할 수 있다.
 * 		- 추상메소드가 하나라도 정의되어 있으면 클래스 선언부에 abstract추가된다.
 * 		- 추상클래스는 객체생성을 할 수 없는 클래스
 *		- 추상클래스를 상속받는 클래스는 extends하면 에러가 발생
 *		  => SubA가 SuperA를 상속받는다. SuperA의 모든 멤버가 SubA의 소유
 *			 따라서 SubA도 추상메소드를 갖는 추상클래스가 된다.
 *			[에러처리]
 *			 * SubA앞에 abstract를 추가한다.
 *			 * 상속받은 abstract메소드를 구현한다.(메소드의 body를 정의한다.)
 *
 * 		- abstract클래스는 상위클래스로 사용하기 위해서 사용(상위클래스로 정의되고 타입으로 사용하기 위해서 사용)
 * 		- abstract메소드는 하위클래스에서 반드시 오버라이딩되어야 한다는 것을 문법적으로 제시.
 * 
 */
abstract class SuperA{
	public void test() {	//일반메소드
		System.out.println("test");
	}
	public abstract void display();	//추상메소드
}
class SubA extends SuperA{

	@Override
	public void display() {
		System.out.println("display");
	}

}
public class AbstractTest {
	public static void main(String[] args) {
//		SuperA obj = new SuperA() ;
		SubA obj = new SubA();
		obj.display();
	}

}