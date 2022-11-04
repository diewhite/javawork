package oop.practice2;

public class SideBorder extends Border {
	char borderChar;
	public SideBorder() {

	}

	public SideBorder(Display display, char borderChar) {
		super(display);
		this.borderChar = borderChar;
	}

	@Override
	int getColumns() {
		return display.getColumns() + 2;
	}

	@Override
	int getRows() {
		return display.getRows();
	}

	@Override
	String getRowText(int row) {
		return borderChar+display.getRowText(row)+borderChar;
	}

	public char getBorderChar() {
		return borderChar;
	}

	public void setBorderChar(char borderChar) {
		this.borderChar = borderChar;
	}

	@Override
	public String toString() {
		return "SideBorder [borderChar=" + borderChar + "]";
	}
}
