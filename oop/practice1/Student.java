package oop.practice1;

public class Student{
	private String name;
	private String subject;
	private int fee;
	private double returnFee;
	
	public Student() {
		
	}
	public Student(String name, String subject, int fee) {
		this.name = name;
		this.subject = subject;
		this.fee = fee;
	}
	public Student(String name, String subject, String fee) {
		this.name = name;
		this.subject = subject;
		this.fee = Integer.parseInt(fee);
	}
	public void calcReturnFee() {
		if(subject.equals("javaprogram")){
				setReturnFee(this.fee*0.25);
		}else if(subject.equals("jspprogram")){
			setReturnFee(this.fee*0.20);
		}else {
			System.out.println("그런 과정명은 없습니다.");
		}
	}
	public void print() {
		if(returnFee!=0) {
		System.out.println(getName()+"씨의 과정명은 "+subject+"이고 교육비는 "+fee+"이며 환급금은 "+returnFee+"입니다.");
		}
	}
	public static void main(String args[]){
	Student stu = new Student("장동건", "jspprogram", 500000);
	Student stu2 = new Student(args[0],args[1],args[2]);
	stu.calcReturnFee();
	stu.print();
	stu2.calcReturnFee();
	stu2.print();
}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public int getFee() {
		return fee;
	}
	public void setFee(int fee) {
		this.fee = fee;
	}
	public double getReturnFee() {
		return returnFee;
	}
	public void setReturnFee(double returnFee) {
		this.returnFee = returnFee;
	}
	
}  
