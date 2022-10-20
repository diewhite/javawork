package exception;

import java.util.Scanner;

public class MyExceptionTest {
	public static void main(String[] args) {
		System.out.println("프로그램시작");
		System.out.println("step1");
		System.out.println("step2");
		System.out.println("step3");
		Scanner key = new Scanner(System.in);
		System.out.println("숫자를 입력하세요");
		int num = key.nextInt();
		if(num%2==1) {
			//홀수가 입력되어지면 예외상황으로 간주 - 예외를 인위적으로 발생
			try {
				throw new MyException("홀수가 입력되었습니다.(Error)"); //error 발생 코드	
			}catch(Exception e) {
				System.out.println("예외처리 완료");
				System.out.println("====================");
				System.out.println(e.getMessage());
			}
			
		}else {
			System.out.println("정상step");
		}
	}

}
