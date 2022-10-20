package oop.basic.constructor;

public class Staff extends Employee{
	private String dept;

	public Staff() {
		
	}
	public Staff(String name, int age, String dept) {
		this.name = name;
		this.age = age;
		this.dept = dept;
		System.out.println("이름 : "+name+"  나이 : "+age+"  부   서 : "+dept);
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	
}
