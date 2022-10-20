package oop.basic;
//여러 가지 유형의 메소드를 정의
public class MethodDemo {
	//4. 매개변수가 있고 리턴값이 있는 메소드
	//	=> 두 수를 입력 받아서 더한 값을 리턴하는 메소드
	//	=> 리턴값(메소드 실행결과)에 대한 타입을 메소드선언부에 명시
	//	=> 반드시!! 메소드의 마지막 문장에 return명령문을 이용해서 결과를 리턴시켜야 한다.
	public int add(int num1, int num2) {
		//return num1+num2; //연산식이나 메소드 호출문을 직접 리턴값으로 사용가능
		//리턴값이 있는 메소드는 리턴타입과
		//동일한 타입의 변수를 선언(지역변수는 초기값이 있어야 한다.)
		int result = 0;
		result = num1 + num2;
		return result;
	}
	
	//3. 매개변수가 2개 있고 리턴값이 없는 메소드
	//	 메소드명 : display
	//	 매개변수 : 기호문자열, 출력횟수
	//	 매개변수로 전달한 기호문자열을 출력 횟수만큼 출력하도록 구현
	//	=> 메소드정의, 호출
	public void display(String str, int count) {
		for(int i = 1; i<=count; i++) {
			System.out.print(str);
		}
		System.out.println();
	}
	
	//2. 매개변수가 있고 리턴값이 없는 메소드
	public void display(String str) {
		for(int i = 1; i<=10; i++) {
			System.out.print(str);
		}
		System.out.println();
	}
	
	//	1. 매개변수없고 리턴값이 없는 메소드
	//	*을 10개 출력하는 기능을 갖고 있는 메소드
	//	외부에서 입력 받는 값이 없고 메소드 실행 결과값도 없다.
	//	=> *을 10개 출력할 경우에만 사용할 수 있다.
	public void display() {
		for(int i = 1; i<=10; i++) {
			System.out.print("*");
		}
		System.out.println();
	}
}
