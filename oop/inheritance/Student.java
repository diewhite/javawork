package oop.inheritance;

public class Student extends Employee{
	private int id;
	public Student() {

	}
	public Student(String name, int age, int id) {
		super(name,age);
		this.id = id;
	}
	public void print() {
		super.print();
		System.out.print("  담당과목 : "+getId()+"\n");		
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
}
