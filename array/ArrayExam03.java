package array;
public class ArrayExam03 {
	public static void main(String[] args) {
		//step1 - 필수
		//배열의 선언과 생성과 초기화를 한 번에 작업하기 - 98,78,88,100,98
		//배열에 저장된 모든 숫자의 총합과 평균을 구하기
		//[출력형태]
		//총합:___
		//평균:___
		
		int[] myarr = new int[] {98,78,88,100,98};
		int sum = 0;
		for(int i=0;i<myarr.length;i++) {
			sum += myarr[i];
		}
		System.out.println("총합:"+sum);
		System.out.println("평균:"+((double)sum/myarr.length));
		System.out.println("==============================================");
		printArray(myarr);
		System.out.println("메소드 호출 결과: "+calc(myarr));
		System.out.println();
		int[] result = makeArray(myarr);
		for (int i = 0; i < result.length; i++) {
			System.out.print(result[i]+" ");
		}
	}
	//step2 - 배열의 합을 계산해서 리턴하는 메소드를 정의
	//배열의 요소를 출력하는 메소드
	//***static을 정리하기 전까지 main메소드에서 call할 메소드를 정의할때는 public뒤에 static을 추가하고 메소드를 정의
	public static void printArray(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
	}
	
	//합을 구해서 리턴하기
	public static int calc(int[] arr) {
		int result = 0;
		for (int i = 0; i < arr.length; i++) {
			result += arr[i];
		}
		return result;
	}
	
	//기존 배열 요소의 값에 100을 더한 값으로 새로운 배열을 만들어서 리턴하기
	public static int[] makeArray(int[] arr) {
		int[] resultArr = new int[arr.length];
		for (int i = 0; i < arr.length; i++) {
			resultArr[i] = arr[i]+100;
		}
		return resultArr;
	}
}
