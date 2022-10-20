package statement;

public class SwitchTest {

	public static void main(String[] args) {
		int data = 10;
		switch(data) {
			case 10:
				System.out.println("통과");
				break;
			case 20:
				System.out.println("재시험");
				break;
			default :
				System.out.println("기타");
		}
		
		int data2 = 5;
		switch(data2+60) {
			case 'A':
				System.out.println("A");
				break;
			case 'B':
				System.out.println("B");
				break;				
		}
		
		String code = new String("A01"); //jdk6.0부터 추가
		switch(code) {
		case "A01":
			System.out.println("통과");
			break;
		case "A02":
			System.out.println("재시험");
			break;
		}
		/*
		 * double data3 = 10.5; switch(data3) { case "A01": System.out.println("통과");
		 * break; case "A02": System.out.println("재시험"); break; }
		 */
	}
}
