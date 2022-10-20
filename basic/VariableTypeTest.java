package basic;
//기본형과 참조형의 변수를 비교
public class VariableTypeTest {

	public static void main(String[] args) {
		//기본형변수
		int i = 10;
		int j = 10;
		System.out.println("==================기본형==================");
		if(i==j) {
			System.out.println("기본형같다.");
		}else {
			System.out.println("기본형다르다.");
		}
		
		System.out.println("==================참조형==================");
		String str1 = new String("java");
		String str2 = new String("java");
		//str1 = str2;
		//참조형변수에서 ==은 주소의 비교
		if(str1==str2) {
			System.out.println("참조형같다.");
		}else {
			System.out.println("참조형다르다.");
		}
		//String의 문자열을 비교하는 경우 String이 지원해주는 메소드를 이용해서 비교
		//str1이 참조하는 객체의 저장된 문자열과 str2가 참조하는 객체에 저장된 문자열을 비교
		//같으면 true 다르면 false리턴 : 대소문자비교
		if(str1.equals(str2)) {
			System.out.println("문자열같다.");
		}else {
			System.out.println("문자열다르다.");
		}
	}
	
	
}
