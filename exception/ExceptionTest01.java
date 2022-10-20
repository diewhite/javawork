package exception;

import java.io.FileReader;
import java.util.InputMismatchException;
import java.util.Scanner;

class Super{
	
}
class Sub extends Super{
	
}
//프로그램 실행 중에 예외가 발생하는 상황
public class ExceptionTest01 {
	public static void main(String[] args) {
		//1. 개발자가 실수할 수 있는 부분***************
		System.out.println("**********프로그램시작**********");
		//System.out.println(10/0); //ArithmeticException
		//System.out.println(args[0]); //ArrayIndexOutOfBoundsException
		String str = null; //참조변수가 null인데 메소드를 호출해서 사용하는 경우(많음)
		//str.length(); //NullPointerException
		Super obj = new Super();
		//Sub obj1 = (Sub)obj; //사용할 수 없는 타입으로 강제 변환하는 경우 - ClassCastException

		//2. 외부요인이나 사용자의 실수로 예외가 발생하는 경우
		Scanner key = new Scanner(System.in);
		System.out.print("값을 입력하세요: ");
		int data = key.nextInt();
		System.out.println("입력하신 데이터는=> "+data);

		//3. API에서 문법적으로 예외처리를 요구하는 경우
		//RuntimeException의 하위 Exception은 문법적으로 예외에 대한 처리를 하지 않아도 되지만 하도록 하자
		//나머지 Exception은 예외처리를 하지 않으면 컴파일오류가 발생하므로 해야함
		//FileReader fr = new FileReader("test.txt");
		Integer.parseInt("100");
	}
}