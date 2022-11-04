package oop.practice2;

public abstract class Display {
	abstract int getColumns();
	abstract int getRows();
	abstract String getRowText(int row);
	final void show() {
		int rows = getRows();
		for (int i=0; i<rows; i++) {
			System.out.println(getRowText(i));
		}
	}
}
