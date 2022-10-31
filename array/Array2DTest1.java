package array;
//2차원배열을 정의하고 액세스
//=> 자바에서 다차원 배열을 생성하고 참조하는 방법
public class Array2DTest1 {
	public static void main(String[] args) {
		int[][] myarr = new int[3][2];
		
		myarr[0][0] = 100; //myarr이 참조하는 배열의 0번 요소가 참조하는 배열의 0번요소에 100을 할당
		myarr[1][0] = 200;
		myarr[2][0] = 300;
		
		//myarr 의 길이
		System.out.println("배열의 길이=>"+myarr.length);
		//myarr의 0번 요소가 참조하는 배열의 길이
		System.out.println("0번 요소가 참조하는 배열의 길이=>"+myarr[0].length);
		System.out.println("0번 요소가 참조하는 배열의 길이=>"+myarr[1].length);
		System.out.println("0번 요소가 참조하는 배열의 길이=>"+myarr[2].length);
		
		//2차원 배열을 엑세스
		for(int k=0; k<myarr.length; k++) {
			for(int i=0; i<myarr[k].length; i++) {
				System.out.print(myarr[k][i]+"\t");
			}
			System.out.println();
		}

	}

}
