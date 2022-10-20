package statement;

import java.util.Scanner;

public class BasicForExam02 {

	public static void main(String[] args) {
		int first = 0;
		int last = 0;
		int multi = 0;
		int total = 0;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("초기값을 정수로 입력하세요.: ");
		first = sc.nextInt();
		System.out.println();
		System.out.print("마지막값을 정수로 입력하세요.: ");
		last = sc.nextInt();
		System.out.println();
		System.out.print("증가분을 정수로 입력하세요.: ");
		multi = sc.nextInt();
		
		for(int i = first; i<=last; i=i+multi) {
			total = total + i;
		}
		
		if(total>1000) {
			total = total + 2000;
			System.out.println("총합은"+total+"입니다.");
		}else {
			System.out.println("총합은"+total+"입니다.");
		}
		sc.close();
	}

}
