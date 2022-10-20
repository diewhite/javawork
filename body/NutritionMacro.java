package body;

import java.util.Scanner;

public class NutritionMacro {

	public static void main(String[] args) {
		double total;
		Calculator cal = new Calculator();
		Scanner sc = new Scanner(System.in);
		
		System.out.print("하루 총 필요 칼로리 :");
		total = sc.nextDouble();
		cal.cal(total);
		sc.close();
	}
	
}
