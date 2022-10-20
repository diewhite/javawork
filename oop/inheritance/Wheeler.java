package oop.inheritance;
public class Wheeler {
	protected int velocity;
	protected String carName;
	protected int wheelNumber;

	public Wheeler() {
		
	}
	public Wheeler(String carName, int velocity, int wheelNumber) {
		super();
		this.velocity = velocity;
		this.carName = carName;
		this.wheelNumber = wheelNumber;
	}

	public void speedUp(int speed) {
		System.out.println(carName+"의 현재 속도는 "+speed+"입니다.");
	}

	public void speedDown(int speed) {
		System.out.println(carName+"의 현재 속도는 "+speed+"입니다.");
	}

	public void stop() {
		velocity = 0;
		System.out.println("정지상태로 속도를 0으로 초기화합니다.");
	}
}