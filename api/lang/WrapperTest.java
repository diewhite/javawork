package api.lang;

public class WrapperTest {
	public static void main(String[] args) {
		//5.0이전 - 기본형을 참조형으로 변환
		Integer intObj = new Integer(10);
		//5.0이후
		Integer intObj2= 10; //5.0이후 버전에는 컴파일러가 자동으로 기본형 int변수를 참조형으로 변환
							 //자동으로 new Integer(10);을 자동으로 실행해서 전달 - AutoBoxing(오토박싱)
		int i = 10;
		test(intObj2);
		test(i);
	}
	public static void test(Object obj) {
		//5.0이전
		Integer in = (Integer)obj;
		int val = in.intValue();
		System.out.println(val);
		
		//5.0이후
		int val2 = (int)obj;//int형변수를 참조형변수에 전달하는 경우
							//컴파일러가 자동으로 객체의 포장을 풀어서 기본형 값으로 변환합니다. - AutoUnboxing(오토언박싱)
		System.out.println(val2);
	}

}
