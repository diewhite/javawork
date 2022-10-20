package exception;

import java.util.InputMismatchException;
import java.util.Scanner;

//예외처리 - try~catch~finally
// => 예외가 발생하거나 발생하지 않거나 반드시 실행해야 하는 코드가 있는 경우 finally 블럭에 정의한다.
public class ExceptionTest04 {
	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);
		try{
			//예외발생 가능성이 있는 코드
			System.out.println("시작");
			System.out.println("숫자입력");
			int num1 = key.nextInt();
			System.out.println("나눌 숫자를 입력");
			int num2 = key.nextInt();
			System.out.println("결과=>"+(num1/num2));
			System.out.println("종료");
		}catch(ArithmeticException e) {
			System.out.println("0으로 나눴음. 다시 입력");
		}catch(InputMismatchException e) {
			System.out.println("숫자가 아니야 다시 입력");
		}catch(Exception e){
			System.out.println("예외발생");
			System.out.println("예외메시지=>"+e.getMessage());
			e.printStackTrace();//개발시에 가장 많이 사용 - 여러 클래스를 이용해서 작업하는 경우 오류를 추적해서 어떤 클래스에서 예외가 발생하는지 확인하는 것이 가능
		}finally{
			System.out.println("무조건 실행되는 코드 ------------------ 자원반납");
		}
	}

}
