package oop.inheritance;

public class Truck extends Wheeler {
	public Truck() {
		
	}

	public Truck(String carName, int velocity, int wheelNumber) {
		super(carName, velocity, wheelNumber);
	}
	
	public void speedUp(int speed) {
		speed = super.velocity + (speed * 5);
		if(speed>100) {
			speed = 100;
			System.out.println(carName+"의 최고속도 위반으로 속도를"+speed+"으로 내립니다.");
		}else {
		super.speedUp(speed);
		}
	}
	
	public void speedDown(int speed) {
		speed = super.velocity - (speed * 5);
		if(speed<50) {
			speed = 50;
			System.out.println(carName+"의 최저속도 위반으로 속도를"+speed+"으로 올립니다.");	
		}else {
			super.speedDown(speed);
		}
		
	}
	
}
