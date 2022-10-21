package api.lang;

import java.util.ArrayList;
import java.util.Date;
import java.util.Random;

public class ObjectTest01 {

	public static void main(String[] args) {
		Object obj1 = new Object();
		System.out.println(obj1.getClass());
		System.out.println(obj1.hashCode());
		System.out.println(obj1.toString());
		Person2 p = new Person2("BTS",30,"서울");
		System.out.println(p);
		System.out.println(p.toString()); // 대표메소드(생략가능) - toString()
		System.out.println("toString메소드 호출=>"+obj1);
		
		Date d= new Date();
		System.out.println(d);
		
		String str = new String("java");
		System.out.println(str);
		
		ArrayList<String> list = new ArrayList<String>();
		System.out.println(list);
		
		Random rand = new Random();
		System.out.println(rand);
	}

}
