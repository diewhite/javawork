package array;
//배열의 엑세스 - for
public class ArrayTest03 {

	public static void main(String[] args) {
		//배열의 선언과 생성을 동시에
		int[] myarr = new int[10];
		//배열의 사이즈가 저장된 변수 - 마지막 index : 배열의 길이 -1
		System.out.println("배열의 요소의 갯수: "+myarr.length);
		myarr[6] = 200;
		for(int i = 0; i < myarr.length; i++) {
			System.out.println((i+1)+"번째 배열 요소=>"+myarr[i]);
		}
	}

}
