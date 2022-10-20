package exception;
//예외처리		-	try~catch
public class ExceptionTest02 {
	public static void main(String[] args) {
		try {
			//예외발생 가능성이 있는 코드
			System.out.println("try블럭시작");
			//Exception이 발생하면 더이상 try블럭안의 코드를 실행하지 않고 catch블럭으로 이동
			System.out.println(10/2);
			//System.out.println(args[0]);
			System.out.println("try종료");
		}catch(Exception e) {
			//예외가 발생하면 처리할 문장을 구현
			System.out.println("예외발생");
		}
	}

}
