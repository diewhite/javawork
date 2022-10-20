package oop.basic;
//메소드 정의 연습하기
public class MyMethod {
	//1. 100과 200을 더한 결과를 sysout으로 출력하는 메소드를 정의
	//	 메소드명 : printCalc()
	//	 매개변수 : 없음
	//	 리턴값 : 없음
	public void printCalc() {
		int result = 0;
		result = 100+200;
		System.out.println("결과:"+result);
	}
	
	//2. 두 숫자를 입력 받아서 더한 결과를 sysout으로 출력하는 메소드 정의
	//	 메소드명 : printCalc()
	//	 매개변수 : int형 값 2개
	//	 리턴값 : 없음
	
	public void printCalc(int num1, int num2) {
		int result = num1 + num2;
		System.out.println("결과:"+result);
	}
	//printCalc메소드는 오버로딩된 메소드이다.
	//위에 선언된 printCalc메소드와 매개변수 갯수가 다르므로 오버로딩
	public void printCalc(int num1, int num2, int num3, int num4) {
		int result = num1 + num2 + num3 + num4;
		System.out.println("결과:"+result);
	}
	//printCalc메소드는 오버로딩된 메소드이다.
	//위에 선언된 printCalc메소드와 매개변수 타입이 다르므로 오버로딩
	public void printCalc(float num1, float num2) {
		float result = num1 + num2;
		System.out.println("결과:"+result);
	}
	//매개변수 갯수와 그 타입으로 오버로딩을 판단하므로 변수명은 의미없다.
	/*
	 * public void printCalc(int num1, int num2) { int result = num1 + num2;
	 * System.out.println("결과:"+result); }
	 */
	
	//오버로딩은 매개변수에 대한 내용이므로 리턴타입이 달라진다고 오버로딩이 되지 않는다.*
	/*
	 * public int printCalc(float num1, float num2) {
	 * float result = num1 + num2;
	 * System.out.println("결과:"+result);
	 * return 0;
	 * }
	 */
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public void printGuGu(int dan) {
		if(dan<1 || dan>9) {
			System.out.println("1~9까지만 입력가능");
		}else {
			System.out.println("단: "+dan);
			for(int i=1; i<10; i++) {
				System.out.println(dan+"X"+i+"="+dan*i);
			}
		}
	}
	public void printGuGu() {
		for(int row=2;row<=9;row++) {
			for(int i=1;i<=9;i++) {
				System.out.print(row+"*" +i +"="+(row*i)+"\t");	
			}
			System.out.println();
		}
	}
	public int printCalc(int opr, int num1, int num2) {
		int result = 0;
		if(opr==1) {
			result = num1+num2;
		}else if(opr==2) {
			result = num1*num2;
		}else if(opr==3) {
			result = num1-num2;
		}else if(opr==4) {
			result = num1/num2;
		}
		return result;
	}
}
