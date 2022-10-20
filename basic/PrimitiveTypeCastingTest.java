package basic;
//기본형데이터의 타입캐스팅(형변환)
public class PrimitiveTypeCastingTest {
	public static void main(String[] args) {
		//1. 자동형변환 - JVM내부에서 자동으로 변환
		byte b = 100;
		short s = b; //형변환
		int i = s;
		long l = i;
		float f = l;
		double d = f;
		
		
		//char c2 = i;
		
				
		//2. 명시적형변환
		double result = (double)10/3;
		System.out.println("결과=>"+result);
		System.out.println((double)30/100*100+"%");
		
		
		char c = 'a';
		int data = c;
		System.out.println(data);
		
		int data2 = 97;
		char c2 = (char) data2;
		System.out.println(c2);
		System.out.println((char)112);
	}
}
