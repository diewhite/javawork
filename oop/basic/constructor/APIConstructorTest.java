package oop.basic.constructor;

import java.io.FileInputStream;
import java.util.ArrayList;

//API에서 제공하는 클래스의 생성자를 살펴보기
public class APIConstructorTest {

	public static void main(String[] args) throws Exception {
		FileInputStream fs = new FileInputStream("test.txt");
		System.out.println((char)fs.read());
		System.out.println((char)fs.read());
		System.out.println((char)fs.read());
		System.out.println((char)fs.read());
		
		ArrayList list = new ArrayList();
		
		byte[] data = {65,66,67,68,69};
		char[] data2 = new char[] {'0', '1', '2', '3'};
		String data3 = "java";
		
		String str = new String(data3);
		String str2 = new String(data);
		String str3 = new String(data,2,2);
		String str4 = new String(data2);
		
		System.out.println(data3);
		System.out.println(str2);
		System.out.println(str3);
		System.out.println(str4);
	}

}
