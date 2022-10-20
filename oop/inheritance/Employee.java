package oop.inheritance;

public class Employee {
	private String name;
	private int age;
	public Employee() {
		
	}
	public Employee(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	public void print() {
		System.out.print("이름 : "+name+"  나이 : "+age);
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