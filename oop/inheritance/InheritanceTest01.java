package oop.inheritance;
/*
 * <<상속관계에서 멤버변수가 갖는 특징>>
 * 1. 상속관계에서 상위클래스에 선언된 멤버변수는 하위클래스에서 접근이 가능
 * 2. 상위클래스에서 선언된 변수와 동일한 이름의 멤버변수를 하위클래스에 정의하면 부모클래스의 멤버변수보다 하위클래스의 멤버변수가 우선순위가 높다
 * 3. 하위클래스에서 상위클래스의 멤버를 접근하고 싶다면 super를 이용해서 접근
 *                       ----
 *                        멤버변수(필드), 멤버메소드
 *    this => 자기자신의 객체를 지칭
 *    super => 부모객체
 * 4. 상위클래스의 멤버가 private이면 하위클래스도 접근할 수 없다.
 */
class Super{
	private int num = 10;
	
}
class Sub extends Super{
	int num = 100;
	public void display() {
		System.out.println("num==>"+num); //Sub클래스에 직접 정의되어 있지 않음
										  //Sub클래스가 상속하는 Super 클래스에 정의되어 있으므로 마치 Sub클래스에 정의되어 있는
										  //변수처럼 접근이 가능
		System.out.println("부모클래스의 num==>"+super.num);
	}
}
public class InheritanceTest01 {
	public static void main(String[] args) {
		Sub obj = new Sub();
		obj.display();
		System.out.println(obj.num);
	}

}
