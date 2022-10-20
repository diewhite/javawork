package statement;

import java.util.Random;

//자동 import ctrl+shift+o
public class IfElseTest2 {

	public static void main(String[] args) {
		// 1~100 랜덤수 발생 후 판별
		//[출력]
		// 점수는 ___점 이고, ___
		Random rand = new Random();
		int score = rand.nextInt(100)+1;
		if(score>=90) {
			System.out.println("점수는 "+score+"점 이고, Pass!");
		}else {
			System.out.println("점수는 "+score+"점 이고, Fail!");
		}
		
	}

}
