package statement;

public class Chapter4Exam2 {

	public static void main(String[] args) {
		// 1부터 20까지의 정수중에서 2또는3의 배수가 아닌 수의 총 합을 구하시오.
		int Total = 0;
		for(int i = 1; i<=20; i++) {
			if(i%2!=0 && i%3!=0) {
				Total = Total + i;
				System.out.println("Total:"+Total+" i:"+i);
			}
		}
		System.out.println("2또는 3의 배수가 아닌 수의 총 합 :"+Total);
	}

}
