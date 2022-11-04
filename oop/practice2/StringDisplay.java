package oop.practice2;

public class StringDisplay extends Display {
	String string;

	public StringDisplay() {
	}

	public StringDisplay(String string) {
		this.string = string;
	}

	@Override
	int getColumns() {
		return string.getBytes().length;
	}

	@Override
	int getRows() {
		return 1;
	}

	@Override
	String getRowText(int row) {
		if(row==0) {
			return string;
		}else {
			return null;
		}
	}

	public String getString() {
		return string;
	}

	public void setString(String string) {
		this.string = string;
	}

	@Override
	public String toString() {
		return "StringDisplay [string=" + string + "]";
	}
	
}
