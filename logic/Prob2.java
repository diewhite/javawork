package logic;

public class Prob2 {
	public static void main(String[] args) {
		int limit = 50;
		boolean isPrime = false;
		
		for(int i = 2; i<=limit; i++) {
			if(i==2 | i==3 | i==5 | i==7 | i==11) {
				System.out.println(i);
			}else if(i%2==0 | i%3==0 | i%5==0 | i%7==0 | i%11==0){
				/* System.out.println(i+"는(은) 소수가 아닙니다."); */
			}else {
				System.out.println(i);
			}	
		}
		

	}

}
