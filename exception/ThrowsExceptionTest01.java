package exception;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class ThrowsExceptionTest01 {
	//1. 예외가 발생하는 곳에서 예외에 대한 처리를 구현
	public void test(String fileName) {
		try {
			FileReader fr = new FileReader(fileName);  //에러발생코드
		}catch(FileNotFoundException e) {
			System.out.println("예외처리작업...완료");
		}
		
	}
	//2. 예외를 발생하는 곳에서 처리하지 않고 호출한 곳에서 위치
	public void test2(String fileName) throws FileNotFoundException{
		FileReader fr = new FileReader(fileName);//에러발생코드
	}
	public static void main(String[] args){
		ThrowsExceptionTest01 obj = new ThrowsExceptionTest01();
		//1. 예외를 예외가 발생한 메소드 내부에서 처리하고 있으므로 호출한 곳에서는 예외 발생 유무를 확인할 수 없다.

		//test메소드를 A위치에서 호출 - A클래스의 a메소드에서 호출한다 가정
		obj.test("test2.txt");
		
		//test메소드를 B위치에서 호출 - B클래스의 b메소드에서 호출한다 가정
		obj.test("test2.txt");
		System.out.println("============================================");

		//test2 메소드를 A위치에서 호출 - A클래스의 a메소드에서 호출한다 가정
		try {
			obj.test2("test2.txt");
		}catch(FileNotFoundException e) {
			System.out.println("파일명을 다시 선택하세요.====> 선택할 수 있도록 코드 작성");
		}
		
		//test2 메소드를 B위치에서 호출 - B클래스의 b메소드에서 호출한다 가정
		try {
			obj.test2("test2.txt");
		}catch(FileNotFoundException e) {
			System.out.println("text.txt로 작업할 수 있도록 정의");
		}
	}

}
