package oop.basic.constructor;

public class Teacher extends Employee{
	private String subject;
	
	public Teacher() {
		
	}
	public Teacher(String name, int age, String subject) {
		this.name = name;
		this.age = age;
		this.subject = subject;
		System.out.println("이름 : "+name+"  나이 : "+age+"  담당과목 : "+subject);
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	
}
