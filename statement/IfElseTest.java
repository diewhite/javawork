package statement;

import java.util.Scanner;

//자동 import ctrl+shift+o
public class IfElseTest {

	public static void main(String[] args) {
		// 점수 입력 받고 90이상은 pass, 나머지는 fail
		//[출력]
		// 점수는 ___점 이고, ___
		Scanner key = new Scanner(System.in);
		System.out.print("점수 입력: ");
		int score = key.nextInt();
		if(score>=90) {
			System.out.println("점수는 "+score+"점 이고, Pass!");
		}else {
			System.out.println("점수는 "+score+"점 이고, Fail!");
		}
		key.close();
	}

}
