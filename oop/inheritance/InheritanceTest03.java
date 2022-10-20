package oop.inheritance;
/*
 * <<상속관계에서 생성자가 갖는 특징>>
 * 1. 모든 클래스의 최상위 클래스는 java.lang.Object클래스이다.
 * 	  => 자바에서는 객체가 갖는 공통의 특징을 Object에 정의해놓고 컴파일러를 통해 자동으로 상속받을 수 있도록 한다.
 * 		 (단, 상속하고 있는 클래스가 없는 경우)
 * 2. 자동으로 추가된 상위클래스인 Object가 메모리에 생성될 수 있도록 모든 클래스의 모든 생성자의 첫 번째 문장에는 항상
 * 	  부모클래스의 기본생성자를 호출하는 명령문이 생략되어 있다.
 * 	  ----------------
 * 		super()
 * 		  |_______> 기본으로 부모의 기본생성자가 호출되고 있으나 명시적으로 매개변수가 있는 부모의 생성자를 호출할 수 있다.
 * 					명시적으로 부모의 생성자를 호출하면 컴파일러가 자동으로 만드는 super()는 없다.
 * 3. 부모클래스의 생성자를 호출하는 명령문
 * 		super() => 부모클래스의 기본생성자가 호출
 * 		super(값1,값2...) => 부모클래스의 매개변수있는 생성자가 호출
 */
class SuperA{
	private String name;
	public SuperA() {
		System.out.println("부모클래스의 기본생성자");
	}
	public SuperA(String name) {
		super();
		this.name = name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return this.name;
	}
	
}
class SubA extends SuperA{
	public SubA(String name) {
		super(name);//부모의 생성자를 호출
		//this.name = name
		System.out.println("자식클래스의 생성자");
	}
}
public class InheritanceTest03 {
	public static void main(String[] args) {
		SubA obj = new SubA("BTS");
		System.out.println(obj.getName());
	}

}
