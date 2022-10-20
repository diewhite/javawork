package oop.basic;
//MyMethod클래스에서 만든 메소드 호출해서 사용하기
public class MyMethodTest {

	public static void main(String[] args) {
		//1번 메소드 호출하기
		MyMethod m = new MyMethod();
		m.printCalc();
		
		//2번 메소드 호출하기
		m.printCalc(10, 20);
	}

}
