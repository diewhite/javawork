package array;

import java.util.Scanner;

public class ArrayExam01 {

	public static void main(String[] args) {
		//int형 배열변수 myarr를 선언하고 100, 200, 300값을 할당하기
		//2번째 요소(1번 index)값 출력하기
		//선언과 생성을 동시에 작업하기
		
		int[] myarr = new int[3];
		myarr[0] = 100;
		myarr[1] = 200;
		myarr[2] = 300;
		
		System.out.println("2번째 요소의 값 =>"+myarr[1]);

		//int형 배열(myarr2)를 선언하고
		//Scanner로 입력 받은 숫자3개로 각 배열의 요소에 값을 저장하기
		//모든 요소를 출력하기
		Scanner sc = new Scanner(System.in);
		int[] myarr2 = new int[3];
		
		//배열에 값을 저장하는 for문
		for(int i=0; i<myarr2.length; i++) {
			System.out.print("요소"+(i+1)+"의 값을 입력하세요:");
			myarr2[i] = sc.nextInt();			
		}
		//배열의 값을 출력하는 for문
		for(int i=0; i<myarr2.length; i++) {
			System.out.println((i+1)+"번째 요소의 값 => "+myarr2[i]);	
		}
		sc.close();
	}

}
