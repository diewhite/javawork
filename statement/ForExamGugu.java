package statement;

import java.util.Scanner;

import oop.basic.MyMethod;

public class ForExamGugu {

	public static void main(String[] args) {
		MyMethod obj = new MyMethod();
		Scanner sc = new Scanner(System.in);
		System.out.print("출력할 단의 숫자를 입력하세요(1~9): ");
		int dan = sc.nextInt();
		obj.printGuGu(dan);
		sc.close();

	}

}
