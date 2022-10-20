package statement;

import java.util.Scanner;

public class ScoreSwitchExam {

	public static void main(String[] args) {
		//다중if, if문을 중첩
				//0 ~ 59 : F학점
				//60 ~ 69 : D학점
				//70 ~ 79 : C학점
				//80 ~ 89 : B학점
				//90 ~ 100 : A학점
				//110 or -40 : 잘못입력
				//[출력형태]
				//점수:___
				//___학점
				//Scanner클래스를 이용해서 입력받도록 
				//0부터 100까지 입력되면 학점평가, 외의 숫자는 잘못입력으로
				//출력되도록 구현
				//메일로 제출하기
				Scanner key = new Scanner(System.in);
				System.out.print("점수입력:");
				int jumsu = key.nextInt();
				if(jumsu<0 | jumsu>100) {
					System.out.println("잘못입력");
				}else {
					switch(jumsu/10){
						case 10, 9:
							System.out.println("수");
							break;
						
						case 8:
							System.out.println("우");
							break;
							
						case 7:
							System.out.println("미");
							break;
							
						case 6:
							System.out.println("양");
							break;
							
						default:
							System.out.println("가");
					}
				}
				key.close();
	}
}
