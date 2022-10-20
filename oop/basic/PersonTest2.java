package oop.basic;

import java.util.Scanner;

public class PersonTest2 {

	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);
		System.out.println("**********인사관리시스템**********");
		System.out.println("1.사원등록");
		System.out.println("2.사원조회");
		System.out.println("3.사원정보수정");
		System.out.println("4.사원삭제");
		System.out.println("5.사원목록조회");
		System.out.println("원하는 작업을 선택하세요.");
		int choice = key.nextInt();
		switch(choice) {
			case 1:
				System.out.println("===사원등록===");
				System.out.print("성명:");
				String name = key.next();
				System.out.print("나이:");
				int age = key.nextInt();
				System.out.print("주소:");
				String addr = key.next();
				Person p = new Person();
				p.name = name;  //p.으로 접근하는 변수 Person클래스의 멤버변수(필드)
				p.age = age;	// = 오른쪽에 정의된 name변수는 Scanner를 통해서 입력받은 값을 저장한 지역변수
								//Scanner를 통해서 입력받은 name값을 메모리에 생성된 Person객체의 name에 셋팅
				p.addr = addr;
				System.out.println("가입완료!!!");
				System.out.println("가입된 사용자 정보");
				System.out.println("성명: "+p.name);
				System.out.println("나이: "+p.age);
				System.out.println("주소: "+p.addr);
				//DBMS에 저장하기
				break;
				
			case 2:
				System.out.println("===사원조회===");			
			}
		key.close();
		}
}
