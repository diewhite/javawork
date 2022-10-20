package oop.basic;
//MethodDemo에서 정의한 메소드를 호출해서 사용하기
public class MethodDemoTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodDemo m = new MethodDemo();
		System.out.println("===작업시작===");
		//1. 메소드를 호출 - 매개변수가 없고 리턴값이 없는 메소드의 호출
		m.display();
		//2. 매개변수가 1개 있고 리턴값이 없는 메소드의 호출
		m.display("★");
		m.display("♥");
		//3. 매개변수 2개 있고 리턴값이 없는 메소드의 호출
		m.display("※", 3);
		m.display("＠", 6);
		System.out.println("step1");
		System.out.println("step2");
		m.display();
		System.out.println("step3");
		System.out.println("step4");
		//4. 매개변수가 있고 리턴값이 있는 메소드의 호출
		int result = m.add(100,200);
		//리턴값이 있는 메소드를 호출하는 경우에는 리턴값을
		//변수를 선언해서 저장할 수 있도록 처리
		System.out.println("결과 : "+result);
		//리턴값을 변수에 저장하면 결과로 다른 다양한 작업을 처리
		if(result>=300) {
			System.out.println("pass");
		}else {
			System.out.println("fail");
		}
		//리턴값이 있는 메소드는 또 다른 메소드의 매개변수로
		//사용이 가능
		System.out.println("결과 : "+m.add(500, 300));
	}

}
