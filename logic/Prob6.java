package logic;
import java.util.Scanner;
public class Prob6 { 

	public static void main(String[] args) {
		
		int number = 0;
		int count = 0;
		int sum = 0;
		
		Scanner keyboard = new Scanner(System.in); 
		System.out.print("양의 정수를 입력하세요. : ");
		number = keyboard.nextInt();
		count = 1000/number;
		for(int i=1; i<=1000; i++) {
			if(i%number==0) {
				sum+=i;
			}
		}
		keyboard.close();
		
		
		
		System.out.println(number + "의 배수 개수 = " + count);
		System.out.println(number + "의 배수 합= " + sum);

	}

}
