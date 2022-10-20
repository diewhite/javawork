package oop.inheritance;

public class Staff extends Employee{
	private String dept;

	public Staff() {
		
	}
	public Staff(String name, int age, String dept) {
		super(name,age);
		this.dept = dept;
		
	}
	public void print() {
		super.print();
		System.out.print("  담당과목 : "+getDept()+"\n");		
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	
}
