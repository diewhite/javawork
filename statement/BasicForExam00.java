package statement;

public class BasicForExam00 {

	public static void main(String[] args) {
		// 1부터 1000까지의 홀수의 합, 짝수의 합, 총합을 출력하세요
		int sum=0;
		int oddsum=0;
		int evensum=0;
		for(int i=1; i<=1000; i++) {
			if(i%2!=0) {
				oddsum = oddsum + i;
			}else {
				evensum = evensum + i;
			}
			sum = sum + i;
		}
		System.out.println("1부터 100까지의 총합 : "+sum);
		System.out.println("1부터 100까지의 홀수의 합 : "+oddsum);
		System.out.println("1부터 100까지의 짝수의 합 : "+evensum);
	}

}
