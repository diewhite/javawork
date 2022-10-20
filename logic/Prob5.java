package logic;
public class Prob5 {
	public static void main(String args[]) {
		Prob5 p5=new Prob5();
		System.out.println(p5.gcd(2,5));
		System.out.println(p5.gcd(5,15));
		System.out.println(p5.gcd(250,30));
	}
	public int gcd(int num1,int num2) {
		int result = 0;
		if(num1>num2) {
			for(int i = 1; i<num1; i++) {
				if(num1%i==0 & num2%i==0) {
					result = i;
				}
			}	
		}else {
			for(int i = 1; i<num2; i++) {
				if(num2%i==0 & num1%i==0) {
					result = i;
				}
			}
		}
		
		return result;
	}


}