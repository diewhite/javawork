package oop.basic;

public class Teacher {
	private String name;
	private int age;
	private String subject;
	public Teacher() {
		
	}
	public Teacher(String name, int age, String subject) {
		super();
		this.name = name;
		this.age = age;
		this.subject = subject;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public String getName() {
		return this.name;
	}
	public int getAge() {
		return this.age;
	}
	public String getSubject() {
		return this.subject;
	}
	public void print(){
		System.out.println("이름 : "+this.name+"  나이 : "+this.age+"  담당과목 : "+this.subject);
	}
}
