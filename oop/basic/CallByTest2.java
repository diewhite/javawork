package oop.basic;

public class CallByTest2 {

	public static void main(String[] args) {
		int i = 10;
		Person2 obj = new Person2();
		obj.setName("제이홉");
		obj.setAge(30);
		
		System.out.println("**********변경전**********");
		display(i, obj);
		System.out.println("**********변경후**********");
		change(i, obj);
		//Person2 obj2 = new Person2();
		//change(i, new Person2());
		display(i, obj);		
	}
	public static void change(int data, Person2 obj) {
		data = 2000;
		obj.setName("김범룡");
	}
	public static void display(int data, Person2 obj) {
		System.out.println("기본형데이터를 전달(값이 넘어옴) :"+data);
		System.out.println("참조형데이터를 전달(객체가 할당된 곳의 주소) :"+obj.getName()+","+obj.getAge());
	}
}
