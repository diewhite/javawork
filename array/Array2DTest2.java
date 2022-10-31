package array;
//2차원배열의 선언과 생성과 초기화를 한 번에 작업하기
public class Array2DTest2 {

	public static void main(String[] args) {
		//1차원 배열 선언 생성 및 초기화
		int[] myarr = {10,20,30,40};
		
		//2차원 배열 선언 생성 및 초기화
		//int[][] myarr = [4][4]

		//다른 언어 처럼 표현(ex. C)
		int[][] myarr2 = {{1,2,3,4},
						  {5,6,7,8},
						  {9,10,11,12},
						  {13,14,15,16}};
		
		//java문법으로 표현
		int[][] myarr3 = new int[][] {{1,2,3,4},
			  						  {5,6,7,8},
			  						  {9,10,11,12},
			  						  {13,14,15,16}};
			  						  
		for(int k=0; k<myarr3.length; k++) {
			for(int i=0; i<myarr3[k].length; i++) {
				System.out.print(myarr3[k][i]+"\t");
			}
			System.out.println();
		}
		System.out.println("============================================================");
		//myarr2,3는 향상된 for
		for(int[] a : myarr3) {
			System.out.println(a+"\t");
			for(int data : a) {
				System.out.print(data+"\t");
			}
			System.out.println();
		}
	}
	}


