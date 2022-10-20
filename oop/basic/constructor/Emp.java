package oop.basic.constructor;

public class Emp {
	String id;
	String name;
	int baseSalary;
	
	public Emp() {
		
	}

	public double getSalary(double bonus) {
		double salary = 0;
		salary = baseSalary + baseSalary * bonus;
		return salary;
	}
	
	public String toString() {
		String toString = name+"("+id+") 사원의 기본급은 "+baseSalary+"입니다.";
		return toString;
	}
	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getBaseSalary() {
		return baseSalary;
	}

	public void setBaseSalary(int baseSalary) {
		this.baseSalary = baseSalary;
	}
	
	
}
