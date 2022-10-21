package api.lang;

//String과 StringBuffer의 성능비교(실행시간)
public class StringStringBufferTest {
	//String으로 객체를 만들어서 제어
	public static void stringCheck(int count) {
		//작업 시작전에 시간체크 - nano초
		long start = System.nanoTime();// -> 1/10억초
		String str = new String("java");
		for(int i = 1; i<count; i++) {
			str = str + ":java";
		}
		long end = System.nanoTime();
		long time = end-start;
		System.out.println("str = str + java");
		System.out.println("수행시간:"+time);
		//System.out.print(str);
	}
	//StringBuffer로 객체를 제어
	public static void stringBufferCheck(int count) {
		long start = System.nanoTime();// -> 1/10억초
		StringBuffer sb = new StringBuffer("java");
		for(int i = 1; i<count; i++) {
			sb.append(":java");
		}
		long end = System.nanoTime();
		long time = end-start;
		System.out.println("sb.append('java')");
		System.out.println("수행시간:"+time);
		//System.out.print(sb);
	}
	public static void main(String[] args) {
		int count = 10000;
		System.out.println("실행횟수:"+count);
		stringCheck(count);
		System.out.println("=======================================");
		stringBufferCheck(count);
	}

}
