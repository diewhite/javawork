package api.util;

import java.util.ArrayList;

public class ArrayTest01 {
	public static void main(String[] args) {
		//1.ArrayList생성 - Generic으로 ArrayList에 저장되는 요소의 타입을 명시
		//	=> ArrayList와 같은 자료구조 안에 저장될 데이터의 타입을 제한(기본형 Wrapper클래스 타입을 명시)
		ArrayList<Integer> v = new ArrayList<Integer>();
		v.add(1);
		System.out.println("현재 리스트에 저장된 요소의 갯수=>"+v.size());

		
		for(int i=1; i<=10; i++) {
			v.add(i);
		}
		System.out.println("현재 리스트에 저장된 요소의 갯수=>"+v.size());

		int size = v.size();//v.size()를 for문에 직접 넣을 경우 예를들어 10만건의 데이터가 있으면 메소드가 10만번 생성된다(leak memory)
		System.out.println("리스트에 저장된 0번 요소=>"+v.get(0));
		for(int i=0; i<size; i++) {
			System.out.println(v.get(i));
		}
		
		System.out.println("=====================향상된 for문(foreach)==============================");
		//향상된 for문은 collection을 탐색할때 편리하게 사용
		for(int data : v) {
			System.out.println(data);
		}

	}

}
