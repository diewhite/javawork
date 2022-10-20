package oop.polymorphism;
/*
 * <<인터페이스>>
 * => 추상메소드만 보관하는 특별한 클래스
 * 	  인터페이스를 사용하면 다형성을 적용할 수 있으며 다중상속 받은 것처럼 구현할 수 있다.
 * 1. 인터페이스틑 정의할때 interface키워드를 이용해서 정의
 * 2. 인터페이스는 추상메소드만 정의하는 특별한 클래스
 * 	  - 인터페이스에 정의하는 메소드는 public abstract를 생략해도 된다.
 * 	  - 멤버변수는 상수로 public static final이다.
 * 	  - 하위클래스에서 오버라이딩하면 자동으로 public이 추가된다.
 * 3. 클래스가 인터페이스를 상속할때는 implement키워드를 이용해서 구현(상속)
 * 4. 인터페이스가 인터페이스를 상속할 수 있다.
 * 	  - 인터페이스가 인터페이스를 상속하는 경우는 extends를 이용 
 * 5. 클래스가 인터페이스를 상속하는 경우에는 다중상속이 가능하다. 즉, 여러 개의 인터페이스를 상속할 수 있다.
 * 	  - , 로 구분해서 정의
 * 	  - 인터페이스가 인터페이스를 상속하는 경우에도 다중상속을 허용
 * 6. 클래스와 인터페이스를 모두 상속하는 경우 extends가 implements보다 먼저 선언되어야 한다.
 */
interface SuperInterfaceA{
	void show();//인터페이스가 갖는 추상메소드
}

interface InterA extends SuperInterfaceA{
	void test();
	void display();
}

interface InterB{
	void change();
}

interface InterC extends InterA, InterB{
	//InterC인터페이스는 show,test,display,change 메소드를 가지고 있는 상황
}

class SuperObj{
	
}

class TestA extends SuperObj implements InterA, InterB{
	//InterA, InterB를 상속하면 TestA는 추상클래스 - 추상메소드를 모두 오버라이딩 해야 한다.
	@Override
	public void show() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void change() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void test() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		
	}

}


public class InterfaceTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
