package api.lang;
//String은 원본이 변경되지 않는다. - 실행결과가 String객체로 생성(상수pool)
//StringBuffer는 원본이 변경된다.(쓰레드처리O - 무겁다)
//StringBuilder같은원리(쓰레드처리X)
public class StringBufferTest {

	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("java programming");
		System.out.println("원본:"+sb);
		
		sb.append("재밌다.");
		System.out.println("원본:"+sb);
		
		sb.insert(2, "자바자바");
		System.out.println("원본:"+sb);
		
		sb.delete(2, 6);//start ~ end-1
		System.out.println("원본:"+sb);
		
		sb.reverse();
		System.out.println("원본:"+sb);
	}

}
