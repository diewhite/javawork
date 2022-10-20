package oop.inheritance;
//클래스 선언부에 final을 추가하면 상속할 수 없는 클래스
class AA{
	public static final int MY_VAL = 10000;	//멤버변수에 final이 추가되면 상수
	public final void display() {	//메소드 앞에 final이 추가되면 오버라이딩이 불가능한 메소드
	System.out.println("AA");
	}
}
class BB extends AA{
	public void display() {	//부모가 갖고 있는 display를 재정의(오버라이딩)
		System.out.println("BB");
	}
}
public class FinalTest {
	public static void main(String[] args) {
		BB obj = new BB();
		obj.display();
	}

}
