package oop.basic;

public class PersonTest3 {

	public static void main(String[] args) {
		Person2 obj = new Person2();
		//obj.name = "자바";
		obj.setName("자바");
		obj.setAge(30);
		obj.setAddr("서울");
		System.out.println("성명 : "+obj.getName());
		System.out.println("나이 : "+obj.getAge());
		System.out.println("주소 : "+obj.getAddr());
	}

}
