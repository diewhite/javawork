package basic;
//자바에서 로컬변수의 특징
public class LocalVariableTest {
	int i = 0; //로컬변수 아니고 필드(멤버변수)
	public static void main(String[] args) {
		int j = 10;//로컬변수
		int num;
		//1. 로컬변수는 사용하기 전에 초기화해야 한다.(=연산자로 값을 할당해야 한다.)
		//System.out.println("로컬변수:"+num);
		int val = 0;
		int result = 0;
		if(j>=10) {
			val = 100;//로컬변수
			//int j = 10; -> j는 사용하는 위치에서 이미 선언되어 있으므로 사용할 수 없다.
			//int result = 0;
		}else {
			for(int k=0;k<=10;k++) { //k변수는 for블럭안에서 선언된 변수이므로 로컬변수
				System.out.println(k);
			}
			int data=10000;
		}
		//2. 로컬변수는 선언된 블럭 내부에서만 사용할 수 있다.
		//	 블럭이 끝나면 메모리에서 해제
		System.out.println("val의 값=>"+val);
		//System.out.println("data의 값=>"+data);
	}

}
