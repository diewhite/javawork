package statement;

import java.util.Scanner;

public class BasicForExam03 {

	public static void main(String[] args) {
		int input = 0;
		Scanner sc = new Scanner(System.in);
		System.out.print("2~100사이의 정수를 입력하세요.: ");
		input = sc.nextInt();
		
		if(input==2 | input==3 | input==5 | input==7 | input==11) {
			System.out.println(input+"는(은) 소수입니다.");
		}else if(input%2==0 | input%3==0 | input%5==0 | input%7==0 | input%11==0){
			System.out.println(input+"는(은) 소수가 아닙니다.");

		}else {
			System.out.println(input+"는(은) 소수입니다.");
		}
		sc.close();
	
	}

}
