package oop.polymorphism;

public class Chicken extends Animal implements Cheatable{
	
	public Chicken() {
		
	}
	
	public Chicken(int speed) {
		super(speed);
		
	}

	@Override
	public void fly() {
		speed = speed * 2;
		
	}
	
	@Override
	public void run(int hours) {
		double distance = 0;
		distance = speed * hours;
		super.distance += distance;
	}
}
