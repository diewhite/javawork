package statement;

import java.util.Random;
import java.util.Scanner;

public class Exam150p {

	public static void main(String[] args) {
		// user, com 가위바위보
		Scanner user = new Scanner(System.in);
		System.out.print("가위(1), 바위(2), 보(3) 중에 하나를 입력하세요 :");
		int userVal = user.nextInt();
		Random com = new Random();
		int comVal = com.nextInt(3)+1;
		switch(userVal) {
		case 1:
			System.out.println("당신은 가위를 냈습니다.");
			break;
		
		case 2:
			System.out.println("당신은 바위를 냈습니다.");
			break;
		
		case 3:
			System.out.println("당신은 보를 냈습니다.");
			break;
		
		default:
			System.out.println("반칙");
		}
		
		switch(comVal) {
		case 1:
			System.out.println("com은 가위를 냈습니다.");
			break;
		
		case 2:
			System.out.println("com은 바위를 냈습니다.");
			break;
		
		default:
			System.out.println("com은 보를 냈습니다.");
						
		}
				
		int result = userVal - comVal;		
		switch(result) {
		case 0 :
			System.out.println("비겼습니다");
			break;
		case 1,-2 :
			System.out.println("이겼습니다");
			break;
		case -1,2 :
			System.out.println("졌습니다");
			break;
		default:
			System.out.println("무효");
		}
		user.close();
	}
}
