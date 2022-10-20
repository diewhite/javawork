package oop.inheritance;

public class Teacher extends Employee{
	private String subject;
	
	public Teacher() {
		
	}
	
	public Teacher(String name, int age, String subject) {
		super(name, age);
		this.subject = subject;
	}

	public void print() {
		super.print();
		System.out.print("  담당과목 : "+getSubject()+"\n");		
	}
	public String getSubject() {
		return subject;
	}


	
}
