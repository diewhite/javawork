package oop.practice2;

public abstract class Border extends Display {
	Display display;
	
	public Border() {
	
	}
	public Border(Display display) {
		this.display = display;
	}
	public Display getDisplay() {
		return display;
	}
	public void setDisplay(Display display) {
		this.display = display;
	}
	@Override
	public String toString() {
		return "Border [display=" + display + "]";
	}

}
