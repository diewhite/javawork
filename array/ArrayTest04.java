package array;
//배열의 선언과 생성과 초기화를 한 번에 작업하기
public class ArrayTest04 {

	public static void main(String[] args) {
		int[] myarr = {10, 20, 30, 40, 50}; //,로 구분된 갯수와 동일한 요소의 배열이 만들어진다.
		
		for(int i=0; i<myarr.length; i++) {
			System.out.println(myarr[i]);
		}
		System.out.println("배열의 길이=> "+myarr.length);
		
		//자바답게 생성
		int[] myarr2 = new int[] {10, 20, 30, 40, 50, 60, 70, 80};
		for(int i=0; i<myarr2.length; i++) {
			System.out.println(myarr2[i]);
		}
		System.out.println("배열의 길이=> "+myarr2.length);
		
		//String
		String[] myarr3 = {"java", "oracle", "javascript", "mongodb"};
		for(int i=0; i<myarr3.length; i++) {
			System.out.println(myarr3[i]);
		}
		System.out.println("배열의 길이=> "+myarr3.length);
	}

}
