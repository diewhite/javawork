package basic;
import java.io.*;
import java.io.File;
public class APITest01 {

	public static void main(String[] args) {
		int i = 100;
		/* 문자열을 처리하기 위한 기능을 사용하기 위해 String클래스를 JVM이 인식하는(찾아서 사용할 수 있는, 미리 약속된) 작업공간에 할당
		 *                                             -------------------------------------------
		 *                                              > heap
		 *                                              
		 * [사용방법]
		 * 할당되는클래스명 변수명 = new heap에 할당해서 사용하고 싶은 클래스명
		 * -----------				or new heap에 할당해서 사용하고 싶은 클래스명(할당할때 필요한 값1, 값2.....)
		 * >데이터타입
		 * 
		 */
		String str = new String();
		StringBuffer str2 = new StringBuffer();
		
		Object obj1 = new Object();
		Object obj2 = new Object();
		System.out.println(obj1);
		System.out.println(obj2);
		Thread t = new Thread();
		//JVM이 기본으로 인식하는 API의 위치는 java.lang패키지와 현재 작업중인 패키지	(현재:basic)
		//=> 기본으로 인식하는 패키지 이외의 패키지는 JVM이 알 수 있도록 처리해야 한다.(import)
		File f = new File("File path");
	}

}
