package basic;
//논리연산자 - &&, ||
public class OprTest04 {

	public static void main(String[] args) {
		int num1 = 200;
		System.out.println("작업시작");
		String str = null;
		//str.length(); - 오류가 발생하는 문장
		//System.out.println(num1>100 | str.length()>0);
		//||연산자는 or연산의 특성을 이용해서 첫 번째 항이 true이면 ||연산자 뒤의 항은 검사하지 않고 넘어간다.
		System.out.println(num1>100 || str.length()>0);
		//System.out.println(num1<100 || str.length()>0);
		
		//&&
		System.out.println(num1<100 && str.length()>0);
		//System.out.println(num1<100 & str.length()>0);
	}

}
