package statement;

import java.util.Scanner;

public class IfExam03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("********미니계산기********");
		System.out.println("1.더하기");
		System.out.println("2.곱하기");
		System.out.println("3.빼기");
		System.out.println("4.나누기");
		System.out.print("연산자를 선택하세요. ");
		int select = sc.nextInt();
		if(select<=0 || select>4) {
			System.out.println("잘못입력");
		}else {
			System.out.print("숫자를 입력하세요. ");
			int num1 = sc.nextInt();
			int num2 = sc.nextInt();
			int result = 0;
			if(select==1) {
				result = num1 + num2;
			}else if(select==2) {
				result = num1 * num2;
			}else if(select==3) {
				result = num1 - num2;
			}else {
				result = num1 / num2;
			}
			sc.close();
			System.out.println("계산결과=>"+result);
		}
	}
}
