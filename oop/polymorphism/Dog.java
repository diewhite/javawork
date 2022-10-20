package oop.polymorphism;

public class Dog extends Animal{

	public Dog() {
		
	}
	
	public Dog(int speed) {
		super(speed);
		
	}

	@Override
	public void run(int hours) {
		double distance = 0;
		distance = (speed/2) * hours;
		super.distance += distance;
	}
}
