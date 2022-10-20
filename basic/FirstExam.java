package basic;

public class FirstExam {
	public static void main(String[] args) {
		//국어, 영어, 수학 점수를 임의로 저장하고
		//총점과 평균 출력
		//[출력형식]
		//총점:___
		//평균:___
		int Kor = 100;
		int Eng = 90;
		int Math = 80;
		int Sum = Kor + Eng + Math;
		int Avg = Sum/3;
		System.out.println("총점 : "+Sum);
		System.out.println("평균 : "+Avg);		
	}
}
