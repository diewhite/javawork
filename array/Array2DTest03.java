package array;
//가변형배열
//다차원배열에서 배열의 사이즈를 가변으로 할 수 있다.
public class Array2DTest03 {
	public static void main(String[] args) {
		//가변형 배열을 만드는 경우 2차원 배열인 경우 마지막 요소의 사이즈를 명시하지 않는다.
		char[][] myarr = new char[5][];
		myarr[0] = new char[1];
		myarr[1] = new char[2];
		myarr[2] = new char[3];
		myarr[3] = new char[4];
		myarr[4] = new char[5];
		
		//값할당
		for(int row=0; row<myarr.length; row++) {
			for(int i=0;i<myarr[row].length;i++) {
				myarr[row][i]='*';
			}
		}
		
		//2차원 가변배열에서 값을 꺼내서 출력하기
		for(char[] arr:myarr) {
			for(char data:arr) {
				System.out.print(data);
			}
			System.out.println();
		}
	}

}
