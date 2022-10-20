package oop.polymorphism;
//메시지 전송을 위해 구현해놓은 클래스를 실제 사용하는 클래스
public class SenderLogic {
	public void run(Sender obj) {
		//사용자의 선택에 따라 이메일전송과 문자전송의 기능이 다르게 호출
		obj.send();
	}
}
