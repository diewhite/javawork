package oop.polymorphism;

interface Group1{
	
}
class Parent{

}
class A extends Parent{
	
}
class B extends Parent{
	
}
class C extends Parent implements Group1{
	
}
class D extends Parent implements Group1{
	
}
class Test{
	//A,B,C,D는 Parent의 하위
	public void run(Parent obj) {
		
	}
	//C,D는 Parent와 Group1을 모두 상위로 갖는다.
	public void exam(Group1 obj) {
		
	}
}
public class InterfaceTest {
	public static void main(String[] args) {
		Test test = new Test();
		//생성된 A,B,C,D객체를 메인메소드 내부에서 사용하지 않고 run메소드에서만 사용하면 참조 변수를 정의해서 사용하지 않고 바로 객체생성해서
		//매개변수로 전달해도 된다.
		A obj = new A();
		test.run(obj);
		test.run(new B());
		test.run(new C());
		test.run(new D());
//		test.exam(new A());  - Error
		test.exam(new C());
	}

}
