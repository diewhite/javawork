package statement;

import java.util.Scanner;

public class BasicForExam01 {

	public static void main(String[] args) {
		int input = 0;
		Scanner sc = new Scanner(System.in);
		System.out.print("1보다 크고 10보다 작은 정수를 입력하세요. :");
		input = sc.nextInt();
		if(input>1 & input<10) {
			for(int i = 1; i<10; i++) {
				System.out.println(input+" * "+i+" = "+ input*i);
			}
			}else{
				System.out.println("잘못된 숫자가 입력되었습니다.");
			}
		sc.close();
		}
	}
