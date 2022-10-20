package logic;
public class Prob7_T {
    
	public static void main(String args[]) {
		
		int n = 15; 
		int sum = 0;
		
		 
		/*  여기에 프로그램을 완성하십시오. */
		for (int i = 1; i <= n; i++) {
			int temp = 1; 
			for (int j = 0; j < i; j++) {
				temp += j;
			}
			sum += temp;
			System.out.print(temp+" ");
		}
		
		System.out.println( n + "번째까지의 합 : " + sum);
	}

}
