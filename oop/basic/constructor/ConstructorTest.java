package oop.basic.constructor;

public class ConstructorTest {

	public static void main(String[] args) {
		//1. setter메소드 호출하기
		Constructor obj = new Constructor();
		System.out.println(obj);
		obj.setName("BTS");
		obj.setAge(30);
		System.out.println(obj.getName()+":"+obj.getAge());
		
		//2. 생성자로 수정해서 코드량 확인하기(코드 줄어드는 량)
		Constructor obj2 = new Constructor("RM", 32);
		System.out.println(obj2.getName()+":"+obj2.getAge());

		//3.this()내부에서 자기 자신의 생성자 호출하기
		System.out.println("DBMS에 데이터 insert중.....");
		Constructor customer = new Constructor("BTS", 30, "army", "1234", "010-1111-2222", "123456-111111", "zzz");
	}

}
