package oop.polymorphism;
//객체의 형변환
class Super{
	String name = "장동건";
	public void display() {
		System.out.println("super의 display");
	}
}
class Sub extends Super{
	String name = "BTS";
	public void display() {
		System.out.println("sub의 display");
	}
	public void test() {
		System.out.println("sub의 test");
	}
}
class Sub2{
	
}
public class RefTypeCastingTest {
	public static void main(String[] args) {
		System.out.println("1. Super타입의 참조변수로 Super객체를 접근");
		Super obj1 = new Super();
		obj1.display();
		System.out.println(obj1.name);
		
		System.out.println("***********************************************");
		System.out.println("2. Sub타입의 참조변수로 Sub객체를 접근");
		Sub obj2 = new Sub();
		System.out.println(obj2.name);
		obj2.display();//상속관계에서 오버라이딩된 메소드가 있는 경우 오버라이딩된 메소드가 우선 실행
		
		System.out.println("***********************************************");
		System.out.println("3. Super타입의 참조변수로 Sub객체를 접근");
		Super obj3 = new Sub();
		System.out.println(obj3.name);
		//obj3이 참조하는 객체가 Sub타입인 경우 명시적으로 캐스팅가능
		((Sub)obj3).test();
		obj3.display();
		
		System.out.println("***********************************************");
		System.out.println("4. Sub타입의 참조변수로 Super객체를 접근");
//		Sub obj4 = new Super();  - 실제 사용되는 변수타입에 대한 정보가 생성되는 객체에 없기 때문에 객체를 참조할 수 없다.
		
		System.out.println("***********************************************");
		System.out.println("5. Sub변수 = Super객체를 참조하는 변수 -------- X");
		//명시적으로 캐스팅하면 컴파일러는 속일 수 있으나 (상속관계에 있어야만 속는다.)
		//obj1이 참조하는 객체가 Super이므로 런타임시 오류가 발생
//		Sub obj5 = (Sub)obj1;//Sub obj5 = new Super()
		
		System.out.println("***********************************************");
		Sub obj6 = (Sub)obj3;
		//obj3이 참조하는 객체가 sub타입이면 true를 반환
		//obj3이 Sub타입이 아니면 false를 반환
		System.out.println((Sub)obj3);
		if(obj3 instanceof Sub) {
			System.out.println("Sub타입");
		}else {
			System.out.println("Sub타입아님");
		}
		
		if(obj1 instanceof Sub) {
			System.out.println("Sub타입");
		}else {
			System.out.println("Sub타입아님");
		}
	}

}
