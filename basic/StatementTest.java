package basic;

public class StatementTest {
	public static void main(String[] args) {
		//주석문 : 한줄 주석
		/*
		 * 
		 * 여러 줄 주석문으로 
		 *  ctrl + space
		 *  ctrl + / => 한 줄 주석 설정&해제(Toggle)
		 *  ctrl + shift + / => 여러 줄 주석 설정
		 *  ctrl + shift + \ => 여러 줄 주석 해제
		 *  ctrl + shift + f => 코드정리
		 */
		//변수의 선언 - 자바는 무조건 데이터타입을 명시하고 변수를 선언해야 한다.
		/*
		 * 데이터타입 변수명 = 값;
		 */
		int num; //변수의 정의
		int num2 = 100; //변수를 정의하고 초기값을 셋팅
		//정의한 변수에 값을 설정하기
		num = 200;
		//이미 사용하고 있는 변수를 데이터타입과 함께 정의하면 새로 변수를 만들겠다는 의미이므로 Error - 동일한 변수명은 사용할 수 없다.
		//int num=0;
		//+는 연결연산자, 더하기의 의미
		int result = num + num2;
		System.out.println("결과=>"+result);
		System.out.println("테스트");
		System.out.println("테스트");
		 
	}
}
