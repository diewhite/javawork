package oop.inheritance;

public class BeverageTest {
	public static void main(String[] args) {
//        System.out.println("타입:커피,이름:아메리카노,가격:2500");
//        System.out.println("타입:커피,이름:카페라뗴,가격:2700");
//        System.out.println("타입:커피,이름:카푸치노,가격:300");
        Coffee obj1 = new Coffee("커피",2500,"아메리카노");
        Coffee obj2 = new Coffee("커피",2700,"카페라떼");
        Coffee obj3 = new Coffee("커피",300,"카푸치노");
        obj1.print();
        obj2.print();
        obj3.print();
        
        
	}

}
