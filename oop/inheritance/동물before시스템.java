package oop.inheritance;

import java.io.FileReader;

//일반화시키기전
public class 동물before시스템{
	public static void main(String[] args) throws Exception{
		뱀before obj = new 뱀before();
		obj.이름 = "방울뱀";
		obj.이동방법 = "기어서";
		obj.이동하다();
		
		코끼리before obj2 = new 코끼리before();
		obj2.이름 = "아기코끼리";
		obj2.이동방법 = "걸어서";
		obj2.이동하다();
		
		FileReader fr = new FileReader("test.txt");
		
	}
}
class 동물before extends Object{
	String 이름;
	String 이동방법;
	public void 이동하다(){
		System.out.println(이동방법+"으로 이동함");
	}
}
class 뱀before extends 동물before{
	int 몸길이;
	public void set몸길이(int 몸길이){
		this.몸길이 = 몸길이;
	}
	
}
class 독수리before extends 동물before{
		int 날개길이;
		public void set날개길이(int 날개길이){
			this.날개길이 = 날개길이;
		}
}
class 코끼리before extends 동물before{
	int 귀크기;
	public void set귀크기(int 귀크기){
		this.귀크기 = 귀크기;
	}
}
class 고래before extends 동물before{
	int 지느러미길이;
	public void set지느러미길이(int 지느러미길이){
		this.지느러미길이 = 지느러미길이;
	}
}