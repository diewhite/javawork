package oop.basic;
//클래스를 정의할떄 멤버변수가 있는 경우 멤버변수를 private로 선언해서 정보를 숨겨놓고
//public메소드를 통해서 접근할 수 있다.
public class Person2 {
	private String name;
	private int age;
	private String addr;
	
	//name변수에 대한 작업
	//name변수에 값을 셋팅하는 메소드 - 외부에서 입력 받은 값을 멤버변수인 name변수에 저장
	//=> 메소드명 : set+멤버변수명(첫 글자는 대문자로 변경)
	public void setName(String name) { //setter method, 매개변수로 검증할 수 있는 값을 받아서 검증
		//매개변수인 name으로 전달된 값을 현재 작업 중인 Person2객체의 멤버변수인 name에
		//저장하겠다는 의미(this.name)
		this.name = name;
	}
	
	//name변수에 저장된 값을 사용하기 위해서 name변수의 값을 호출한 곳으로 반환
	//=> 메소드명 : get+멤버변수명(첫 글자는 대문자로 변경)
	public String getName() { //검증작업을 하는 경우에는 매개변수를 정의
		return this.name;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getAge() {
		return this.age;
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}
	public String getAddr() {
		return this.addr;
	}
	private void test() {
		//내부에서 중요한 데이터를 제어하기 위한 기능
		//클래스 내부에서만 사용하는 메소드
	}
}
