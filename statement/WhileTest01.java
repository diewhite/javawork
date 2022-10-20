package statement;

public class WhileTest01 {

	public static void main(String[] args) {
		int i = 1;
		while(i<=5) {
			System.out.println("자바프로그래밍");
			i++;
		}
		System.out.println(i);
		while(true) {
			if(i>10) {
				//while반복문을 빠져나와라
				break;
			}
			System.out.println(i);
			i++;
		}
	}
}
