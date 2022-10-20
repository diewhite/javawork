package oop.basic;

public class CallByTest {

	public static void main(String[] args) {
		int i = 10;
		int[] myarr = {100, 200, 300, 400};
		System.out.println("**********변경전**********");
		display(i, myarr);
		change(i, myarr);
		System.out.println("**********변경후**********");
		display(i, myarr);
	}
	//값을 변경하는 메소드
	public static void change(int num, int[] intArr) {
		num = 100;
		intArr[1] = 2000;
	}
	//값을 출력하는 메소드
	public static void display(int num, int[] intArr) {
		System.out.println("int형매개변수 num=>"+num);
		System.out.println("int[]매개변수 inArry가 참조하는 배열의 각 요소의 값");
		for (int i = 0; i < intArr.length; i++) {
			System.out.print(intArr[i]+"\t");
		}
		System.out.println();
	}
}
