package statement;

import java.util.Scanner;

public class IfExam01 {
	public static void main(String [] args) {
		/*
		 * 2. Scanner를 이용해서 입력 받기
		 * 1) 성별코드 - 1~4까지
		 * 2) 나이 - 1 ~ 100
		 * 3. 2번에서 입력 받은 두 정수값인 성별과 나이를 가지고 판단해서 결과를 출력하기(중첩if를 이용)
		 * 1) 성인남자 : 성별코드 1,3 나이 20세이상
		 * 2) 성인여자 : 성별코드 2,4 나이 20세이상
		 * 3) 청소년여자 :
		 * 4) 청소년남자 :
		 * [출력형태]
		 * 성별입력:______
		 * 나이입력:______
		 * 성인남자(22,1)
		 */
		
		Scanner sc = new Scanner(System.in);
		System.out.print("성별입력: ");
		int gender = sc.nextInt();
		System.out.print("나이입력: ");
		int age = sc.nextInt();
		if(gender==1 || gender==3){
			if(age>=20) {
				System.out.println("성인남자("+age+","+gender+")");
			}else {
				System.out.println("청소년남자("+age+","+gender+")");
			}
		}else {
			if(age>=20) {
				System.out.println("성인여자("+age+","+gender+")");
			}else {
				System.out.println("청소년여자("+age+","+gender+")");
			}
		}
		sc.close();
	}
}
