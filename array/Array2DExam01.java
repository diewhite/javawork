package array;

public class Array2DExam01 {

	public static void main(String[] args) {
		int[][] myarr = {{97,88,45,77},
				  {88,77,66,55},
				  {97,78,99,54},
				  {97,34,45,99}};
		//1차원배열 hapdata를 선언하고
		//위의 2차원배열의 각 요소가 참조하는 배열의 합들을 저장하고 출력하기
		
		int[] hapdata = new int[myarr.length];
		
		for(int i=0; i<myarr.length; i++) {
			for(int j=0; j<myarr[i].length; j++) {
				hapdata[i] += myarr[i][j];
			}
			System.out.println("myarr["+i+"] 요소의 합 :"+hapdata[i]);
		}
	}

}
