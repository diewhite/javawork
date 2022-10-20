package array;

import java.util.Random;

//참조형배열변수 - 객체를 배열로 관리
public class ArrayTest02 {

	public static void main(String[] args) {
		//스트링 객체 5개 저장할 배열
		//1. 배열선언
		String[] myarr;
		//2. 배열생성
		myarr = new String[3];
		System.out.println(myarr[0]);
		System.out.println(myarr[1]);
		System.out.println(myarr[2]);
		//3. 배열의 초기화
		myarr[0] = new String("java");
		myarr[1] = new String("java");
		myarr[2] = new String("java");
		
		System.out.println(myarr);
		System.out.println(myarr[0]);
		System.out.println(myarr[1]);
		System.out.println(myarr[2]);
		
		
		System.out.println("==============================");
		Random[] myarr2;
		myarr2 = new Random[5];
		System.out.println(myarr2[0]);
		System.out.println(myarr2[1]);
		System.out.println(myarr2[2]);
		
		myarr2[0] = new Random();
		myarr2[1] = new Random();
		myarr2[2] = new Random();
		
		System.out.println(myarr2[0]);
		System.out.println(myarr2[1]);
		System.out.println(myarr2[2]);
		
		int randomVal = myarr2[0].nextInt(100)+1;
		System.out.println(randomVal);
	}

}
