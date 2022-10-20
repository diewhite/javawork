package oop.polymorphism;
public class AnimalTest {

	public static void main(String[] args) {
		Animal dog = new Dog(8);
		Animal chicken = new Chicken(3);
		Chicken cheatableChicken = new Chicken(5);
		
		if(cheatableChicken instanceof Cheatable){
			cheatableChicken.fly();
		}
		
		for(int i=1; i<=3; i++) {
			dog.run(1);
			chicken.run(1);
			cheatableChicken.run(1);
			
			System.out.println(i+"시간 후");
			System.out.println("개의 이동거리="+dog.getDistance());
			System.out.println("닭의 이동거리="+chicken.getDistance());
			System.out.println("날으는 닭의 이동거리="+cheatableChicken.getDistance());
		}
		
		//코드 완성하기
		//1. 클래스다이어그램을 보고 클래스 각각 작성하기
		//2. 조건을 보고 상세하게 내용을 구현하기
		//3. main메소드에 기능을 추가하여 출력결과처럼 나오도록 작성하기
	}
}











