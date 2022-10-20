package array;
//배열을 사용하기 - 1. 배열을 선언, 생성, 초기화하는 방법(기본형타입의 배열)
public class ArrayTest01 {

	public static void main(String[] args) {
		//1. 3개의 int형 데이터를 저장할 수 있는 배열을 참조하는 변수를 선언
		int[] myarr;
		//2. 3개의 int형 데이터를 저장할 수 있는 배열 생성
		myarr = new int[3];
		
		System.out.println(myarr); //할당된 배열의 주소값
		System.out.println(myarr[0]);
		System.out.println(myarr[1]);
		System.out.println(myarr[2]);
//		System.out.println(myarr[3]);
		
		double[] myarr2;
		myarr2 = new double[5];
		System.out.println(myarr2); //할당된 배열의 주소값
		System.out.println(myarr2[0]);
		System.out.println(myarr2[1]);
		System.out.println(myarr2[2]);
		
		//3. 배열의 초기화
		//  => 생성할때 정의한 size만큼 각각의 데이터를 저장할 수 있는 공간이 만들어진다.
		//	   이를 요소라고 하고 각 요소에는 index가 부여된다.
		//	   배열변수[index]=배열변수에 저장할 값
		/*
		 * 	배열의 요소에는 초기값을 주지 않아도 자동으로 초기값이 할당된다.
		 * 	int(정수) - 0
		 * 	double(실수) - 0.0
		 * 	boolean - false
		 * 	참조형 = null
		 */
		
		myarr[2] = 100;
		System.out.println(myarr[0]);
		System.out.println(myarr[1]);
		System.out.println(myarr[2]);
	}

}
