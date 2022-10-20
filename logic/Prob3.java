package logic;
import java.util.Scanner;

public class Prob3 {

	public static void main(String[] args) {

		Scanner keyboard = new Scanner(System.in);
		System.out.print("1보다 크고 10보다 작은 정수를 입력하세요. : ");
		
		int inputInt = 1;
		int total = 1;
		try {
			inputInt = keyboard.nextInt();
			if(inputInt<1 | inputInt>10) {
				System.out.println("Out of range");
			}else{
				for(int i = 1; i<=inputInt; i++) {
					total = total*i;
				}
				System.out.println(inputInt+"! = "+total);
			}
		keyboard.close();	
		} catch (Exception e) {
			System.err.print("입력하신 값은 Integer Type이 아닙니다.");
			return;
		}
	}
}
