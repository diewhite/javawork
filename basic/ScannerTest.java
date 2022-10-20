package basic;
import java.util.Scanner;
//Scanner클래스의 기본사용방법 => 키보드를 통해 직접 입력 받은 데이터를 사용
//=> 표준입력으로 입력된 값을 읽어서 리턴하는 기능을 제공
//   -----
//    > 키보드입력
//표준출력 - 화면출력(console로 출력) : System.out
//표준입력 - 키보드로 입력 : System.in
public class ScannerTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("키보드로 문장을 입력하세요: ");
		//전체 문장을 읽어서 리턴
		String line = sc.nextLine();
		System.out.println("입력한 문장은: "+line);
		
		System.out.print("키보드로 입력하세요: ");
		//단어읽기
		//=> spacebar나 엔터키가 입력되기 전까지 입력한 한 단어를 읽어서 리턴
		String data = sc.next();
		System.out.println("입력한 문장은: "+data);
		
		System.out.print("숫자입력: ");
		//정수읽기
		int num = sc.nextInt();
		System.out.println("입력한 정수는: "+num);
		
		sc.close();
	}

}
