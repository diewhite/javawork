package oop.basic;
//인스턴스변수와 클래스변수의 비교
public class StaticDemo {
	int num;
	static int staticNum;
	public StaticDemo() {
		num++; // num = num+1
		staticNum++; // staticNum = StaticNum+1;
	}
	public void display() {
		System.out.println("display: "+num+","+staticNum);
	}
}
