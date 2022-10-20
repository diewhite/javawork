package oop.basic.constructor;

public class Student extends Employee{
	private int id;
	public Student() {
		
	}
	public Student(String name, int age, int id) {
		this.name = name;
		this.age = age;
		this.id = id;
		System.out.println("이름 : "+name+"  나이 : "+age+"  학   번 : "+id);
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
}
