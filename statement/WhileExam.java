package statement;

public class WhileExam {

	public static void main(String[] args) {
		// 1부터 100까지의 합, 짝수합, 홀수합구해서 출력하기 - while
		int j = 1;
		int sum = 0;
		int oddSum = 0;
		int evenSum = 0;
		
		while(j<=100) {
			sum = sum+j;
			if(j%2==1) {
				oddSum=oddSum+j;
			}else{
				evenSum=evenSum+j;
			}
			j++;
		}
		System.out.println("총합:"+sum);
		System.out.println("홀수합:"+oddSum);
		System.out.println("짝수합:"+evenSum);
				
	}

}
