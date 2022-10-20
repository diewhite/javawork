package oop.basic.constructor;
//생성자연습
public class Constructor {
	String name;
	int age;
	String id;
	String pass;
	String telNum;
	String ssn;
	String nickName;
	
	public Constructor() {
		super();
		System.out.println("기본생성자");
	}
	public Constructor(String name) {
		super();
		System.out.println("매개변수 1개 생성자");
	}
	public Constructor(String name, int age) {
		this.name = name;
		this.age = age;
	}
	//update용 생성자(ex)
	public Constructor(int age, String id, String pass, String telNum, String nickName) {
		super();
		this.age = age;
		this.id = id;
		this.pass = pass;
		this.telNum = telNum;
		this.nickName = nickName;
		System.out.println("매개변수5개 생성자 호출");
	}
	//search용 생성자(ex)
	public Constructor(int age, String id, String pass, String telNum, String ssn, String nickName) {
		this(age, id, pass, telNum, nickName);
		this.ssn = ssn;
		System.out.println("매개변수6개 생성자 호출");
	}
	//insert(입력), select(조회) 용 생성자(ex)
	public Constructor(String name, int age, String id, String pass, String telNum, String ssn, String nickName) {
		this(age, id, pass, telNum, ssn, nickName);
		this.name = name;
		System.out.println("매개변수7개 생성자 호출");
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
}
