package oop.inheritance;

public class Bike extends Wheeler{
	public Bike() {
		
	}

	public Bike(String carName, int velocity, int wheelNumber) {
		super(carName, velocity, wheelNumber);
	}
	
	public void speedUp(int speed) {
		speed = super.velocity + speed;
		if(speed>40) {
			speed = 40;
			System.out.println(carName+"의 최고속도 위반으로 속도를"+speed+"으로 내립니다.");
		}else {
		super.speedUp(speed);
		}
	}
	
	public void speedDown(int speed) {
		speed = super.velocity - speed;
		if(speed<10) {
			speed = 10;
			System.out.println(carName+"의 최저속도 위반으로 속도를"+speed+"으로 올립니다.");
		}else {
		super.speedDown(speed);
		}
	}
}
