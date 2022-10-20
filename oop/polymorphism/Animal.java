package oop.polymorphism;

public abstract class Animal {
	int speed;
	double distance;
	
	public Animal() {

	}

	public Animal(int speed) {

		this.speed = speed;
	}

	public abstract void run(int hours);
	
	public double getDistance() {
		return distance;
	}
}
