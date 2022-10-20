package statement;

import java.util.Scanner;

public class IfExam02 {

	public static void main(String[] args) {
		//1.Scanner를 이용해서 숫자를 입력 받아 5의 배수인지 체크하세요
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자입력: ");
		int num1 = sc.nextInt();
		if(num1%5==0) {
			System.out.println("입력한 숫자는 5의 배수입니다.");
		}else {
			System.out.println("입력한 숫자는 5의 배수가 아닙니다.");
		}
		System.out.println();
		
		
		//2. 숫자를 Scanner 를 통해 입력 받은 후 양수와 음수를 판별한 후 짝수와 홀수를 구분할 수 있도록 작업하세요
		System.out.print("숫자를 입력하세요: ");
		int num2 = sc.nextInt();
			if(num2%2==0) {
				System.out.println("양수이면서 짝수");
			}else if(num2%2==1){
				System.out.println("양수이면서 홀수");
			}else{
			System.out.println("음수");
			}
		System.out.println();
			
		//3. 점수를 Scanner클래스를 이용해서 입력 받은 후 수~가 까지 판단해서 출력하세요.
		System.out.print("점수 입력: ");
		int score = sc.nextInt();
		if(score<=100 && score>=90) {
			System.out.println("수");
		}else if(score<90 && score<=80) {
			System.out.println("우");
		}else if(score<80 && score<=70) {
			System.out.println("미");
		}else if(score<70 && score<=60) {
			System.out.println("양");
		}else if(score<60 && score<=0) {
			System.out.println("가");
		}else {
			System.out.println("잘못입력");
		}
			sc.close();
	}

}
