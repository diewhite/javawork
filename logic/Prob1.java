package logic;
import java.util.Scanner;

public class Prob1 {

	public static void main(String args[]) {

		int inputInt = 0;

		Scanner keyboard = new Scanner(System.in);

		System.out.print("1보다 크고 10보다 작은 정수를 입력하세요. : ");

		try {
			inputInt = keyboard.nextInt();
			if(inputInt>9 | inputInt<1) {
				System.out.println("잘못된 숫자가 입력되었습니다.");
			}else {
				for(int i = 1; i<10; i++) {
					System.out.println(inputInt+" * "+i+" = "+inputInt*i);
				}
			}
			keyboard.close();
		} catch (Exception e) {
			System.err.print("입력하신 값은 Integer Type이 아닙니다.");
			return;
		}
		
	}
}