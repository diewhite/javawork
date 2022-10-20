package logic;
public class Prob7 {
	public static void main(String args[]) {
		
		int n = 15; 
		int sum = 0;
		int val = 0;
		for(int i = 0; i<n; i++) {
			for(int j=0; j<=i; j++) {
				val++;
			}
			if(val>1) {
				val--;
			}
			System.out.print(val+" ");
			sum = sum + val;
		}
		 		 
		System.out.println( n + "번째까지의 합 : " + sum);
	}

}
