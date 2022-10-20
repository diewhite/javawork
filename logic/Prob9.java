package logic;
import java.util.Scanner;

public class Prob9 {
 	public static void main(String[] args) {
		int number; 

		Scanner keyboard = new Scanner(System.in);

		System.out.print("숫자를 입력하세요. : ");
		number = keyboard.nextInt();

		for(int i = number ; i>0; i--) {
			for(int j = i; j>0; j--) {
				System.out.print("★");
			}
			System.out.println();
		}
		keyboard.close();
	}

}
