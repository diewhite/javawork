package basic;
//기본변수에 저장되는 값
public class PrimitiveTypeValueTest {
	public static void main(String[] args) {
		int num = 100;
		num = 200;
		
		final int num2 = 200; //상수는 값을 변경할 수 없다.
		//num2 = 300;
		
		//논리형 - boolean
		boolean boolVal = true;
		
		//정수형 - byte,short,int,long(정수형 리터럴의 기본타입은 int)
		//byte b = 127;
		//    ---  ---
		//    변수  리터럴
		//   byte  int
		byte b = 127;
		//byte b = 128; error상황
		byte b2 = (byte)1248;
		System.out.println("byte변수=>"+b);
		System.out.println("캐스팅된 byte변수=>"+b2);
		short s = 32767;
		//short - 2byte
		System.out.println("short형변수=>"+s);
		//int - 4byte
		int i = 2147483647;
		System.out.println("int형변수=>"+i);
		//long타입의 리터럴은 접미사를 추가 - L, l
		long l = 9223372036854775807l;
		System.out.println("long형변수=>"+l);
		
		//실수형 - float, double소수자리를 표현하기 위한 타입(실수형리터럴의 기본타입 - double)
		double d = 10.5;
		System.out.println("double형변수=>"+d);
		//float의 데이터타입은 접미사 - F, f
		float f = 10.5f;
		System.out.println("float형변수=>"+f);
		
		//char형변수 리터럴 - ''
		char c = 'A';
		System.out.println("char형변수=>"+c);
		
		//String형변수의 리터럴 - String은 참조형이지만 자주사용되므로 기본형으로 사용할 수 있다.
		String str = "참조형인 String의 리터럴은 큰따옴표로 표현";
		System.out.println("String형변수=>"+str);
	}
}
