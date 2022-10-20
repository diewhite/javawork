package oop.basic;

import java.util.Scanner;

public class Calc {
	public static void main(String[] args) {
		MyMethod m = new MyMethod();
		Scanner key = new Scanner(System.in);
		System.out.println("★★★★★★★미니계산기★★★★★★★");
		System.out.println("1.더하기");
		System.out.println("2.곱하기");
		System.out.println("3.빼기");
		System.out.println("4.나누기");
		System.out.print("연산자를 선택하세요 : ");
		int opr = key.nextInt();
		if(opr<=0 | opr>4) {
			System.out.println("잘못입력");
		}else {
			System.out.print("숫자를 입력하세요:");
			int num1 = key.nextInt();
			int num2 = key.nextInt();
			int result=0;//연산의 결과를 저장할 변수
			result = m.printCalc(opr, num1, num2);
			System.out.println("계산결과=>"+result);
		}
		key.close();
	}
}
