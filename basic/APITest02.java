package basic;

public class APITest02 {

	public static void main(String[] args) {
		String str = new String("java");
		//String클래스에 정의되어있는 charAt메소드를 사용
		//1.String클래스의 charAt메소드는 매개변수 1개이고 int이므로 호출할때 int형변수를 한 개 넘겨준다.
		//2.charAt의 실행결과로 값이 발생한다. 리턴 타입이 char이므로 동일한 타입의 변수를 선언해서 결과를 저장해야 한다.
		char c = str.charAt(3);
		System.out.println("0번째 문자=>"+c);
		System.out.println("함수의 실행 결과를 또 다른 메소드의 매개변수로 전달할 수 있다.:"+str.charAt(2));
	}

}
