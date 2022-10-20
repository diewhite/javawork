package exception;
//사용자정의 예외클래스를 만들기
public class MyException extends Exception{
	public MyException(String msg) {
		super(msg);//Exception클래스의 메시지를 전달 - Exception의 매개변수1개 생성자를 호출
	}
}
