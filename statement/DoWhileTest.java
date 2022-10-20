package statement;
//while문과 do~while문의 차이점
public class DoWhileTest {

	public static void main(String[] args) {
		int num = 10;
		while(num<10) {
			//while문을 사용하는 경우 조건을 만족하지 않으면 블럭안의 코드가 한번도 실행되지 않는다.
			System.out.println("while을 사용하는 경우:"+num);
			num++;
		}
		num = 10;
		do {
			//do~while문을 사용하는 경우 조건을 만족하지 않아도 블럭안의 코드는 한 번은 실행된다.
			System.out.println("while을 사용하는 경우:"+num);
			num++;
		}while(num<10);
	}

}
