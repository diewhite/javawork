package basic;
import java.util.Random;
public class APIExam02 {

	public static void main(String[] args) {
		//java.util패키지의 Random클래스를 이용해서 작업하기 - Random클래스를 참조하는 변수명 : rand
		// 1. nextInt()메소드를 호출해서 랜덤수를 다음과 같이 출력하기
		// [출력형태]
		// 랜덤수:____
		Random rand = new Random();
		int result = rand.nextInt();
		System.out.println("랜덤수 : "+result);
		
		//1~100까지 랜덤수 출력
		//[출력형태]
		//랜덤수:___
		//nextInt(정수)의 스펙으로 정의된 메소드를 찾아서 내용을 확인해보세요
		result = rand.nextInt(100)+1;
		System.out.println("랜덤수 : "+result);
	}
}
