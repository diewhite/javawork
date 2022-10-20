package oop.polymorphism;

public class SNSSender extends Sender {
	int length;
	public SNSSender(String name,int length){
		super(name);
		this.length = length;
	}
	public int getLength() {
		return length;
	}
	public void setLength(int length) {
		this.length = length;
	}
	public void send(){
		System.out.println(name+"전송이 완료 - 인스타그램,트위터,페이스북과 같은 SNS로 전송합니다. ");
	}
}
