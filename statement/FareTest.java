package statement;

import java.util.Scanner;

public class FareTest {

	public static void main(String[] args) {
		int menu=0;
		int qty=0;
		int liter=0;
		double tax = 0;
		double total = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("---------menu---------");
		System.out.println("1. 가정용 (liter당 50원)");
		System.out.println("2. 상업용 (liter당 45원)");
		System.out.println("3. 공업용 (liter당 30원)");
		System.out.println("----------------------");
		
		
		System.out.print("메뉴를 선택하세요=>");
		menu = sc.nextInt();
		System.out.println("----------------------");
		System.out.print("사용량을 입력하세요=>");
		qty = sc.nextInt();
		System.out.println("----------------------");
		System.out.println("======================");
		System.out.println("사용자 코드:"+menu);
		switch(menu) {
			case 1:
				liter = 50;
				tax = (liter*qty)*0.05;
				total =liter*qty+tax;				
				System.out.println("사용 요금:"+(liter*qty));
				System.out.println("총수도 요금:"+total);
			case 2:
				liter = 45;
				tax = (liter*qty)*0.05;
				total =liter*qty+tax;				
				System.out.println("사용 요금:"+(liter*qty));
				System.out.println("총수도 요금:"+total);
			case 3:
				liter = 30;
				tax = (liter*qty)*0.05;
				total =liter*qty+tax;				
				System.out.println("사용 요금:"+(liter*qty));
				System.out.println("총수도 요금:"+total);
		}
		System.out.println("======================");
		sc.close();
	}

}
