package oop.practice2;

public class FullBorder extends Border {
	public FullBorder() {
		
	}
	
	public FullBorder(Display display) {
		super(display);
	}

	@Override
	int getColumns() {
		return display.getColumns();
	}

	@Override
	int getRows() {
		return display.getRows()+2;
	}

	@Override
	String getRowText(int row) {
		if(row==0 | row==display.getRows()+1) {
			return '+'+makeLine('-',getColumns())+'+'; 
		}else {
			return '|'+display.getRowText(0)+'|';
		}
	}
	String makeLine(char ch, int count) {
		String result = "";
		for(int i=0;i<count;i++) {
			result += ch;
		}
		return result;
	}

}
