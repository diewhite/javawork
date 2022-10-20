package statement;

import java.util.Random;
import java.util.Scanner;

public class Chapter4Exam14 {

	public static void main(String[] args) {
		// 1~100 사이의 임의의 값을 얻어서 answer에 저장한다.
		Random rand = new Random();
		int answer = rand.nextInt(100)+1;
		int input = 0;	//사용자입력을 저장할 공간
		int count = 0;	//시도횟수를 세기위한 변수
		
		//화면으로 부터 사용자입력을 받기 위해서 Scanner클래스 사용
		Scanner s = new Scanner(System.in);
		
		do {
			count++;
			System.out.print("1과 100사이의 값을 입력하세요 :");
			input = s.nextInt(); //입력받은 값을 변수 input에 저장한다.
			if(input<answer) {
				System.out.println("더 높은 숫자입니다.");
			}else if(input>answer){
				System.out.println("더 낮은 숫자입니다.");
			}else {
				System.out.println("정답입니다.");
				System.out.println(count+"번 만에 맞추셨습니다.");
				break;
			}
		}while(true); //무한반복문
		s.close();
	}

}
