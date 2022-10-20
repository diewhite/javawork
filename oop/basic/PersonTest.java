package oop.basic;

public class PersonTest {

	public static void main(String[] args) {
		Person p = new Person();		
		p.name = "제이홉";
		//p.age = 28;
		p.addr = "광주";
		System.out.println(p);
		//System.out.println(p.age+","+p.addr+","+p.name);
		
		Person p2 = new Person();		
		p2.name = "RM";
		//p2.age = 27;
		p2.addr = "서울";
		System.out.println(p2);
		//System.out.println(p2.age+","+p2.addr+","+p2.name);
		if(p==p2) {
			System.out.println("같다.");
		}else {
			System.out.println("다르다.");
		}
	}

}
