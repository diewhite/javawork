package logic;
public class Prob11 {
	public static void main(String[] args) {
		int num1 = 6, num2 = 15;
		System.out.println("클래스 실행 결과 : " + abs(num1, num2));
	}

	private static int abs(int num1, int num2) {
		int result = 0;
		result = num1 - num2;
		if(result<0) {
			result = Math.abs(result);
		}
		return result;
	}
}
