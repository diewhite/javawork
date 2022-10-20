package array;

import java.util.Random;

public class ArrayExam02 {
	public static void main(String[] args) {
		//1부터 45까지의 랜덤수 5개를 저장할 수 있는 배열을 생성하고 작업하세요
		// - Random객체를 이용해서 랜덤수 5개 배열에 저장하기
		// - 완료되면 배열에 저장된 값 출력하기
		// - 배열을 액세스하기 위해 for문을 이용하기
		// - 값을 저장하기 위한 for와 값을 출력하기 위한 for문 각각 작업하기
		//[출력형식]
		//11 20 45 44 10
		
		int[] randArry = new int[5];
		Random rand = new Random();
		for(int i=0; i<randArry.length; i++) {
			 randArry[i] = rand.nextInt(45)+1;
		}
		for (int i = 0; i < randArry.length; i++) {
			System.out.print(randArry[i]+" ");
		}
		
	}

}
