package oop.practice1;

public class Tv {
	String color;
	boolean power;
	int channel;
	
	public Tv() {
		color = "black";
		power = false;
		channel = 0;
	}

	public void Tv() {
		
	}
	public void power() {
		if(power!=true) {
			power = true;
		}else {
			power = false;
		}
	}
	public void channelUp() {
		channel = channel + 1;
	}
	public void channelDown() {
		channel = channel - 1;
	}
	public void print() {
		System.out.println("color : "+color+"\tpower : "+power+"\tchannel : "+channel);
	}
	
	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public boolean isPower() {
		return power;
	}

	public void setPower(boolean power) {
		this.power = power;
	}

	public int getChannel() {
		return channel;
	}

	public void setChannel(int channel) {
		this.channel = channel;
	}
	
	
	
}
