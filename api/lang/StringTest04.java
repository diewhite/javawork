package api.lang;
//String클래스의 데이터변환과 관련된 메소드
public class StringTest04 {
	public static void main(String[] args) {
		String str = "java programming";
		String str2 = new String("java servelt spring android");
		
		//1. String -> byte[]
		byte[] data1 = str.getBytes();
		for(int i=0; i<data1.length; i++) {
			System.out.println(data1[i]);
		}
		
		//2. String -> char[]
		char[] data2 = str.toCharArray();
		for(int i=0; i<data2.length; i++) {
			System.out.println(data2[i]);
		}
		
		//3. String -> String[]
		String[] data3 = str2.split(" ");
		for(int i=0; i<data3.length; i++) {
			System.out.println(data3[i]);
		}
		
		//4. 기본형 -> String
		int i = 100;
		double d = 10.5;
		
		test(String.valueOf(i));
		test(String.valueOf(d));
		test(i+"");
		test(d+"");
	}//end mains
	public static void test(String data) {
		System.out.println("변환된 데이터:"+data);
	}
}
